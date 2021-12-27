package com.TaeliaDideaux.rcreloaded;

import com.TaeliaDideaux.rcreloaded.core.init.BlockInit;
import com.TaeliaDideaux.rcreloaded.core.init.EntityInit;
import com.TaeliaDideaux.rcreloaded.core.init.ItemInit;
import com.TaeliaDideaux.rcreloaded.core.init.SoundsInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import software.bernie.geckolib3.GeckoLib;

@Mod(RatchetAndClankReloadedMod.MODID )
public class RatchetAndClankReloadedMod {
	
	public static final String MODID = "rcreloaded";
	
	public RatchetAndClankReloadedMod() {
		
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITIES.register(bus);
		SoundsInit.SOUNDS.register(bus);
		
		GeckoLib.initialize();
	}
	
	public static final CreativeModeTab RCRELOADED_TAB = new CreativeModeTab("rcreloadedtab") {
		@Override public ItemStack makeIcon() { return ItemInit.BOLT_CRATE_ITEM.get().getDefaultInstance(); }
	};
	
	public static final CreativeModeTab RCRELOADED_WEAPONS_TAB = new CreativeModeTab("rcreloadedweaponstab") {
		@Override public ItemStack makeIcon() { return ItemInit.OMNIWRENCH12000.get().getDefaultInstance(); }
	};
}
