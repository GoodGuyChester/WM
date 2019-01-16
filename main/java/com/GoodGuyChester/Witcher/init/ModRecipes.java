package com.GoodGuyChester.Witcher.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.SILVER_POWDER, new ItemStack(ModItems.SILVER_INGOT, 1), 1f);
		
     }
}
