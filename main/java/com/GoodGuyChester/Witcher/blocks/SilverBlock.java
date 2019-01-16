package com.GoodGuyChester.Witcher.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverBlock extends BlockBase
{

	public SilverBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0f);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	
	}

}
