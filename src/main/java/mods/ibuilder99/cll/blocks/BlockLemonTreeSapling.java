package mods.ibuilder99.cll.blocks;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.ibuilder99.cll.CombustibleLemonLauncher;
import mods.ibuilder99.cll.lib.Reference;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * Combustible Lemon Launcher
 * Copyright (c) 2014 Phil Julian
 * @author Phil Julian (aka iBuilder99)
 */

public class BlockLemonTreeSapling extends BlockSapling {

	public BlockLemonTreeSapling(String unloc, float hardness, float resistance, SoundType sound){
		super();
		setBlockName(unloc);
		setHardness(hardness);
		setResistance(resistance);
		setStepSound(sound);
		setBlockTextureName(Reference.TEXTURE_PREFIX + unloc);
		setCreativeTab(CombustibleLemonLauncher.TAB_COMBUSTIBLE_LEMON_LAUNCHER);
		GameRegistry.registerBlock(this, unloc);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister){
		blockIcon = par1IconRegister.registerIcon(textureName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metaData) {
		return blockIcon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void getSubBlocks(Item item, CreativeTabs tab, List list){
		list.add(new ItemStack(item, 1, 0));
	}
	
	
}
