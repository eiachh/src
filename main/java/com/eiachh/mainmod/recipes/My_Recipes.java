package com.eiachh.mainmod.recipes;

import com.eiachh.mainmod.init.TutorialItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class My_Recipes {
	
	 public static void initSmelting() {
		 GameRegistry.addSmelting(TutorialItems.BASIC_STAR_ITEM, new ItemStack(TutorialItems.CRAFTING_HEART_ITEM), 600.0F);
		 GameRegistry.addSmelting(Items.APPLE, new ItemStack(Items.BED), 600.0F);
	    }
}
