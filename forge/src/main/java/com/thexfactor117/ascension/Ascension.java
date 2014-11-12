/**
 * Copyright 2014 TheXFactor117
 */

package com.thexfactor117.ascension;

import com.thexfactor117.ascension.help.Reference;
import com.thexfactor117.ascension.init.ModBlocks;
import com.thexfactor117.ascension.init.ModItems;
import com.thexfactor117.ascension.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Ascension 
{
	@SidedProxy(clientSide = "com.thexfactor117.omega.proxies.ClientProxy", serverSide = "com.thexfactor117.omega.proxies.CommonProxies")
	public static CommonProxy ascensionProxy;
	
	@Instance(Reference.MODID)
	public static Ascension instance;
	
	//AscensionWorldGeneration eventWorldGen = new AscensionWorldGeneration();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{		
		ModItems.init();
		ModBlocks.init();
		
		//GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
		
		//FMLCommonHandler.instance().bus().register(new AscensionEvent());
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
