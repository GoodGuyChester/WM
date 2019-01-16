package com.GoodGuyChester.Witcher.Entity.Render;

import com.GoodGuyChester.Witcher.Entity.EntityGhoul;
import com.GoodGuyChester.Witcher.util.Reference;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGhoul extends RenderLiving<EntityGhoul>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/ghoul.png");
	
	public RenderGhoul(RenderManager manager) {
	{
		super(manager, new ModelGhoul(), 0.5f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityGhoul entity)
	{
		return TEXTURES;
	}
	
	
	
}
