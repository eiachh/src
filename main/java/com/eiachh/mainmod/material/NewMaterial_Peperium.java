package com.eiachh.mainmod.material;

import com.eiachh.mainmod.MainModpls;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class NewMaterial_Peperium {
	//                                                                                      block                                          textures/models.armor <---"this"_layer_1.png armor png je
	public static final ArmorMaterial TUTORIAL_ARMOR = EnumHelper.addArmorMaterial(MainModpls.MODID + ":" + "peperium", MainModpls.MODID + ":this", 16, new int[]{2, 5, 6, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10);

}
