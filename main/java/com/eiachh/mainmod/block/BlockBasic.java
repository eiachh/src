package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {
 
    public BlockBasic(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);
       
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setHardness(1);
    }
 
    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(MainModpls.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setSoundType(sound);
        
        setHardness(1);
    }
 
}