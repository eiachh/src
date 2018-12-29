package com.eiachh.mainmod.util;


import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.axe.Heart_Axe;
import com.eiachh.mainmod.block.BlockBasic;

import com.eiachh.mainmod.block.GuiBlock;
import com.eiachh.mainmod.block.FirstCrop;
import com.eiachh.mainmod.init.TutorialBlocks;
import com.eiachh.mainmod.item.ItemBasic;
import com.eiachh.mainmod.item.BasicArmor;
import com.eiachh.mainmod.pickaxe.PickaxeBasic;
import com.eiachh.mainmod.material.Heart_Material;
import com.eiachh.mainmod.material.NewMaterial;
import com.eiachh.mainmod.material.NewMaterial_Peperium;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
 
	
	
	
	
	@SubscribeEvent
    public static void registerBlocks(Register<Block> event) {

        final Block[] blocks = {
                new BlockBasic(Material.ROCK, "first_block", "my_first_block"),
                new FirstCrop("first_crop_block"),
                new GuiBlock(Material.ROCK, "block_with_gui","gui_block" )
        };
        System.out.println("REEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        event.getRegistry().registerAll(blocks);
        System.out.println("REEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

    }
	
	
    @SubscribeEvent
    public static void registerItemsasdasd(Register<Item> wot) {


        final Item[] items = {
                new ItemBasic("BasicStar","basic_star_item"),
                new ItemBasic("Bubu","bubu_item"),
                new ItemBasic("Basic_Crafting_Heart", "crafting_heart_item"),
                new ItemSeeds(TutorialBlocks.FIRST_CROP_BLOCK, Blocks.FARMLAND).setRegistryName(new ResourceLocation(MainModpls.MODID,"myseed_item")).setUnlocalizedName(MainModpls.MODID+"."+"myseed_item").setCreativeTab(MainModpls.TUTORIAL_TAB),

                
                
                new PickaxeBasic(NewMaterial.TUTORIAL_TOOL, "le_baguette", "the_baguette_item"),
                new Heart_Axe(Heart_Material.HEART_TOOL_MATERIAL, 5F, -3F, "heart_axe", "heart_hammer_axe"),
                
                
                new BasicArmor(NewMaterial_Peperium.TUTORIAL_ARMOR ,EntityEquipmentSlot.CHEST, "Pepe_Armor", "peperium_armor"),
                new BasicArmor(NewMaterial_Peperium.TUTORIAL_ARMOR ,EntityEquipmentSlot.FEET, "Pepe_Boots", "peperium_feet"),
                new BasicArmor(NewMaterial_Peperium.TUTORIAL_ARMOR ,EntityEquipmentSlot.HEAD, "Pepe_Helm", "peperium_head"),
                new BasicArmor(NewMaterial_Peperium.TUTORIAL_ARMOR ,EntityEquipmentSlot.LEGS, "Pepe_Leggings", "peperium_legs")
        };

        final Item[] itemBlocks = {
                new ItemBlock(TutorialBlocks.MY_FIRST_BLOCK).setRegistryName(TutorialBlocks.MY_FIRST_BLOCK.getRegistryName()),
                new ItemBlock(TutorialBlocks.GUI_BLOCK).setRegistryName(TutorialBlocks.GUI_BLOCK.getRegistryName()),
               // new ItemBlock(TutorialBlocks.FIRST_CROP_BLOCK).setRegistryName(TutorialBlocks.FIRST_CROP_BLOCK.getRegistryName())
        };

        wot.getRegistry().registerAll(itemBlocks);
        wot.getRegistry().registerAll(items);

        
    }
    
    
  
}