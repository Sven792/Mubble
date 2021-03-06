package hugman.mubble.objects.world.dimension;

import hugman.mubble.init.MubbleBlocks;
import hugman.mubble.init.world.MubbleBiomes;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.EndGenerationSettings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PermafrostDimension extends Dimension
{	
	public PermafrostDimension(World worldIn, DimensionType typeIn) 
	{
		super(worldIn, typeIn, 0.1F);
	}
	
	@Override
	public ChunkGenerator<?> createChunkGenerator()
	{
		EndGenerationSettings settings = ChunkGeneratorType.FLOATING_ISLANDS.createSettings();
		settings.setDefaultBlock(MubbleBlocks.PERMAROCK.getDefaultState());
		settings.setDefaultFluid(Blocks.WATER.getDefaultState());
		
		BiomeProvider biomeProvider = BiomeProviderType.FIXED.create(BiomeProviderType.FIXED.getConfig(world.getWorldInfo()).setBiome(MubbleBiomes.PERMAFROST));
		
		return ChunkGeneratorType.FLOATING_ISLANDS.create(this.world, biomeProvider, settings);
	}
	
	@Override
	public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid)
	{
		return null;
	}
	
	@Override
	public BlockPos findSpawn(int posX, int posZ, boolean checkValid)
	{
		return null;
	}
	
	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks)
	{
		return 0.5f;
	}
	
	@Override
	public boolean isSurfaceWorld()
	{
		return false;
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public Vec3d getFogColor(float celestialAngle, float partialTicks)
	{
		return new Vec3d((double)0.03F, (double)0.2F, (double)0.2F);
	}
	
	@Override
	public boolean canRespawnHere()
	{
		return false;
	}
	
	@Override
	public boolean doesXZShowFog(int x, int z)
	{
		return true;
	}
	
	@Override
	public WorldBorder createWorldBorder()
	{
		return new WorldBorder()
		{
			public double getCenterX()
			{
				return super.getCenterX() / 8.0D;
			}

			public double getCenterZ()
			{
				return super.getCenterZ() / 8.0D;
			}
		};
	}
}