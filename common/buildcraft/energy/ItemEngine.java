/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.energy;

import buildcraft.core.ItemBlockBuildCraft;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemEngine extends ItemBlockBuildCraft {

	public ItemEngine(Block block) {
		super(block);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int i) {
		return i;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		if (itemstack.getItemDamage() == 0)
			return "tile.engineWood";
		else if (itemstack.getItemDamage() == 1)
			return "tile.engineStone";
		else
			return "tile.engineIron";
	}
}
