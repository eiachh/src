package com.eiachh.mainmod.gui;

import com.eiachh.mainmod.MainModpls;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class FirstGuiScreen extends GuiScreen {
    ResourceLocation texture = new ResourceLocation(MainModpls.MODID,"textures/gui/gui_background.png");

    //maximum value cant be bigger pic nor smaller
    int width = 256;
    int height=256;


    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        drawTexturedModalRect(200, 200, 0, 0, width, height);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void initGui() {
        super.initGui();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
