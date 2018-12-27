package com.eiachh.mainmod.pickaxe;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.item.ItemPickaxe;

public class PickaxeBasic extends ItemPickaxe{

	public PickaxeBasic(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(MainModpls.TUTORIAL_TAB);
	}
}
