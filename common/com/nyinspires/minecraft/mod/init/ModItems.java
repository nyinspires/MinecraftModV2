package com.nyinspires.minecraft.mod.init;

import com.nyinspires.minecraft.mod.item.ItemNewItem;
import com.nyinspires.minecraft.mod.lib.RefNames;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	@GameRegistry.ObjectHolder(RefNames.ITEM_NEW_ITEM_REF)
    public static ItemNewItem firstItem;

}
