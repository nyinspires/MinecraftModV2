package com.nyinspires.minecraft.mod;

import com.nyinspires.minecraft.mod.blocks.BlockNewBlock;
import com.nyinspires.minecraft.mod.init.ModBlocks;
import com.nyinspires.minecraft.mod.init.ModItems;
import com.nyinspires.minecraft.mod.item.ItemNewItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.initCommon();
		
	}

	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}


	/*
	 * Register Blocks
	 */
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(new BlockNewBlock());
    }
	
	/*
	 * Register Items
	 */
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //Items
    	event.getRegistry().register(new ItemNewItem());
    	
    	
    	//Blocks
    	event.getRegistry().register(new ItemBlock(ModBlocks.firstBlock)
        		.setRegistryName(ModBlocks.firstBlock.getRegistryName()));
        
        
    }
    


   
}