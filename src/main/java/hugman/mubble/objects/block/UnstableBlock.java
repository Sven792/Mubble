package hugman.mubble.objects.block;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnstableBlock extends Block
{	
    public UnstableBlock(Block.Properties builder)
    {
        super(builder);
    }
    
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
    	if(!worldIn.isRemote && worldIn.rand.nextInt(8) == 0)
    	{
    		worldIn.destroyBlock(pos, false);
    	}
    }
}
