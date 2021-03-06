package hugman.mubble.objects.costume;

import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class BlockCostume extends BlockItem
{
	protected final EquipmentSlotType armorType;
	protected final SoundEvent sound;
	protected final ResourceLocation shader;
	
    public BlockCostume(Item.Properties builder, SoundEvent sound, EquipmentSlotType armorType, Block base_block)
    {
        super(base_block, builder);
		this.sound = sound;
	    this.armorType = armorType;
        this.shader = null;
	    DispenserBlock.registerDispenseBehavior(this, DISPENSER_BEHAVIOR);
    }
	
    public BlockCostume(Item.Properties builder, SoundEvent sound, EquipmentSlotType armorType, Block base_block, ResourceLocation shader)
    {
        super(base_block, builder);
		this.sound = sound;
	    this.armorType = armorType;
        this.shader = shader;
	    DispenserBlock.registerDispenseBehavior(this, DISPENSER_BEHAVIOR);
    }
    
    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
    {
    	if(world.isRemote)
    	{
    		GameRenderer renderer = Minecraft.getInstance().gameRenderer;
    		ShaderGroup shaderGroup = renderer.getShaderGroup();
    		ResourceLocation shader = this.getShader();
    		if(shader != null)
    		{
    			if(shaderGroup != null)
    			{
    				if(!shaderGroup.getShaderGroupName().equals(shader.toString()))
    				{
    					renderer.loadShader(shader);
    				}
    			}
    			else
    			{
    				renderer.loadShader(shader);
    			}
    		}
    	}
    }
	
	public static final IDispenseItemBehavior DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior()
	{
		@Override
		protected ItemStack dispenseStack(IBlockSource source, ItemStack stack)
		{
			return ArmorItem.dispenseArmor(source, stack) ? stack : super.dispenseStack(source, stack);
		}
	};
    
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack)
    {
    	return this.armorType;
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        ItemStack itemstack1 = playerIn.getItemStackFromSlot(EquipmentSlotType.HEAD);
        if(itemstack1.isEmpty())
        {
           playerIn.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(this));
           itemstack.shrink(1);
           worldIn.playSound((PlayerEntity)null, playerIn.getX(), playerIn.getY(), playerIn.getZ(), this.sound, SoundCategory.PLAYERS, 1f, 1f);
           return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
        }
        else
        {
           return new ActionResult<>(ActionResultType.FAIL, itemstack);
        }
	}
    
    public ResourceLocation getShader()
    {
    	return this.shader;
	}
    
    public static boolean isUsable(ItemStack stack)
    {
    	return stack.getDamage() < stack.getMaxDamage() - 1;
	}
}
