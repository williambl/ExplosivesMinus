package com.williambl.testmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = testmod.MODID, version = testmod.VERSION)
public class testmod
{
    public static final String MODID = "testmod";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		ModRecipes.addRecipes();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
