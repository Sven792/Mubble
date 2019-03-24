package hugman.mod.init;

import java.util.ArrayList;
import java.util.List;

import hugman.mod.objects.block.BlockBalloon;
import hugman.mod.objects.block.BlockBrick;
import hugman.mod.objects.block.BlockButtonWood;
import hugman.mod.objects.block.BlockCandyCanePillar;
import hugman.mod.objects.block.BlockCloud;
import hugman.mod.objects.block.BlockCrops;
import hugman.mod.objects.block.BlockDirectional;
import hugman.mod.objects.block.BlockDoor;
import hugman.mod.objects.block.BlockEmpty;
import hugman.mod.objects.block.BlockEmptyDrops;
import hugman.mod.objects.block.BlockFalling;
import hugman.mod.objects.block.BlockFence;
import hugman.mod.objects.block.BlockFenceGate;
import hugman.mod.objects.block.BlockFlower;
import hugman.mod.objects.block.BlockFlowerCloud;
import hugman.mod.objects.block.BlockFlowerGold;
import hugman.mod.objects.block.BlockFlowerPotato;
import hugman.mod.objects.block.BlockGrass;
import hugman.mod.objects.block.BlockHugeMushroom;
import hugman.mod.objects.block.BlockKoretato;
import hugman.mod.objects.block.BlockLeaves;
import hugman.mod.objects.block.BlockMushroom;
import hugman.mod.objects.block.BlockNote;
import hugman.mod.objects.block.BlockPressurePlate;
import hugman.mod.objects.block.BlockPuyo;
import hugman.mod.objects.block.BlockQuestion;
import hugman.mod.objects.block.BlockRotatedPillar;
import hugman.mod.objects.block.BlockRotating;
import hugman.mod.objects.block.BlockSapling;
import hugman.mod.objects.block.BlockSimple;
import hugman.mod.objects.block.BlockSlab;
import hugman.mod.objects.block.BlockSlabVertical;
import hugman.mod.objects.block.BlockSpring;
import hugman.mod.objects.block.BlockStairs;
import hugman.mod.objects.block.BlockTetris;
import hugman.mod.objects.block.BlockTetrisGlass;
import hugman.mod.objects.block.BlockTrapDoor;
import hugman.mod.objects.block.BlockUltimatumPortal;
import hugman.mod.objects.block.BlockWall;
import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MubbleBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block VANADIUM_BLOCK = new BlockSimple("vanadium_block", Properties.from(Blocks.DIAMOND_BLOCK));
    public static final Block VANADIUM_ORE = new BlockSimple("vanadium_ore", Properties.from(Blocks.DIAMOND_ORE));
    public static final Block PALM_PLANKS = new BlockSimple("palm_planks", Properties.from(Blocks.OAK_PLANKS));
    public static final Block PALM_SAPLING = new BlockSapling("palm");
    public static final Block PALM_LOG = new BlockRotatedPillar("palm_log", Properties.from(Blocks.OAK_LOG));
    public static final Block STRIPPED_PALM_LOG = new BlockRotatedPillar("stripped_palm_log", Properties.from(MubbleBlocks.PALM_LOG));
    public static final Block PALM_WOOD = new BlockRotatedPillar("palm_wood", Properties.from(MubbleBlocks.PALM_LOG));
    public static final Block STRIPPED_PALM_WOOD = new BlockRotatedPillar("stripped_palm_wood", Properties.from(MubbleBlocks.PALM_WOOD));
    public static final Block PALM_LEAVES = new BlockLeaves("palm");
    public static final Block PALM_PRESSURE_PLATE = new BlockPressurePlate("palm");
    public static final Block PALM_TRAPDOOR = new BlockTrapDoor("palm");
    public static final Block PALM_BUTTON = new BlockButtonWood("palm");
    public static final Block PALM_STAIRS = new BlockStairs("palm", MubbleBlocks.PALM_PLANKS);
    public static final Block PALM_SLAB = new BlockSlab("palm", MubbleBlocks.PALM_PLANKS);
    public static final Block PALM_FENCE_GATE = new BlockFenceGate("palm");
    public static final Block PALM_FENCE = new BlockFence("palm");
    public static final Block PALM_DOOR = new BlockDoor("palm");
    
    public static final Block WHITE_BRICKS = new BlockSimple("white_bricks", Properties.from(Blocks.BRICKS));
    public static final Block LIGHT_GRAY_BRICKS = new BlockSimple("light_gray_bricks", Properties.from(Blocks.BRICKS));
    public static final Block GRAY_BRICKS = new BlockSimple("gray_bricks", Properties.from(Blocks.BRICKS));
    public static final Block BLACK_BRICKS = new BlockSimple("black_bricks", Properties.from(Blocks.BRICKS));
    public static final Block BROWN_BRICKS = new BlockSimple("brown_bricks", Properties.from(Blocks.BRICKS));
    public static final Block RED_BRICKS = new BlockSimple("red_bricks", Properties.from(Blocks.BRICKS));
    public static final Block ORANGE_BRICKS = new BlockSimple("orange_bricks", Properties.from(Blocks.BRICKS));
    public static final Block YELLOW_BRICKS = new BlockSimple("yellow_bricks", Properties.from(Blocks.BRICKS));
    public static final Block LIME_BRICKS = new BlockSimple("lime_bricks", Properties.from(Blocks.BRICKS));
    public static final Block GREEN_BRICKS = new BlockSimple("green_bricks", Properties.from(Blocks.BRICKS));
    public static final Block CYAN_BRICKS = new BlockSimple("cyan_bricks", Properties.from(Blocks.BRICKS));
    public static final Block LIGHT_BLUE_BRICKS = new BlockSimple("light_blue_bricks", Properties.from(Blocks.BRICKS));
    public static final Block BLUE_BRICKS = new BlockSimple("blue_bricks", Properties.from(Blocks.BRICKS));
    public static final Block PURPLE_BRICKS = new BlockSimple("purple_bricks", Properties.from(Blocks.BRICKS));
    public static final Block MAGENTA_BRICKS = new BlockSimple("magenta_bricks", Properties.from(Blocks.BRICKS));
    public static final Block PINK_BRICKS = new BlockSimple("pink_bricks", Properties.from(Blocks.BRICKS));
    
    public static final Block WHITE_BRICK_STAIRS = new BlockStairs("white_brick", MubbleBlocks.WHITE_BRICKS);
    public static final Block LIGHT_GRAY_BRICK_STAIRS = new BlockStairs("light_gray_brick", MubbleBlocks.LIGHT_GRAY_BRICKS);
    public static final Block GRAY_BRICK_STAIRS = new BlockStairs("gray_brick", MubbleBlocks.GRAY_BRICKS);
    public static final Block BLACK_BRICK_STAIRS = new BlockStairs("black_brick", MubbleBlocks.BLACK_BRICKS);
    public static final Block BROWN_BRICK_STAIRS = new BlockStairs("brown_brick", MubbleBlocks.BROWN_BRICKS);
    public static final Block RED_BRICK_STAIRS = new BlockStairs("red_brick", MubbleBlocks.RED_BRICKS);
    public static final Block ORANGE_BRICK_STAIRS = new BlockStairs("orange_brick", MubbleBlocks.ORANGE_BRICKS);
    public static final Block YELLOW_BRICK_STAIRS = new BlockStairs("yellow_brick", MubbleBlocks.YELLOW_BRICKS);
    public static final Block LIME_BRICK_STAIRS = new BlockStairs("lime_brick", MubbleBlocks.LIME_BRICKS);
    public static final Block GREEN_BRICK_STAIRS = new BlockStairs("green_brick", MubbleBlocks.GREEN_BRICKS);
    public static final Block CYAN_BRICK_STAIRS = new BlockStairs("cyan_brick", MubbleBlocks.CYAN_BRICKS);
    public static final Block LIGHT_BLUE_BRICK_STAIRS = new BlockStairs("light_blue_brick", MubbleBlocks.LIGHT_BLUE_BRICKS);
    public static final Block BLUE_BRICK_STAIRS = new BlockStairs("blue_brick", MubbleBlocks.BLUE_BRICKS);
    public static final Block PURPLE_BRICK_STAIRS = new BlockStairs("purple_brick", MubbleBlocks.PURPLE_BRICKS);
    public static final Block MAGENTA_BRICK_STAIRS = new BlockStairs("magenta_brick", MubbleBlocks.MAGENTA_BRICKS);
    public static final Block PINK_BRICK_STAIRS = new BlockStairs("pink_brick", MubbleBlocks.PINK_BRICKS);
    
    public static final Block WHITE_BRICK_SLAB = new BlockSlab("white_brick", MubbleBlocks.WHITE_BRICKS);
    public static final Block LIGHT_GRAY_BRICK_SLAB = new BlockSlab("light_gray_brick", MubbleBlocks.LIGHT_GRAY_BRICKS);
    public static final Block GRAY_BRICK_SLAB = new BlockSlab("gray_brick", MubbleBlocks.GRAY_BRICKS);
    public static final Block BLACK_BRICK_SLAB = new BlockSlab("black_brick", MubbleBlocks.BLACK_BRICKS);
    public static final Block BROWN_BRICK_SLAB = new BlockSlab("brown_brick", MubbleBlocks.BROWN_BRICKS);
    public static final Block RED_BRICK_SLAB = new BlockSlab("red_brick", MubbleBlocks.RED_BRICKS);
    public static final Block ORANGE_BRICK_SLAB = new BlockSlab("orange_brick", MubbleBlocks.ORANGE_BRICKS);
    public static final Block YELLOW_BRICK_SLAB = new BlockSlab("yellow_brick", MubbleBlocks.YELLOW_BRICKS);
    public static final Block LIME_BRICK_SLAB = new BlockSlab("lime_brick", MubbleBlocks.LIME_BRICKS);
    public static final Block GREEN_BRICK_SLAB = new BlockSlab("green_brick", MubbleBlocks.GREEN_BRICKS);
    public static final Block CYAN_BRICK_SLAB = new BlockSlab("cyan_brick", MubbleBlocks.CYAN_BRICKS);
    public static final Block LIGHT_BLUE_BRICK_SLAB = new BlockSlab("light_blue_brick", MubbleBlocks.LIGHT_BLUE_BRICKS);
    public static final Block BLUE_BRICK_SLAB = new BlockSlab("blue_brick", MubbleBlocks.BLUE_BRICKS);
    public static final Block PURPLE_BRICK_SLAB = new BlockSlab("purple_brick", MubbleBlocks.PURPLE_BRICKS);
    public static final Block MAGENTA_BRICK_SLAB = new BlockSlab("magenta_brick", MubbleBlocks.MAGENTA_BRICKS);
    public static final Block PINK_BRICK_SLAB = new BlockSlab("pink_brick", MubbleBlocks.PINK_BRICKS);
    
    public static final Block WHITE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("white_brick", MubbleBlocks.WHITE_BRICKS);
    public static final Block LIGHT_GRAY_BRICK_VERTICAL_SLAB = new BlockSlabVertical("light_gray_brick", MubbleBlocks.LIGHT_GRAY_BRICKS);
    public static final Block GRAY_BRICK_VERTICAL_SLAB = new BlockSlabVertical("gray_brick", MubbleBlocks.GRAY_BRICKS);
    public static final Block BLACK_BRICK_VERTICAL_SLAB = new BlockSlabVertical("black_brick", MubbleBlocks.BLACK_BRICKS);
    public static final Block BROWN_BRICK_VERTICAL_SLAB = new BlockSlabVertical("brown_brick", MubbleBlocks.BROWN_BRICKS);
    public static final Block RED_BRICK_VERTICAL_SLAB = new BlockSlabVertical("red_brick", MubbleBlocks.RED_BRICKS);
    public static final Block ORANGE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("orange_brick", MubbleBlocks.ORANGE_BRICKS);
    public static final Block YELLOW_BRICK_VERTICAL_SLAB = new BlockSlabVertical("yellow_brick", MubbleBlocks.YELLOW_BRICKS);
    public static final Block LIME_BRICK_VERTICAL_SLAB = new BlockSlabVertical("lime_brick", MubbleBlocks.LIME_BRICKS);
    public static final Block GREEN_BRICK_VERTICAL_SLAB = new BlockSlabVertical("green_brick", MubbleBlocks.GREEN_BRICKS);
    public static final Block CYAN_BRICK_VERTICAL_SLAB = new BlockSlabVertical("cyan_brick", MubbleBlocks.CYAN_BRICKS);
    public static final Block LIGHT_BLUE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("light_blue_brick", MubbleBlocks.LIGHT_BLUE_BRICKS);
    public static final Block BLUE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("blue_brick", MubbleBlocks.BLUE_BRICKS);
    public static final Block PURPLE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("purple_brick", MubbleBlocks.PURPLE_BRICKS);
    public static final Block MAGENTA_BRICK_VERTICAL_SLAB = new BlockSlabVertical("magenta_brick", MubbleBlocks.MAGENTA_BRICKS);
    public static final Block PINK_BRICK_VERTICAL_SLAB = new BlockSlabVertical("pink_brick", MubbleBlocks.PINK_BRICKS);
    
    public static final Block WHITE_BRICK_WALL = new BlockWall("white_brick", MubbleBlocks.WHITE_BRICKS);
    public static final Block LIGHT_GRAY_BRICK_WALL = new BlockWall("light_gray_brick", MubbleBlocks.LIGHT_GRAY_BRICKS);
    public static final Block GRAY_BRICK_WALL = new BlockWall("gray_brick", MubbleBlocks.GRAY_BRICKS);
    public static final Block BLACK_BRICK_WALL = new BlockWall("black_brick", MubbleBlocks.BLACK_BRICKS);
    public static final Block BROWN_BRICK_WALL = new BlockWall("brown_brick", MubbleBlocks.BROWN_BRICKS);
    public static final Block RED_BRICK_WALL = new BlockWall("red_brick", MubbleBlocks.RED_BRICKS);
    public static final Block ORANGE_BRICK_WALL = new BlockWall("orange_brick", MubbleBlocks.ORANGE_BRICKS);
    public static final Block YELLOW_BRICK_WALL = new BlockWall("yellow_brick", MubbleBlocks.YELLOW_BRICKS);
    public static final Block LIME_BRICK_WALL = new BlockWall("lime_brick", MubbleBlocks.LIME_BRICKS);
    public static final Block GREEN_BRICK_WALL = new BlockWall("green_brick", MubbleBlocks.GREEN_BRICKS);
    public static final Block CYAN_BRICK_WALL = new BlockWall("cyan_brick", MubbleBlocks.CYAN_BRICKS);
    public static final Block LIGHT_BLUE_BRICK_WALL = new BlockWall("light_blue_brick", MubbleBlocks.LIGHT_BLUE_BRICKS);
    public static final Block BLUE_BRICK_WALL = new BlockWall("blue_brick", MubbleBlocks.BLUE_BRICKS);
    public static final Block PURPLE_BRICK_WALL = new BlockWall("purple_brick", MubbleBlocks.PURPLE_BRICKS);
    public static final Block MAGENTA_BRICK_WALL = new BlockWall("magenta_brick", MubbleBlocks.MAGENTA_BRICKS);
    public static final Block PINK_BRICK_WALL = new BlockWall("pink_brick", MubbleBlocks.PINK_BRICKS);
    
    public static final Block BLUNITE = new BlockSimple("blunite", Properties.from(Blocks.STONE));
    public static final Block CARBONITE = new BlockSimple("carbonite", Properties.from(Blocks.STONE));
    public static final Block BLUNITE_STAIRS = new BlockStairs(MubbleBlocks.BLUNITE);
    public static final Block CARBONITE_STAIRS = new BlockStairs(MubbleBlocks.CARBONITE);
    public static final Block BLUNITE_SLAB = new BlockSlab(MubbleBlocks.BLUNITE);
    public static final Block CARBONITE_SLAB = new BlockSlab(MubbleBlocks.CARBONITE);
    public static final Block BLUNITE_VERTICAL_SLAB = new BlockSlabVertical(MubbleBlocks.BLUNITE);
    public static final Block CARBONITE_VERTICAL_SLAB = new BlockSlabVertical(MubbleBlocks.CARBONITE);
    public static final Block BLUNITE_WALL = new BlockWall(MubbleBlocks.BLUNITE);
    public static final Block CARBONITE_WALL = new BlockWall(MubbleBlocks.CARBONITE);
    public static final Block POLISHED_BLUNITE = new BlockSimple("polished_blunite", Properties.from(MubbleBlocks.BLUNITE));
    public static final Block POLISHED_CARBONITE = new BlockSimple("polished_carbonite", Properties.from(MubbleBlocks.CARBONITE));
    public static final Block POLISHED_BLUNITE_STAIRS = new BlockStairs(MubbleBlocks.POLISHED_BLUNITE);
    public static final Block POLISHED_CARBONITE_STAIRS = new BlockStairs(MubbleBlocks.POLISHED_CARBONITE);
    public static final Block POLISHED_BLUNITE_SLAB = new BlockSlab(MubbleBlocks.POLISHED_BLUNITE);
    public static final Block POLISHED_CARBONITE_SLAB = new BlockSlab(MubbleBlocks.POLISHED_CARBONITE);
    public static final Block POLISHED_BLUNITE_VERTICAL_SLAB = new BlockSlabVertical(MubbleBlocks.POLISHED_BLUNITE);
    public static final Block POLISHED_CARBONITE_VERTICAL_SLAB = new BlockSlabVertical(MubbleBlocks.POLISHED_CARBONITE);
    
    public static final Block WHITE_DARK_PRISMARINE = new BlockSimple("white_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block LIGHT_GRAY_DARK_PRISMARINE = new BlockSimple("light_gray_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block GRAY_DARK_PRISMARINE = new BlockSimple("gray_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block BLACK_DARK_PRISMARINE = new BlockSimple("black_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block BROWN_DARK_PRISMARINE = new BlockSimple("brown_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block RED_DARK_PRISMARINE = new BlockSimple("red_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block ORANGE_DARK_PRISMARINE = new BlockSimple("orange_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block YELLOW_DARK_PRISMARINE = new BlockSimple("yellow_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block LIME_DARK_PRISMARINE = new BlockSimple("lime_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block GREEN_DARK_PRISMARINE = new BlockSimple("green_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block CYAN_DARK_PRISMARINE = new BlockSimple("cyan_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block LIGHT_BLUE_DARK_PRISMARINE = new BlockSimple("light_blue_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block BLUE_DARK_PRISMARINE = new BlockSimple("blue_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block PURPLE_DARK_PRISMARINE = new BlockSimple("purple_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block MAGENTA_DARK_PRISMARINE = new BlockSimple("magenta_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    public static final Block PINK_DARK_PRISMARINE = new BlockSimple("pink_dark_prismarine", Properties.from(Blocks.DARK_PRISMARINE));
    
    public static final Block WHITE_DARK_PRISMARINE_STAIRS = new BlockStairs("white_dark_prismarine", MubbleBlocks.WHITE_DARK_PRISMARINE);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE_STAIRS = new BlockStairs("light_gray_dark_prismarine", MubbleBlocks.LIGHT_GRAY_DARK_PRISMARINE);
    public static final Block GRAY_DARK_PRISMARINE_STAIRS = new BlockStairs("gray_dark_prismarine", MubbleBlocks.GRAY_DARK_PRISMARINE);
    public static final Block BLACK_DARK_PRISMARINE_STAIRS = new BlockStairs("black_dark_prismarine", MubbleBlocks.BLACK_DARK_PRISMARINE);
    public static final Block BROWN_DARK_PRISMARINE_STAIRS = new BlockStairs("brown_dark_prismarine", MubbleBlocks.BROWN_DARK_PRISMARINE);
    public static final Block RED_DARK_PRISMARINE_STAIRS = new BlockStairs("red_dark_prismarine", MubbleBlocks.RED_DARK_PRISMARINE);
    public static final Block ORANGE_DARK_PRISMARINE_STAIRS = new BlockStairs("orange_dark_prismarine", MubbleBlocks.ORANGE_DARK_PRISMARINE);
    public static final Block YELLOW_DARK_PRISMARINE_STAIRS = new BlockStairs("yellow_dark_prismarine", MubbleBlocks.YELLOW_DARK_PRISMARINE);
    public static final Block LIME_DARK_PRISMARINE_STAIRS = new BlockStairs("lime_dark_prismarine", MubbleBlocks.LIME_DARK_PRISMARINE);
    public static final Block GREEN_DARK_PRISMARINE_STAIRS = new BlockStairs("green_dark_prismarine", MubbleBlocks.GREEN_DARK_PRISMARINE);
    public static final Block CYAN_DARK_PRISMARINE_STAIRS = new BlockStairs("cyan_dark_prismarine", MubbleBlocks.CYAN_DARK_PRISMARINE);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE_STAIRS = new BlockStairs("light_blue_dark_prismarine", MubbleBlocks.LIGHT_BLUE_DARK_PRISMARINE);
    public static final Block BLUE_DARK_PRISMARINE_STAIRS = new BlockStairs("blue_dark_prismarine", MubbleBlocks.BLUE_DARK_PRISMARINE);
    public static final Block PURPLE_DARK_PRISMARINE_STAIRS = new BlockStairs("purple_dark_prismarine", MubbleBlocks.PURPLE_DARK_PRISMARINE);
    public static final Block MAGENTA_DARK_PRISMARINE_STAIRS = new BlockStairs("magenta_dark_prismarine", MubbleBlocks.MAGENTA_DARK_PRISMARINE);
    public static final Block PINK_DARK_PRISMARINE_STAIRS = new BlockStairs("pink_dark_prismarine", MubbleBlocks.PINK_DARK_PRISMARINE);
    
    public static final Block WHITE_DARK_PRISMARINE_SLAB = new BlockSlab("white_dark_prismarine", MubbleBlocks.WHITE_DARK_PRISMARINE);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE_SLAB = new BlockSlab("light_gray_dark_prismarine", MubbleBlocks.LIGHT_GRAY_DARK_PRISMARINE);
    public static final Block GRAY_DARK_PRISMARINE_SLAB = new BlockSlab("gray_dark_prismarine", MubbleBlocks.GRAY_DARK_PRISMARINE);
    public static final Block BLACK_DARK_PRISMARINE_SLAB = new BlockSlab("black_dark_prismarine", MubbleBlocks.BLACK_DARK_PRISMARINE);
    public static final Block BROWN_DARK_PRISMARINE_SLAB = new BlockSlab("brown_dark_prismarine", MubbleBlocks.BROWN_DARK_PRISMARINE);
    public static final Block RED_DARK_PRISMARINE_SLAB = new BlockSlab("red_dark_prismarine", MubbleBlocks.RED_DARK_PRISMARINE);
    public static final Block ORANGE_DARK_PRISMARINE_SLAB = new BlockSlab("orange_dark_prismarine", MubbleBlocks.ORANGE_DARK_PRISMARINE);
    public static final Block YELLOW_DARK_PRISMARINE_SLAB = new BlockSlab("yellow_dark_prismarine", MubbleBlocks.YELLOW_DARK_PRISMARINE);
    public static final Block LIME_DARK_PRISMARINE_SLAB = new BlockSlab("lime_dark_prismarine", MubbleBlocks.LIME_DARK_PRISMARINE);
    public static final Block GREEN_DARK_PRISMARINE_SLAB = new BlockSlab("green_dark_prismarine", MubbleBlocks.GREEN_DARK_PRISMARINE);
    public static final Block CYAN_DARK_PRISMARINE_SLAB = new BlockSlab("cyan_dark_prismarine", MubbleBlocks.CYAN_DARK_PRISMARINE);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE_SLAB = new BlockSlab("light_blue_dark_prismarine", MubbleBlocks.LIGHT_BLUE_DARK_PRISMARINE);
    public static final Block BLUE_DARK_PRISMARINE_SLAB = new BlockSlab("blue_dark_prismarine", MubbleBlocks.BLUE_DARK_PRISMARINE);
    public static final Block PURPLE_DARK_PRISMARINE_SLAB = new BlockSlab("purple_dark_prismarine", MubbleBlocks.PURPLE_DARK_PRISMARINE);
    public static final Block MAGENTA_DARK_PRISMARINE_SLAB = new BlockSlab("magenta_dark_prismarine", MubbleBlocks.MAGENTA_DARK_PRISMARINE);
    public static final Block PINK_DARK_PRISMARINE_SLAB = new BlockSlab("pink_dark_prismarine", MubbleBlocks.PINK_DARK_PRISMARINE);
    
    public static final Block WHITE_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("white_dark_prismarine", MubbleBlocks.WHITE_DARK_PRISMARINE);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("light_gray_dark_prismarine", MubbleBlocks.LIGHT_GRAY_DARK_PRISMARINE);
    public static final Block GRAY_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("gray_dark_prismarine", MubbleBlocks.GRAY_DARK_PRISMARINE);
    public static final Block BLACK_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("black_dark_prismarine", MubbleBlocks.BLACK_DARK_PRISMARINE);
    public static final Block BROWN_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("brown_dark_prismarine", MubbleBlocks.BROWN_DARK_PRISMARINE);
    public static final Block RED_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("red_dark_prismarine", MubbleBlocks.RED_DARK_PRISMARINE);
    public static final Block ORANGE_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("orange_dark_prismarine", MubbleBlocks.ORANGE_DARK_PRISMARINE);
    public static final Block YELLOW_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("yellow_dark_prismarine", MubbleBlocks.YELLOW_DARK_PRISMARINE);
    public static final Block LIME_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("lime_dark_prismarine", MubbleBlocks.LIME_DARK_PRISMARINE);
    public static final Block GREEN_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("green_dark_prismarine", MubbleBlocks.GREEN_DARK_PRISMARINE);
    public static final Block CYAN_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("cyan_dark_prismarine", MubbleBlocks.CYAN_DARK_PRISMARINE);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("light_blue_dark_prismarine", MubbleBlocks.LIGHT_BLUE_DARK_PRISMARINE);
    public static final Block BLUE_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("blue_dark_prismarine", MubbleBlocks.BLUE_DARK_PRISMARINE);
    public static final Block PURPLE_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("purple_dark_prismarine", MubbleBlocks.PURPLE_DARK_PRISMARINE);
    public static final Block MAGENTA_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("magenta_dark_prismarine", MubbleBlocks.MAGENTA_DARK_PRISMARINE);
    public static final Block PINK_DARK_PRISMARINE_VERTICAL_SLAB = new BlockSlabVertical("pink_dark_prismarine", MubbleBlocks.PINK_DARK_PRISMARINE);
    
    public static final Block WHITE_DARK_PRISMARINE_WALL = new BlockWall("white_dark_prismarine", MubbleBlocks.WHITE_DARK_PRISMARINE);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE_WALL = new BlockWall("light_gray_dark_prismarine", MubbleBlocks.LIGHT_GRAY_DARK_PRISMARINE);
    public static final Block GRAY_DARK_PRISMARINE_WALL = new BlockWall("gray_dark_prismarine", MubbleBlocks.GRAY_DARK_PRISMARINE);
    public static final Block BLACK_DARK_PRISMARINE_WALL = new BlockWall("black_dark_prismarine", MubbleBlocks.BLACK_DARK_PRISMARINE);
    public static final Block BROWN_DARK_PRISMARINE_WALL = new BlockWall("brown_dark_prismarine", MubbleBlocks.BROWN_DARK_PRISMARINE);
    public static final Block RED_DARK_PRISMARINE_WALL = new BlockWall("red_dark_prismarine", MubbleBlocks.RED_DARK_PRISMARINE);
    public static final Block ORANGE_DARK_PRISMARINE_WALL = new BlockWall("orange_dark_prismarine", MubbleBlocks.ORANGE_DARK_PRISMARINE);
    public static final Block YELLOW_DARK_PRISMARINE_WALL = new BlockWall("yellow_dark_prismarine", MubbleBlocks.YELLOW_DARK_PRISMARINE);
    public static final Block LIME_DARK_PRISMARINE_WALL = new BlockWall("lime_dark_prismarine", MubbleBlocks.LIME_DARK_PRISMARINE);
    public static final Block GREEN_DARK_PRISMARINE_WALL = new BlockWall("green_dark_prismarine", MubbleBlocks.GREEN_DARK_PRISMARINE);
    public static final Block CYAN_DARK_PRISMARINE_WALL = new BlockWall("cyan_dark_prismarine", MubbleBlocks.CYAN_DARK_PRISMARINE);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE_WALL = new BlockWall("light_blue_dark_prismarine", MubbleBlocks.LIGHT_BLUE_DARK_PRISMARINE);
    public static final Block BLUE_DARK_PRISMARINE_WALL = new BlockWall("blue_dark_prismarine", MubbleBlocks.BLUE_DARK_PRISMARINE);
    public static final Block PURPLE_DARK_PRISMARINE_WALL = new BlockWall("purple_dark_prismarine", MubbleBlocks.PURPLE_DARK_PRISMARINE);
    public static final Block MAGENTA_DARK_PRISMARINE_WALL = new BlockWall("magenta_dark_prismarine", MubbleBlocks.MAGENTA_DARK_PRISMARINE);
    public static final Block PINK_DARK_PRISMARINE_WALL = new BlockWall("pink_dark_prismarine", MubbleBlocks.PINK_DARK_PRISMARINE);
    
    public static final Block FOOTBLOCK = new BlockSimple("footblock", Properties.from(Blocks.WHITE_WOOL));
    public static final Block WHITE_CLOUD_BLOCK = new BlockCloud("white");
    public static final Block LIGHT_GRAY_CLOUD_BLOCK = new BlockCloud("light_gray");
    public static final Block GRAY_CLOUD_BLOCK = new BlockCloud("gray");
    public static final Block BLACK_CLOUD_BLOCK = new BlockCloud("black");
    public static final Block TOMATO = new BlockCrops("tomato");
    public static final Block SALAD = new BlockCrops("salad");
    //public static final Block RICE = new BlockCrops("rice");
    public static final Block CHEESE_BLOCK = new BlockSimple("cheese_block", Properties.create(Material.GROUND, MaterialColor.YELLOW).hardnessAndResistance(0.5f).sound(SoundType.SNOW));
    public static final Block WHITE_BALLOON = new BlockBalloon(EnumDyeColor.WHITE);
    public static final Block LIGHT_GRAY_BALLOON = new BlockBalloon(EnumDyeColor.LIGHT_GRAY);
    public static final Block GRAY_BALLOON = new BlockBalloon(EnumDyeColor.GRAY);
    public static final Block BLACK_BALLOON = new BlockBalloon(EnumDyeColor.BLACK);
    public static final Block BROWN_BALLOON = new BlockBalloon(EnumDyeColor.BROWN);
    public static final Block RED_BALLOON = new BlockBalloon(EnumDyeColor.RED);
    public static final Block ORANGE_BALLOON = new BlockBalloon(EnumDyeColor.ORANGE);
    public static final Block YELLOW_BALLOON = new BlockBalloon(EnumDyeColor.YELLOW);
    public static final Block LIME_BALLOON = new BlockBalloon(EnumDyeColor.LIME);
    public static final Block GREEN_BALLOON = new BlockBalloon(EnumDyeColor.GREEN);
    public static final Block CYAN_BALLOON = new BlockBalloon(EnumDyeColor.CYAN);
    public static final Block LIGHT_BLUE_BALLOON = new BlockBalloon(EnumDyeColor.LIGHT_BLUE);
    public static final Block BLUE_BALLOON = new BlockBalloon(EnumDyeColor.BLUE);
    public static final Block PURPLE_BALLOON = new BlockBalloon(EnumDyeColor.PURPLE);
    public static final Block MAGENTA_BALLOON = new BlockBalloon(EnumDyeColor.MAGENTA);
    public static final Block PINK_BALLOON = new BlockBalloon(EnumDyeColor.PINK);
    public static final Block ULTIMATUM_PORTAL = new BlockUltimatumPortal();
    
    
    
    public static final Block QUESTION_BLOCK = new BlockQuestion();
    public static final Block EMPTY_BLOCK = new BlockEmpty();
    public static final Block ROTATING_BLOCK = new BlockRotating();
    public static final Block LIGHT_BLOCK = new BlockSimple("light_block", Properties.from(Blocks.STONE).lightValue(15));
    public static final Block BRICK_BLOCK = new BlockBrick("brick_block");
    public static final Block GOLDEN_BRICK_BLOCK = new BlockBrick("golden_brick_block");
    public static final Block NOTE_BLOCK = new BlockNote("note_block");
    public static final Block SUPER_NOTE_BLOCK = new BlockNote("super_note_block");
    public static final Block FIRE_FLOWER = new BlockFlower("fire_flower");
    public static final Block ICE_FLOWER = new BlockFlower("ice_flower");
    public static final Block BOOMERANG_FLOWER = new BlockFlower("boomerang_flower");
    public static final Block CLOUD_FLOWER = new BlockFlowerCloud();
    public static final Block GOLD_FLOWER = new BlockFlowerGold();
    public static final Block WHITE_MUSHROOM = new BlockMushroom(EnumDyeColor.WHITE);
    public static final Block LIGHT_GRAY_MUSHROOM = new BlockMushroom(EnumDyeColor.LIGHT_GRAY);
    public static final Block GRAY_MUSHROOM = new BlockMushroom(EnumDyeColor.GRAY);
    public static final Block BLACK_MUSHROOM = new BlockMushroom(EnumDyeColor.BLACK);
    public static final Block ORANGE_MUSHROOM = new BlockMushroom(EnumDyeColor.ORANGE);
    public static final Block YELLOW_MUSHROOM = new BlockMushroom(EnumDyeColor.YELLOW);
    public static final Block LIME_MUSHROOM = new BlockMushroom(EnumDyeColor.LIME);
    public static final Block GREEN_MUSHROOM = new BlockMushroom(EnumDyeColor.GREEN);
    public static final Block CYAN_MUSHROOM = new BlockMushroom(EnumDyeColor.CYAN);
    public static final Block LIGHT_BLUE_MUSHROOM = new BlockMushroom(EnumDyeColor.LIGHT_BLUE);
    public static final Block BLUE_MUSHROOM = new BlockMushroom(EnumDyeColor.BLUE);
    public static final Block PURPLE_MUSHROOM = new BlockMushroom(EnumDyeColor.PURPLE);
    public static final Block MAGENTA_MUSHROOM = new BlockMushroom(EnumDyeColor.MAGENTA);
    public static final Block PINK_MUSHROOM = new BlockMushroom(EnumDyeColor.PINK);
    public static final Block WHITE_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.WHITE_MUSHROOM, EnumDyeColor.WHITE);
    public static final Block LIGHT_GRAY_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.LIGHT_GRAY_MUSHROOM, EnumDyeColor.LIGHT_GRAY);
    public static final Block GRAY_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.GRAY_MUSHROOM, EnumDyeColor.GRAY);
    public static final Block BLACK_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.BLACK_MUSHROOM, EnumDyeColor.BLACK);
    public static final Block ORANGE_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.ORANGE_MUSHROOM, EnumDyeColor.ORANGE);
    public static final Block YELLOW_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.YELLOW_MUSHROOM, EnumDyeColor.YELLOW);
    public static final Block LIME_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.GREEN_MUSHROOM, EnumDyeColor.LIME);
    public static final Block GREEN_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.GREEN_MUSHROOM, EnumDyeColor.GREEN);
    public static final Block CYAN_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.CYAN_MUSHROOM, EnumDyeColor.CYAN);
    public static final Block LIGHT_BLUE_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.LIGHT_BLUE_MUSHROOM, EnumDyeColor.LIGHT_BLUE);
    public static final Block BLUE_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.BLUE_MUSHROOM, EnumDyeColor.BLUE);
    public static final Block PURPLE_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.PURPLE_MUSHROOM, EnumDyeColor.PURPLE);
    public static final Block MAGENTA_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.MAGENTA_MUSHROOM, EnumDyeColor.MAGENTA);
    public static final Block PINK_MUSHROOM_BLOCK = new BlockHugeMushroom(MubbleBlocks.PINK_MUSHROOM, EnumDyeColor.PINK);
    
    
    
    public static final Block WHITE_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.WHITE);
    public static final Block LIGHT_GRAY_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.LIGHT_GRAY);
    public static final Block GRAY_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.GRAY);
    public static final Block BLACK_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.BLACK);
    public static final Block BROWN_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.BROWN);
    public static final Block RED_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.RED);
    public static final Block ORANGE_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.ORANGE);
    public static final Block YELLOW_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.YELLOW);
    public static final Block LIME_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.LIME);
    public static final Block GREEN_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.GREEN);
    public static final Block CYAN_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.CYAN);
    public static final Block LIGHT_BLUE_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.LIGHT_BLUE);
    public static final Block BLUE_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.BLUE);
    public static final Block PURPLE_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.PURPLE);
    public static final Block MAGENTA_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.MAGENTA);
    public static final Block PINK_TETRIS_BLOCK = new BlockTetris(EnumDyeColor.PINK);
    public static final Block TETRIS_GLASS = new BlockTetrisGlass();
    public static final Block JAPANESE_TETRIS_CUSHION = new BlockFalling("japanese_tetris_cushion", Properties.from(Blocks.RED_WOOL));
    public static final Block RAINBOW_TETRIS_SCAFFOLDING = new BlockFalling("rainbow_tetris_scaffolding", Properties.from(Blocks.IRON_BLOCK));
    public static final Block MONOCHROME_TETRIS_SCAFFOLDING = new BlockFalling("monochrome_tetris_scaffolding", Properties.from(Blocks.IRON_BLOCK));
    
    
    
    public static final Block VAMPIRE_STONE = new BlockSimple("vampire_stone", Properties.from(Blocks.STONE));
    public static final Block MEDUSA_STONE = new BlockSimple("medusa_stone", Properties.from(Blocks.STONE));
    public static final Block MEDUSA_BRICKS = new BlockSimple("medusa_bricks", Properties.from(Blocks.STONE_BRICKS));
    public static final Block MEDUSA_BRICK_STAIRS = new BlockStairs("medusa_brick", MubbleBlocks.MEDUSA_BRICKS);
    public static final Block MEDUSA_BRICK_SLAB = new BlockSlab("medusa_brick", MubbleBlocks.MEDUSA_BRICKS);
    public static final Block MEDUSA_BRICK_VERTICAL_SLAB = new BlockSlabVertical("medusa_brick", MubbleBlocks.MEDUSA_BRICKS);
    public static final Block MEDUSA_BRICK_WALL = new BlockWall("medusa_brick", MubbleBlocks.MEDUSA_BRICKS);
    public static final Block WHITE_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.WHITE);
    public static final Block LIGHT_GRAY_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.LIGHT_GRAY);
    public static final Block GRAY_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.GRAY);
    public static final Block BLACK_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.BLACK);
    public static final Block BROWN_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.BROWN);
    public static final Block RED_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.RED);
    public static final Block ORANGE_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.ORANGE);
    public static final Block YELLOW_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.YELLOW);
    public static final Block LIME_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.LIME);
    public static final Block GREEN_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.GREEN);
    public static final Block CYAN_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.CYAN);
    public static final Block LIGHT_BLUE_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.LIGHT_BLUE);
    public static final Block BLUE_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.BLUE);
    public static final Block PURPLE_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.PURPLE);
    public static final Block MAGENTA_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.MAGENTA);
    public static final Block PINK_CANDY_CANE_PILLAR = new BlockCandyCanePillar(EnumDyeColor.PINK);
    
    
    
    public static final Block GREEN_HILL_GRASS_BLOCK  = new BlockGrass("green_hill_grass_block", MubbleBlocks.GREEN_HILL_DIRT, Properties.from(Blocks.GRASS_BLOCK));
    public static final Block GREEN_HILL_DIRT = new BlockSimple("green_hill_dirt", Properties.from(Blocks.DIRT));
    public static final Block MARBLE_ZONE_STONE = new BlockSimple("marble_zone_stone", Properties.from(Blocks.STONE));
    public static final Block YELLOW_STUDIOPOLIS_CLAPPER = new BlockDirectional("yellow_studiopolis_clapper", Properties.from(Blocks.IRON_BLOCK));
    public static final Block BLUE_STUDIOPOLIS_CLAPPER = new BlockDirectional("blue_studiopolis_clapper", Properties.from(Blocks.IRON_BLOCK));
    public static final Block SPRING = new BlockSpring();
    
    
    
    public static final Block SCARLET_MUSHROOM = new BlockMushroom("scarlet", 7);
    public static final Block SCARLET_ORCHID = new BlockFlower("scarlet_orchid", 7);
    
    
    
    public static final Block GIRDER = new BlockSimple("girder", Properties.from(Blocks.IRON_BLOCK));
    public static final Block MIRROR_TEMPLE_BRICKS = new BlockSimple("mirror_temple_bricks", Properties.from(Blocks.BRICKS));
    public static final Block OLD_SITE_BRICKS = new BlockSimple("old_site_bricks", Properties.from(Blocks.BRICKS));
    public static final Block MIRROR_TEMPLE_BRICK_STAIRS = new BlockStairs("mirror_temple_brick", MubbleBlocks.MIRROR_TEMPLE_BRICKS);
    public static final Block OLD_SITE_BRICK_STAIRS = new BlockStairs("old_site_brick", MubbleBlocks.OLD_SITE_BRICKS);
    public static final Block MIRROR_TEMPLE_BRICK_SLAB = new BlockSlab("mirror_temple_brick", MubbleBlocks.MIRROR_TEMPLE_BRICKS);
    public static final Block OLD_SITE_BRICK_SLAB = new BlockSlab("old_site_brick", MubbleBlocks.OLD_SITE_BRICKS);
    public static final Block MIRROR_TEMPLE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("mirror_temple_brick", MubbleBlocks.MIRROR_TEMPLE_BRICKS);
    public static final Block OLD_SITE_BRICK_VERTICAL_SLAB = new BlockSlabVertical("old_site_brick", MubbleBlocks.OLD_SITE_BRICKS);
    public static final Block MIRROR_TEMPLE_BRICK_WALL = new BlockWall("mirror_temple_brick", MubbleBlocks.MIRROR_TEMPLE_BRICKS);
    public static final Block OLD_SITE_BRICK_WALL = new BlockWall("old_site_brick", MubbleBlocks.OLD_SITE_BRICKS);
    public static final Block ELDER_PEBBLES = new BlockSimple("elder_pebbles", Properties.from(Blocks.BRICKS).lightValue(5));
    public static final Block SPACE_JAM = new BlockSimple("space_jam", Properties.create(Material.SAND).hardnessAndResistance(0.4f).sound(MubbleSoundTypes.SPACE_JAM));
    public static final Block SPACE_OBSIDIAN = new BlockEmptyDrops("space_obsidian", Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0F, 3600000.0F));
    
    
    
    public static final Block RED_PUYO = new BlockPuyo(EnumDyeColor.RED);
    public static final Block YELLOW_PUYO = new BlockPuyo(EnumDyeColor.YELLOW);
    public static final Block GREEN_PUYO = new BlockPuyo(EnumDyeColor.GREEN);
    public static final Block TURQUOISE_PUYO = new BlockPuyo("turquoise");
    public static final Block BLUE_PUYO = new BlockPuyo(EnumDyeColor.BLUE);
    public static final Block PURPLE_PUYO = new BlockPuyo(EnumDyeColor.PURPLE);
    public static final Block GARBAGE_PUYO = new BlockDirectional("garbage_puyo", Properties.from(Blocks.STONE));
    public static final Block POINT_PUYO = new BlockDirectional("point_puyo", Properties.from(Blocks.STONE).lightValue(10));
    public static final Block HARD_PUYO = new BlockDirectional("hard_puyo", Properties.from(Blocks.STONE));
    public static final Block IRON_PUYO = new BlockDirectional("iron_puyo", Properties.from(Blocks.IRON_BLOCK));
    public static final Block PUYO_BLOCK = new BlockSimple("puyo_block", Properties.from(Blocks.STONE));
    
    
    
    public static final Block KORETATO_BLOCK = new BlockKoretato();
    public static final Block POTATO_FLOWER = new BlockFlowerPotato();
    
    public static void register(Block block)
    {
        Item.Properties group = new Item.Properties().group(MubbleTabs.MUBBLE_BLOCKS);
        BLOCKS.add(block);
        MubbleItems.ITEMS.add(new ItemBlock(block, group).setRegistryName(block.getRegistryName()));
    }
    
    public static void registerWithoutItem(Block block)
    {
        BLOCKS.add(block);
    }
}