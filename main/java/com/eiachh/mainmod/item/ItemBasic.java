package com.eiachh.mainmod.item;

import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.tabs.NewTab;

import net.minecraft.item.Item;
 
public class ItemBasic extends Item {
 
    public ItemBasic(String unlocalized,String Name) 
    {
        setUnlocalizedName(MainModpls.MODID+"."+ unlocalized);
        setRegistryName(Name);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
    }
 
}
