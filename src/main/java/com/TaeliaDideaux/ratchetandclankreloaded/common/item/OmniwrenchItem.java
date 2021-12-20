package com.TaeliaDideaux.ratchetandclankreloaded.common.item;

import com.TaeliaDideaux.ratchetandclankreloaded.core.init.BlockInit;
import com.TaeliaDideaux.ratchetandclankreloaded.core.init.ToolMaterialInit;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class OmniwrenchItem extends AxeItem {

	public OmniwrenchItem(Properties properties) {
		super(ToolMaterialInit.RARITANIUM, 7.0F, -3.0F, properties);
	}
	
	@Override
    public float getDestroySpeed(ItemStack itemStack, BlockState blockState) {
        Block block = blockState.getBlock();
        return block == BlockInit.BOLT_CRATE.get() ? super.getDestroySpeed(itemStack, blockState) * 40 : 0;
    }

}
