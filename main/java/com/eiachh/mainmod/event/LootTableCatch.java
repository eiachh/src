package com.eiachh.mainmod.event;

import com.eiachh.mainmod.MainModpls;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MinecraftError;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import  com.eiachh.mainmod.init.TutorialItems;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.swing.text.StyleContext;
import java.awt.*;
import java.time.format.TextStyle;
import java.util.List;

public class LootTableCatch {

	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
		if (event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
			System.out.println("simple dungeon chest LootTableCatch.java prints this at LootTableLoadEvent");
		}

	}

	@SubscribeEvent
	public void catchEntityDeath(LivingDeathEvent event) {
		//if a cow
		if (event.getEntityLiving() instanceof EntityCow) {
			//if it runs on the proxy server or physical server
			//alias the fucking client not allowed to drop items(even tho it can => ghosting) only the
			//server allowed and it can tell the client after
			if (event.getEntity().world.isRemote == false) {
				Item itemToAdd = TutorialItems.BASIC_STAR_ITEM;

				event.getEntity().dropItem(itemToAdd, 2);
			}
		}
	}
	/*@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void reeewdyeven(LivingDeathEvent event){
		Minecraft mc = Minecraft.getMinecraft();
		mc.player.sendChatMessage(" died");
		if (event.getEntity().world.isRemote==true){
			System.out.println("isremote");
			mc.player.sendStatusMessage(new TextComponentString(ChatFormatting.GREEN+"Client says you died"), false);
		}
		else{
			System.out.println("isNOTremote");
			mc.player.sendStatusMessage(new TextComponentString(ChatFormatting.GREEN+"Server says you died"), false);
		}

		if (event.getEntityLiving() instanceof  EntityPlayer || true) {
			System.out.println("asd");
			/*Minecraft mc = Minecraft.getMinecraft();
			mc.player.sendChatMessage(" died");
			if (event.getEntity().world.isRemote==true){
				System.out.println("isremote");
				mc.player.sendStatusMessage(new TextComponentString(ChatFormatting.GREEN+"Client says you died"), false);
			}
			else{
				System.out.println("isNOTremote");
				mc.player.sendStatusMessage(new TextComponentString(ChatFormatting.GREEN+"Server says you died"), false);
			}




		}
	}
	@SideOnly(Side.SERVER)
	@SubscribeEvent
	public void reeewdyevenn(LivingDeathEvent event){
		if (event.getEntityLiving() instanceof  EntityPlayer){
			MinecraftServer server = event.getEntity().world.getMinecraftServer();
			server.sendMessage(new TextComponentString(event.getEntity().getName()+" reeeeeeeeeeee"));
			server.getPlayerList().sendMessage(new TextComponentString("REEEEEEEEEEEEEE"));


		}
	}
*/

	/*@SubscribeEvent
	public void cathcHit(LivingAttackEvent event) {
		//if (event.getEntity().world.isRemote == false) {
			if (event.getEntity() != null ) {
				if ( event.getSource().getTrueSource() != null){

					event.getSource().getTrueSource().setPosition(-104, 74, 257);

				}
			}
		//}
	}*/



	/*@SubscribeEvent
	public  void  catchEntitySpawn(EntityJoinWorldEvent event){
		if (event.getEntity().getName() == "Cow"){
			//event.getEntity()
		}
	}*/

	/*@SubscribeEvent
	public void drops(LivingDropsEvent event) {
		//Creates the item
		//Item itemToAdd = new com.eiachh.mainmod.init.TutorialItems().BASIC_STAR_ITEM;
		ItemStack stack = new ItemStack(Items.COMMAND_BLOCK_MINECART);
		if (event.getEntity().world.isRemote == false) {
			//this is the droppable existing item on the ground acts like an actual living entity eg:Cow just doesnt move XD
			EntityItem entityItemToAdd = new EntityItem(event.getEntity().getEntityWorld(),
					event.getEntity().chunkCoordX,
					event.getEntity().chunkCoordY,
					event.getEntity().chunkCoordZ,
					stack);

			event.dr.add(entityItemToAdd);
			event.getEntity().getEntityData().
			//event.getEntity().dropItem(itemToAdd, 1);
		}


		System.out.println("Dieded and drops a star?");
	}*/
}
