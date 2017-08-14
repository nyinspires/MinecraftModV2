package com.nyinspires.minecraft.mod.lib;

import com.nyinspires.minecraft.MainMod;

/**
 * Stores unlocalized names for blocks and items for easy reference. 
 */
public class RefNames {
	public static final String MOD_ID = "examplemod2";
	public static final String MOD_NAME = "Example Mod for Class";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[1.12-14.21.0.2385,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ".";
	
	
	//Blocks
	public static final String BLOCK_NEW_BLOCK = "newblock";
	public static final String BLOCK_NEW_BLOCK_REF = "examplemod2.newblock";
	
	//Items
	public static final String ITEM_NEW_ITEM = "newitem";
	public static final String ITEM_NEW_ITEM_REF = "examplemod2.newitem";

}
