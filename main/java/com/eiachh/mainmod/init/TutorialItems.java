package com.eiachh.mainmod.init;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;


@ObjectHolder(MainModpls.MODID)
public class TutorialItems {
 
    public static final Item BASIC_STAR_ITEM = null;
    public static final Item BUBU_ITEM =null;
    public static final Item CRAFTING_HEART_ITEM= null;
    public static final Item MYSEED_ITEM=null;

   /* public void init()
    {
        MYSEED_ITEM=new ItemSeeds(TutorialBlocks.FIRST_CROP_BLOCK, Blocks.FARMLAND)
                        .setRegistryName(new ResourceLocation(MainModpls.MODID,"myseed_item"))
                        .setUnlocalizedName(MainModpls.MODID+"."+"myseed_item")
                        .setCreativeTab(MainModpls.TUTORIAL_TAB);
    }*/
}
