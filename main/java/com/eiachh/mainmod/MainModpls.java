package com.eiachh.mainmod;
 
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.storage.loot.LootTableList;

import com.eiachh.mainmod.event.LootTableCatch;
import com.eiachh.mainmod.proxy.IProxy;
import com.eiachh.mainmod.recipes.My_Recipes;
import com.eiachh.mainmod.tabs.NewTab;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
@Mod(modid = MainModpls.MODID, name = MainModpls.NAME, version = MainModpls.VERSION, acceptedMinecraftVersions = MainModpls.MC_VERSION)
public class MainModpls {
 
    public static final String MODID = "cutsiemod";
    public static final String NAME = "Cutsiemod yaas";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
    
    public static final String CLIENT = "com.eiachh.mainmod.proxy.ClientProxy";
    public static final String SERVER = "com.eiachh.mainmod.proxy.ServerProxy";
 
    public static final CreativeTabs TUTORIAL_TAB = new NewTab("mainTab");
    
    String asd ="LULULULLULULULULULULULLULULULULLULULULULULULU";
    
    
    @SidedProxy(clientSide = MainModpls.CLIENT, serverSide=MainModpls.SERVER)
    public static IProxy proxy;
    
    public static Logger logger;

    
    //dasda
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        this.asd="RTRTRTRTRTRTTTRT";
        MinecraftForge.EVENT_BUS.register(new LootTableCatch());

    }

  
 
    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(MainModpls.NAME  + "says hi!");
        proxy.init(event);
        My_Recipes.initSmelting();
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    	
    	logger.info(asd);
    }
 
}