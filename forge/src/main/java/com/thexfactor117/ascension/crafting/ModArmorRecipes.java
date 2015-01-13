package com.thexfactor117.ascension.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.thexfactor117.ascension.init.ModArmory;
import com.thexfactor117.ascension.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmorRecipes 
{
	public static void init()
	{
		// Overworld
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.titaniumHelm), new Object[] {"AAA", "A A", 'A', ModItems.titaniumIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.titaniumPlate), new Object[] {"A A", "AAA", "AAA", 'A', ModItems.titaniumIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.titaniumPants), new Object[] {"AAA", "A A", "A A", 'A', ModItems.titaniumIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.titaniumBoots), new Object[] {"A A", "A A", 'A', ModItems.titaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.steelHelm), new Object[] {"AAA", "A A", 'A', ModItems.steelIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.steelPlate), new Object[] {"A A", "AAA", "AAA", 'A', ModItems.steelIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.steelPants), new Object[] {"AAA", "A A", "A A", 'A', ModItems.steelIngot});
    	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.steelBoots), new Object[] {"A A", "A A", 'A', ModItems.steelIngot});	
	}
}