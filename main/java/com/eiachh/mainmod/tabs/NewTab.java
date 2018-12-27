package com.eiachh.mainmod.tabs;

import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.init.TutorialItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
public class NewTab extends CreativeTabs {
 
    public NewTab(String name) {
        super(MainModpls.MODID + "." + name);
    }
 
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(TutorialItems.BASIC_STAR_ITEM);
    }
 
}