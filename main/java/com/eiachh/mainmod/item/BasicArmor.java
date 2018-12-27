package com.eiachh.mainmod.item;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BasicArmor extends ItemArmor {
	 
    public BasicArmor(ArmorMaterial material, EntityEquipmentSlot equipmentSlot, String unlocalizedName, String registryName) {
        super(material, 0, equipmentSlot);
 
        setUnlocalizedName(MainModpls.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
    }
    
 
}
