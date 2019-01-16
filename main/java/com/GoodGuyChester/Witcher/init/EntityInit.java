package com.GoodGuyChester.Witcher.init;

import com.GoodGuyChester.Witcher.Main;
import com.GoodGuyChester.Witcher.Entity.EntityGhoul;
import com.GoodGuyChester.Witcher.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	
	public static void registerEntities()
	{
		RegisterEntity("ghoul", EntityGhoul.class, Reference.ENTITY_GHOUL, 100, 12719382, 000000 );
	}
	
	private static void RegisterEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
	
	EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);

	}
	 
}
	

