package com.nyinspires.minecraft.mod.init;

import com.nyinspires.minecraft.mod.blocks.BlockNewBlock;
import com.nyinspires.minecraft.mod.lib.RefNames;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	
	@GameRegistry.ObjectHolder(RefNames.BLOCK_NEW_BLOCK_REF)
    public static BlockNewBlock firstBlock;
	
	
	
	//Common and Server
	public static void initCommon() {
		
		
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient() {
		
	}

}
