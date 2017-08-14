package com.nyinspires.minecraft;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import com.nyinspires.minecraft.mod.CommonProxy;
import com.nyinspires.minecraft.mod.lib.RefNames;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefNames.MOD_ID, name = RefNames.MOD_NAME, version = RefNames.VERSION, dependencies = RefNames.DEPENDENCIES)
public class MainMod {

	// Variables
	public static final Random RANDOM = new Random();
	public static Logger logger;

	@Instance(RefNames.MOD_ID)
	public static MainMod instance;

	@SidedProxy(clientSide = "com.nyinspires.minecraft.mod.ClientProxy", serverSide = "com.nyinspires.minecraft.mod.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
