package com.stuff.stuffmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class crystallizedEssence extends Block {
	
	public crystallizedEssence(String name) {
		super(Material.rock);
		setBlockName(Stuff.MODID + ":" + name);
		setBlockTextureName(Stuff.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.25F);
		setResistance(4.5F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
	}
	
}