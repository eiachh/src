package com.eiachh.mainmod.init;

import com.eiachh.mainmod.MainModpls;

import com.eiachh.mainmod.block.FirstCrop;
import com.eiachh.mainmod.block.GuiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.event.RegistryEvent.Register;
 
@ObjectHolder(MainModpls.MODID)
public class TutorialBlocks {

    public static final Block MY_FIRST_BLOCK = null;
    public static final Block GUI_BLOCK = null;
    public static final Block FIRST_CROP_BLOCK=null;
    public static final Block PURPLE_LAMP = null;
    public static final Block WEIRD_SHITE = null;

   /* public static void init()
    {
        FIRST_CROP_BLOCK=new FirstCrop("first_crop_block");
        GUI_BLOCK=new GuiBlock(Material.ROCK, "block_with_gui","gui_block" );
    }

    public static void register()
    {
        //register(FIRST_CROP_BLOCK);
        //GameRegistry.reg
    }*/
}
