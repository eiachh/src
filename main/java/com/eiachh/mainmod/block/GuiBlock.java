package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;

import com.eiachh.mainmod.gui.FirstGuiScreen;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GuiBlock extends Block {

    public GuiBlock(Material material, String unlocalizedName, String registryName) {
        this(material, SoundType.STONE, unlocalizedName, registryName);

        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setHardness(1);
    }

    public GuiBlock(Material material, SoundType sound, String unlocalizedName, String registryName) {
        super(material);
        setUnlocalizedName(MainModpls.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
        setSoundType(sound);

        setLightLevel(5.0F);
        setHardness(1.0F);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        System.out.println("The GUI Block has been clicked");
        //You can render only on client so it has to be true or crash
        if (worldIn.isRemote)
        {
            Minecraft.getMinecraft().displayGuiScreen(new FirstGuiScreen());
        }

        //wont place block if rightclicked on it
        return true;
    }
}