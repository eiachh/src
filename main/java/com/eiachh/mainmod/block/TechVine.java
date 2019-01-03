package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class TechVine extends Block {
    public TechVine(Material material, String registryName) {
        super(material);
        setUnlocalizedName(MainModpls.MODID + "." + registryName);
        setRegistryName(registryName);
        setSoundType(SoundType.STONE);
        setCreativeTab(MainModpls.TUTORIAL_TAB);

    }

    public TechVine(Material material, SoundType sound,String registryName) {
        super(material);
        setUnlocalizedName(MainModpls.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setSoundType(sound);


    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
