package com.TaeliaDideaux.ratchetandclankreloaded.core.event;

import com.TaeliaDideaux.ratchetandclankreloaded.common.item.OmniwrenchItem;
import com.TaeliaDideaux.ratchetandclankreloaded.core.init.ItemInit;

import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;

public class OmniwrenchCauldronInteraction implements CauldronInteraction {

	@Override
	public InteractionResult interact(BlockState blocstate, Level lvel, BlockPos pos, Player player, InteractionHand hand, ItemStack itemStack) { return null; }
	
	static CauldronInteraction OMNIWRENCH_INTERACTION = (BlockState blockstate, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack itemStack) -> {
	    Item item = itemStack.getItem();
	    if (!(item instanceof OmniwrenchItem)) { return InteractionResult.PASS; }
	    else {
	        if (!level.isClientSide) {
	        	ItemStack newItemStack = new ItemStack(ItemInit.OMNIWRENCH.get());
	            
	            player.setItemInHand(hand, newItemStack);
	            player.awardStat(Stats.CLEAN_ARMOR);
	            
	            LayeredCauldronBlock.lowerFillLevel(blockstate, level, pos);
	        }
	
	        return InteractionResult.sidedSuccess(level.isClientSide);
	    }
	};

}
