package com.eiachh.mainmod.tools;

import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.block.PurpleLamp;
import com.eiachh.mainmod.init.TutorialBlocks;
import javafx.geometry.Pos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import sun.applet.Main;

public class PortaRodTool extends ItemPickaxe {

   public int savedX;
   public int savedY;
   public int savedZ;
   public boolean hasSavedLocation=false;


    public PortaRodTool(ToolMaterial material,String registryName) {
        super(material);

        setUnlocalizedName(MainModpls.MODID+"."+registryName);
        setRegistryName(registryName);
        setCreativeTab(MainModpls.TUTORIAL_TAB);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        return 1.0F;
    }

    /*@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {


        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    /* public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }*/

    public void placePlaceholderAt(World world, BlockPos pos){

        //has to calculate the rotation so it wont repleace blocks in ceeling or in wall
        BlockPos blockPos = new BlockPos(pos.getX(),(pos.getY()+1),pos.getZ());
        PurpleLamp blockToPlaceAsPlaceHolder = (PurpleLamp) TutorialBlocks.PURPLE_LAMP;
        IBlockState istate = blockToPlaceAsPlaceHolder.getDefaultState();
        world.setBlockState(blockPos, istate);

        savedX=blockPos.getX();
        savedY=blockPos.getY();
        savedZ=blockPos.getZ();

        hasSavedLocation=true;

    }

    public void teleportEntity(Entity entity){
        if (hasSavedLocation){
            entity.setPosition(savedX, savedY, savedZ);
            System.out.println("jsutwhy");
        }
    }
}