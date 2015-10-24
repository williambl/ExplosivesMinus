package com.williambl.testmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(Blocks.log2, 1, 13),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.cookie);
		GameRegistry.addRecipe(new ItemStack(Items.apple, 4),
				"AA",
				"AA",
				'A', Blocks.leaves);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 1, 2), Items.rotten_flesh, Items.ender_pearl);
		GameRegistry.addSmelting(Blocks.glowstone, new ItemStack(Items.glowstone_dust, 4), 1F);

	}

}
