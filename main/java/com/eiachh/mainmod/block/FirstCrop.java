package com.eiachh.mainmod.block;

import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.init.TutorialBlocks;
import com.eiachh.mainmod.init.TutorialItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sun.applet.Main;

import java.util.Random;

public class FirstCrop extends BlockCrops {

    public FirstCrop(String unlocalizedName)
    {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
        setUnlocalizedName(MainModpls.MODID+"."+unlocalizedName);
        setRegistryName(new ResourceLocation(MainModpls.MODID,unlocalizedName));
        setCreativeTab(MainModpls.TUTORIAL_TAB);
    }

    @Override
    protected Item getSeed() {
        return TutorialItems.MYSEED_ITEM;
    }

    //fix loot if its in last stage
    @Override
    protected Item getCrop() {
        return Items.GOLD_INGOT;
    }

    //if you want to generate soem extra loot by chance ( now its fix 1 command block)
    // you can add different loot for different stages also
    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        super.getDrops(drops, world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge())
        {
            ItemStack stack = new ItemStack(Items.COMMAND_BLOCK_MINECART);
            drops.add(stack );
        }
    }
}
