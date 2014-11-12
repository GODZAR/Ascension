package com.thexfactor117.ascension.blocks;

import com.thexfactor117.ascension.help.Reference;
import com.thexfactor117.ascension.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockFieryNetherrack extends Block
{
	public BlockFieryNetherrack()
	{
		super(Material.grass);
		setCreativeTab(ModTabs.tabAscension);
		setStepSound(soundTypeGlass);
		setHardness(4.0F);
		setResistance(6.0F);
		setHarvestLevel("shovel", 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
