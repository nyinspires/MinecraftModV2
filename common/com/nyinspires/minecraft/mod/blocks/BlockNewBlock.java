package com.nyinspires.minecraft.mod.blocks;

import com.nyinspires.minecraft.MainMod;
import com.nyinspires.minecraft.mod.lib.RefNames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNewBlock extends Block {
	public BlockNewBlock() {

		super(Material.ROCK);
		setUnlocalizedName(RefNames.BLOCK_NEW_BLOCK_REF); // Used for localization (en_US.lang)
		setRegistryName(RefNames.BLOCK_NEW_BLOCK); // The unique name (within your mod) that identifies this block
	}
}
