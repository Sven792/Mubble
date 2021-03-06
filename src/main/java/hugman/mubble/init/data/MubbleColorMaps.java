package hugman.mubble.init.data;

import hugman.mubble.init.MubbleBlocks;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;

@OnlyIn(Dist.CLIENT)
public class MubbleColorMaps extends BlockColors
{
	public static void registerBlockColors(final ColorHandlerEvent.Block event)
	{
		final BlockColors blockColors = event.getBlockColors();
		
		blockColors.register((p_210225_0_, p_210225_1_, p_210225_2_, p_210225_3_) ->
        {
            return p_210225_1_ != null && p_210225_2_ != null ? BiomeColors.getGrassColor(p_210225_1_, p_210225_2_) : GrassColors.get(0.5D, 1.0D);
        }, MubbleBlocks.GREEN_HILL_GRASS_BLOCK);
		blockColors.register((p_210232_0_, p_210232_1_, p_210232_2_, p_210232_3_) ->
		{
			return FoliageColors.getSpruce();
		}, MubbleBlocks.SPRUCE_LEAF_PILE);
		blockColors.register((p_210232_0_, p_210232_1_, p_210232_2_, p_210232_3_) ->
		{
			return FoliageColors.getBirch();
		}, MubbleBlocks.BIRCH_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return p_210229_1_ != null && p_210229_2_ != null ? BiomeColors.getFoliageColor(p_210229_1_, p_210229_2_) : FoliageColors.getDefault();
		}, MubbleBlocks.OAK_LEAF_PILE, MubbleBlocks.JUNGLE_LEAF_PILE, MubbleBlocks.ACACIA_LEAF_PILE, MubbleBlocks.DARK_OAK_LEAF_PILE, MubbleBlocks.PALM_LEAVES, MubbleBlocks.PALM_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 16104984;
		}, MubbleBlocks.AUTUMN_OAK_LEAVES, MubbleBlocks.AUTUMN_OAK_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 15768259;
		}, MubbleBlocks.PINK_CHERRY_OAK_LEAVES, MubbleBlocks.PINK_CHERRY_OAK_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 15786729;
		}, MubbleBlocks.WHITE_CHERRY_OAK_LEAVES, MubbleBlocks.WHITE_CHERRY_OAK_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 15218768;
		}, MubbleBlocks.RED_PRESS_GARDEN_LEAVES, MubbleBlocks.RED_PRESS_GARDEN_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 15771888;
		}, MubbleBlocks.PINK_PRESS_GARDEN_LEAVES, MubbleBlocks.PINK_PRESS_GARDEN_LEAF_PILE);
		blockColors.register((p_210229_0_, p_210229_1_, p_210229_2_, p_210229_3_) ->
		{
			return 10622269;
		}, MubbleBlocks.SCARLET_LEAVES, MubbleBlocks.SCARLET_LEAF_PILE);
	}
	
	public static void registerItemColors(final ColorHandlerEvent.Item event)
	{
		final ItemColors itemColors = event.getItemColors();

		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
	        return GrassColors.get(0.5D, 1.0D);
	    }, MubbleBlocks.OAK_LEAF_PILE, MubbleBlocks.SPRUCE_LEAF_PILE, MubbleBlocks.BIRCH_LEAF_PILE, MubbleBlocks.JUNGLE_LEAF_PILE, MubbleBlocks.ACACIA_LEAF_PILE, MubbleBlocks.DARK_OAK_LEAF_PILE, MubbleBlocks.PALM_LEAVES, MubbleBlocks.PALM_LEAF_PILE, MubbleBlocks.GREEN_HILL_GRASS_BLOCK);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
	        return 16104984;
	    }, MubbleBlocks.AUTUMN_OAK_LEAVES, MubbleBlocks.AUTUMN_OAK_LEAF_PILE);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
	        return 15768259;
	    }, MubbleBlocks.PINK_CHERRY_OAK_LEAVES, MubbleBlocks.PINK_CHERRY_OAK_LEAF_PILE);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
	        return 15786729;
	    }, MubbleBlocks.WHITE_CHERRY_OAK_LEAVES, MubbleBlocks.WHITE_CHERRY_OAK_LEAF_PILE);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
			return 15218768;
		}, MubbleBlocks.RED_PRESS_GARDEN_LEAVES, MubbleBlocks.RED_PRESS_GARDEN_LEAF_PILE);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
			return 15771888;
		}, MubbleBlocks.PINK_PRESS_GARDEN_LEAVES, MubbleBlocks.PINK_PRESS_GARDEN_LEAF_PILE);
		itemColors.register((p_210235_1_, p_210235_2_) ->
		{
	        return 10622269;
	    }, MubbleBlocks.SCARLET_LEAVES, MubbleBlocks.SCARLET_LEAF_PILE);
	}
}