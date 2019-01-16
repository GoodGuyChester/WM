package com.GoodGuyChester.Witcher.init;

import java.util.ArrayList;
import java.util.List;

import com.GoodGuyChester.Witcher.blocks.BlockBase;
import com.GoodGuyChester.Witcher.blocks.SilverBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

public class ModBlocks
{
   public static final List<Block> BLOCKS = new ArrayList<Block>();
   
   public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON);
   //public static final Block SILVER_ORE = new BlockOres("silver_ore", "OverWorld" );
	
}
 