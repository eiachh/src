package com.eiachh.mainmod.tools;

import com.eiachh.mainmod.MainModpls;
import com.eiachh.mainmod.block.PortaRodPlaceHolder;
import com.eiachh.mainmod.block.PurpleLamp;
import com.eiachh.mainmod.init.TutorialBlocks;
import javafx.geometry.Pos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
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

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (player.world.isRemote == false) {
            if (player.isSneaking()) {
                this.placePlaceholderAt(player.world, pos);
            }
        }
        return EnumActionResult.SUCCESS;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (playerIn.isSneaking()){
            this.teleportEntity(playerIn);
        }
        ItemStack item = playerIn.getHeldItem(handIn);

        return new ActionResult<ItemStack>( EnumActionResult.SUCCESS,item);
    }

    public void placePlaceholderAt(World world, BlockPos pos){

        if (hasSavedLocation)
        {
            BlockPos blockPos = new BlockPos(savedX,savedY,savedZ);
            world.setBlockState(blockPos, Blocks.AIR.getDefaultState());
            hasSavedLocation =false;
        }
        //has to calculate the rotation so it wont replace blocks in ceiling or in wall
        BlockPos blockPos = new BlockPos(pos.getX(),(pos.getY()+1),pos.getZ());
        PortaRodPlaceHolder blockToPlaceAsPlaceHolder = (PortaRodPlaceHolder) TutorialBlocks.PORTA_ROD_PLACE_HOLDER_BLOCK;
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
        }
    }
}