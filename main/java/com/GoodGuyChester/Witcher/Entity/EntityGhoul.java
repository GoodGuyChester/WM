package com.GoodGuyChester.Witcher.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityGhoul extends EntityRabbit
{

	public EntityGhoul(World worldIn) 
	{
		super(worldIn);
	}

	@Override
	public EntityRabbit createChild(EntityAgeable ageable)
	{
		return new EntityGhoul(world);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	

	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	@Override
	protected SoundEvent getDeathSound()
	{
	return super.getDeathSound();
	
	
	}




}
