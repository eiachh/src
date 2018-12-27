package com.eiachh.mainmod.material;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;



public class NewMaterial {
	
	public static final String name= MainModpls.MODID+"."+"NewMat";
	public static final int harvestlevel=3;
	public static final int maxUses=150;
	public static final float efficiency = 2.0F;
	public static final float damage = 5.5F;
	public static final int enchantability = 1;
	
	public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(name, harvestlevel, maxUses, efficiency, damage, enchantability);
	 


}
