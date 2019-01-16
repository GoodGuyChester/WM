package com.GoodGuyChester.Witcher.init;

import java.util.ArrayList;
import java.util.List;

import com.GoodGuyChester.Witcher.Items.ItemBase;
import com.GoodGuyChester.Witcher.Items.tools.ToolAxe;
import com.GoodGuyChester.Witcher.Items.tools.ToolHoe;
import com.GoodGuyChester.Witcher.Items.tools.ToolPickaxe;
import com.GoodGuyChester.Witcher.Items.tools.ToolSpade;
import com.GoodGuyChester.Witcher.Items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 2, 180, 5.0f, 2.0f, 10);
	
	
	//items
	
	public static final Item SILVER_POWDER = new ItemBase ("silver_powder");
	public static final Item SILVER_INGOT = new ItemBase ("silver_ingot");
    //public static final Item CHUNK_CRUSHER = new ItemBase ("chunk_crusher"); DONE NEED TEXTURES
	
	public static final Item SILVER_CHUNK = new ItemBase ("silver_chunk");
	//public static final Item AMBER = new ItemBase ("amber"); DONE NEED TEXTURES
	//public static final Item AMETHYST = new ItemBase ("amethyst");  DONE NEED TEXTURES
	//public static final Item RUBY = new ItemBase ("ruby");  DONE NEED TEXTURES
	//public static final Item SAPPHIRE = new ItemBase ("sapphire"); 
	//public static final Item AMBER_POWDER = new ItemBase ("amber_powder");  DONE NEED TEXTURES
	//public static final Item AMETHYT_POWDER = new ItemBase ("amethyst_powder"); DONE NEED TEXTURES
	//public static final Item DIAMOND_POWDER = new ItemBase ("diamond_powder");  DONE NEED TEXTURES
	//public static final Item EMERALD_POWDER = new ItemBase ("emerald_powder");  DONE NEED TEXTURES
	//public static final Item RUBY_POWDER = new ItemBase ("ruby_powder"); . DONE NEED TEXTURES
	//public static final Item SAPPHIRE_POWDER = new ItemBase ("sapphire_powder");  DONE NEED TEXTURES
	//public static final Item STEEL_INGOT = new ItemBase ("steel_ingot");  DONE NEED TEXTURES
	//public static final Item COTTON = new ItemBase ("cotton");  DONE NEED TEXTURES
	//public static final Item FIBER = new ItemBase ("fiber");  DONE NEED TEXTURES
	//public static final Item LEATHER_SCRAP = new ItemBase ("leather_scrap");  DONE NEED TEXTURES
	//public static final Item NAIL = new ItemBase ("nail");  DONE NEED TEXTURES
	//public static final Item OIL = new ItemBase ("oil");  DONE NEED TEXTURES
	//public static final Item ROPE = new ItemBase ("rope");  DONE NEED TEXTURES
	//public static final Item THREAD = new ItemBase ("thread"); DONE NEED TEXTURES
	//public static final Item TWINE = new ItemBase ("twine");  DONE NEED TEXTURES
	
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	//public static final Item  = new ItemBase ("");
	
	
	
	
	//tools
	
	public static final ItemSword SILVER_SWORD = new ToolSword ("silver_sword", MATERIAL_SILVER);
	//public static final ItemSpade SILVER_SHOVEL = new ToolSpade  ("silver_shovel", MATERIAL_SILVER);
	//public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe  ("silver_pickaxe", MATERIAL_SILVER);
	//public static final ItemAxe SILVER_AXE = new ToolAxe  ("silver_axe", MATERIAL_SILVER);	
	//public static final ItemHoe SILVER_HOE = new ToolHoe  ("silver_hoe", MATERIAL_SILVER);	
	
	
	
}
