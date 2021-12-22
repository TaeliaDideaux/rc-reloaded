package com.TaeliaDideaux.ratchetandclankreloaded;

import com.TaeliaDideaux.ratchetandclankreloaded.core.init.BlockInit;
import com.TaeliaDideaux.ratchetandclankreloaded.core.init.EntityInit;
import com.TaeliaDideaux.ratchetandclankreloaded.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import software.bernie.geckolib3.GeckoLib;

@Mod(RatchetAndClankReloadedMod.MODID )
public class RatchetAndClankReloadedMod {
	
	public static final String MODID = "ratchetandclankreloaded";
	
	public RatchetAndClankReloadedMod() {
		
		var bus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITIES.register(bus);
		
		GeckoLib.initialize();
	}
	
	// Creative tabs
	
	public static final CreativeModeTab RCRELOADED_TAB = new CreativeModeTab("rcreloadedtab") {
		@Override public ItemStack makeIcon() { return ItemInit.BOLT_CRATE_ITEM.get().getDefaultInstance(); }
	};
	
	public static final CreativeModeTab RCRELOADED_WEAPONS_TAB = new CreativeModeTab("rcreloadedweaponstab") {
		@Override public ItemStack makeIcon() { return ItemInit.OMNIWRENCH10000.get().getDefaultInstance(); }
	};
}
