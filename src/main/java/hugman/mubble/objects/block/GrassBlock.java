package hugman.mubble.objects.block;

import java.util.Random;

import hugman.mubble.init.MubbleBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class GrassBlock extends net.minecraft.block.GrassBlock
{
	/* Extension for missing features */
    public GrassBlock(Properties builder)
    {
        super(builder);
    }
    
    private static boolean func_196383_a(IWorldReader p_196383_0_, BlockPos p_196383_1_)
    {
        BlockPos blockpos = p_196383_1_.up();
        return p_196383_0_.getLight(blockpos) >= 4 || p_196383_0_.getBlockState(blockpos).getOpacity(p_196383_0_, blockpos) < p_196383_0_.getMaxLightLevel();
    }

    private static boolean func_196384_b(IWorldReader p_196384_0_, BlockPos p_196384_1_)
    {
        BlockPos blockpos = p_196384_1_.up();
        return p_196384_0_.getLight(blockpos) >= 4 && p_196384_0_.getBlockState(blockpos).getOpacity(p_196384_0_, blockpos) < p_196384_0_.getMaxLightLevel() && !p_196384_0_.getFluidState(blockpos).isTagged(FluidTags.WATER);
    }
    
    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random)
    {
    	Block dirt = Blocks.DIRT;
    	if(this == MubbleBlocks.GREEN_HILL_GRASS_BLOCK) dirt = MubbleBlocks.GREEN_HILL_DIRT;
        if (!worldIn.isRemote)
        {
           if (!worldIn.isAreaLoaded(pos, 3)) return;
           if (!func_196383_a(worldIn, pos))
           {
              worldIn.setBlockState(pos, dirt.getDefaultState());
           }
           else
           {
              if (worldIn.getLight(pos.up()) >= 9)
              {
                 for(int i = 0; i < 4; ++i)
                 {
                    BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (!worldIn.isBlockPresent(blockpos))
                    {
                       return;
                    }
                    if (worldIn.getBlockState(blockpos).getBlock() == dirt && func_196384_b(worldIn, blockpos))
                    {
                       worldIn.setBlockState(blockpos, this.getDefaultState());
                    }
                 }
              }
           }
        }
    }
    
    public IItemProvider getItemDropped(BlockState state, World worldIn, BlockPos pos, int fortune)
    {
    	if(this == MubbleBlocks.GREEN_HILL_GRASS_BLOCK) return MubbleBlocks.GREEN_HILL_DIRT;
    	else return Blocks.DIRT;
    }
}