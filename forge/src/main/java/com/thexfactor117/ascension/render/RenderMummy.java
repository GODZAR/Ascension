package com.thexfactor117.ascension.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.thexfactor117.ascension.entities.hostile.EntityMummy;
import com.thexfactor117.ascension.help.Reference;

public class RenderMummy extends RenderLiving
{
	private static final ResourceLocation mummyTexture = new ResourceLocation(Reference.MODID + ":textures/models/Mummy.png"); 
	
	public RenderMummy(ModelBase par1ModelBase, float par2) 
	{
		super(par1ModelBase, par2);
	}

	protected ResourceLocation getEntityTexture(EntityMummy entity) 
	{
		return mummyTexture;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return this.getEntityTexture((EntityMummy) entity);
	}
}
