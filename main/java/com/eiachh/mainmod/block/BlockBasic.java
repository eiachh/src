package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

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


    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state) {
        return false;
    }

    @Override
    public boolean isTranslucent(IBlockState state) {
        return true;
    }

    @Override
    public boolean isBlockNormalCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}