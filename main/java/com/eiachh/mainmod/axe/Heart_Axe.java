package com.eiachh.mainmod.axe;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.item.ItemAxe;

public class Heart_Axe extends ItemAxe{

	public Heart_Axe(ToolMaterial material,float damage,float attactSpeed,String unlocalizedname,String registryName) {
		super(material, damage, attactSpeed);
		
		setUnlocalizedName(MainModpls.MODID+"."+unlocalizedname);
		setRegistryName(registryName);
		setCreativeTab(MainModpls.TUTORIAL_TAB);
	}
}
