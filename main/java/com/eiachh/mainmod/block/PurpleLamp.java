package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class PurpleLamp extends  Block {

    public PurpleLamp(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);


        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setHardness(1);
        setLightLevel(5.0F);
    }

    public PurpleLamp(Material material, SoundType sound, String unlocalizedName, String registryName) {
       /* super(material);
        setUnlocalizedName(MainModpls.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setSoundType(sound);
        //isFullBlock(false);
        setLightLevel(15.0F);

        setHardness(1);*/

        super(material);
        setUnlocalizedName(MainModpls.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setSoundType(sound);

        setLightLevel(5.0F);
        setHardness(1.0F);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
