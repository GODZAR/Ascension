package com.thexfactor117.ascension.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityGoblin extends EntityMob
{
	public EntityGoblin(World world) 
	{
		super(world);
		this.getNavigator().setCanSwim(true);
		this.experienceValue = 20;
		this.setSize(1.5F, 1.0F); //sets how big the hit box is *** TEST THIS ***
		this.tasks.addTask(0, new EntityAIWander(this, 1.5D)); //speed at which mob wanders
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false)); // attacks player once collided
		this.tasks.addTask(2, new EntityAISwimming(this));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.5D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
	}
	
	public boolean isAIEnabled()
	{
		return true;
	}
}
