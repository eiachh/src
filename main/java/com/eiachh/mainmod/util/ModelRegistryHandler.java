package com.eiachh.mainmod.util;

import com.eiachh.mainmod.init.TutorialBlocks;
import com.eiachh.mainmod.init.TutorialItems;
import com.eiachh.mainmod.init.TutorialPickaxe;
import com.eiachh.mainmod.init.Heart_Axe_Init;
import com.eiachh.mainmod.init.TutorialArmor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
 
@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(TutorialItems.BASIC_STAR_ITEM);
        registerModel(TutorialItems.BUBU_ITEM);
        registerModel(TutorialItems.CRAFTING_HEART_ITEM);
        
        registerModel(Item.getItemFromBlock(TutorialBlocks.MY_FIRST_BLOCK));
        registerModel(Item.getItemFromBlock(TutorialBlocks.GUI_BLOCK));

        registerModel(TutorialPickaxe.THE_BAGUETTE_ITEM);
        
        registerModel(TutorialArmor.PEPERIUM_ARMOR);
        registerModel(TutorialArmor.PEPERIUM_HEAD);
        registerModel(TutorialArmor.PEPERIUM_FEET);
        registerModel(TutorialArmor.PEPERIUM_LEGS);
        registerModel(Heart_Axe_Init.HEART_HAMMER_AXE);


    }
 
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
 
}