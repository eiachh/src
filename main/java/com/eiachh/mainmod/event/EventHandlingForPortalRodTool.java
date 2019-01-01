package com.eiachh.mainmod.event;

import com.eiachh.mainmod.init.TutorialPickaxe;
import com.eiachh.mainmod.pickaxe.PickaxeBasic;
import com.eiachh.mainmod.tools.PortaRodTool;
import net.java.games.input.Keyboard;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandlingForPortalRodTool {
    @SubscribeEvent
    public void catchPlayerInterract(PlayerInteractEvent.RightClickBlock event) {
        if (event.getEntityPlayer().world.isRemote == false) {
            if (event.getEntityPlayer().getHeldItemMainhand().getItem() instanceof PortaRodTool) {
                if (event.getEntityPlayer().isSneaking()) {
                    PortaRodTool temp = (PortaRodTool) event.getEntityPlayer().getHeldItemMainhand().getItem();
                    temp.placePlaceholderAt(event.getEntityPlayer().world, event.getPos());
                }
            }
        }
    }

    @SubscribeEvent
    public void catchPlayerRightclick(PlayerInteractEvent.RightClickItem event) {
        if (event.getEntityPlayer().getHeldItemMainhand().getItem() instanceof PortaRodTool) {
            if (event.getEntity().isSneaking()) {
                if (event.getEntityPlayer().world.isRemote == false) {
                    PortaRodTool temp = (PortaRodTool) event.getEntityPlayer().getHeldItemMainhand().getItem();
                    System.out.println("wat");
                    temp.teleportEntity(event.getEntity());
                }
                else{
                    PortaRodTool temp = (PortaRodTool) event.getEntityPlayer().getHeldItemMainhand().getItem();
                    System.out.println("true");
                    temp.teleportEntity(event.getEntity());
                }

            }
        }
    }

    @SubscribeEvent
    public void playerRightClickingEntity(PlayerInteractEvent.EntityInteractSpecific event) {
        if (event.getEntity().world.isRemote == false) {
            if (event.getEntityPlayer().getHeldItemMainhand().getItem() instanceof PortaRodTool) {
                PortaRodTool temp = (PortaRodTool) event.getEntityPlayer().getHeldItemMainhand().getItem();
                temp.teleportEntity(event.getTarget());
            }
        }
    }
}
