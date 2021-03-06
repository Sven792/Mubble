package hugman.mubble.objects.entity;

import java.util.Random;

import hugman.mubble.init.MubbleSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.MoveTowardsRestrictionGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class GoombaEntity extends MonsterEntity
{
	private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(ToadEntity.class, DataSerializers.VARINT);
	
    public GoombaEntity(EntityType<? extends GoombaEntity> type, World worldIn) 
    {
        super(type, worldIn);
    }
    
	@Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(2, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new LookAtGoal(this, BeeEntity.class, 10.0F));
        this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[] {GoombaEntity.class}));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, ToadEntity.class, true));
    }
    
    @Override
    protected void registerAttributes() 
    {
        super.registerAttributes();        
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
    }
    
    @Override
    public float getEyeHeight(Pose pose)
    {
        return 0.375F;
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource source) 
    {
        return MubbleSounds.ENTITY_GOOMBA_HURT;
    }
    
    @Override
    protected SoundEvent getDeathSound() 
    {
        return MubbleSounds.ENTITY_GOOMBA_DEATH;
    }
    
	protected SoundEvent getStepSound()
	{
		return MubbleSounds.ENTITY_GOOMBA_STEP;
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn)
	{
    	 this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}
    
    public int getVariant()
    {
    	return this.dataManager.get(VARIANT);
	}

	public void setVariant(int variantIn)
	{
		this.dataManager.set(VARIANT, variantIn);
	}
	
	@Override
	protected void registerData()
	{
		super.registerData();
		this.dataManager.register(VARIANT, 0);
	}
    
    @Override
    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.setVariant(compound.getInt("Variant"));
    }
    
    @Override
    public void onCollideWithPlayer(PlayerEntity playerIn)
    {
    	AxisAlignedBB hitbox = this.getBoundingBox().contract(0, -1, 0).grow(-0.4, 0, -0.4);
    	Vec3d motion = playerIn.getMotion();
    	if(!this.world.isRemote() && !playerIn.isSpectator() && hitbox.intersects(playerIn.getBoundingBox()) && motion.y < 0.3D && this.isAlive())
    	{
    		playerIn.setMotion(motion.x, 0.5D, motion.z);
			((ServerPlayerEntity)playerIn).connection.sendPacket(new SEntityVelocityPacket(playerIn));
    		playerIn.fallDistance = 0.0F;
    		this.attackEntityFrom(DamageSource.causePlayerDamage(playerIn), Float.MAX_VALUE);
    		this.playSound(MubbleSounds.ENTITY_GOOMBA_CRUSH, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
    	}
    }
    
	public static boolean canSpawn(EntityType<GoombaEntity> entity, IWorld world, SpawnReason reason, BlockPos pos, Random rand)
	{
		return world.getDifficulty() != Difficulty.PEACEFUL;
	}
}