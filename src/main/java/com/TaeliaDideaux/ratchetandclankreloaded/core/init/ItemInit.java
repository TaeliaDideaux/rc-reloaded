package com.TaeliaDideaux.ratchetandclankreloaded.core.init;

import com.TaeliaDideaux.ratchetandclankreloaded.RatchetAndClankReloadedMod;
import com.TaeliaDideaux.ratchetandclankreloaded.common.item.OmniwrenchItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {
	private ItemInit() {}
	
	public static final DeferredRegister<Item> 				ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RatchetAndClankReloadedMod.MODID);
	
	
	
	public static final RegistryObject<BlockItem> 			BOLT_CRATE_ITEM = ITEMS.register("bolt_crate",
			() -> new BlockItem(BlockInit.BOLT_CRATE.get(), new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<BlockItem> 			RARITANIUM_ORE_ITEM = ITEMS.register("raritanium_ore",
			() -> new BlockItem(BlockInit.RARITANIUM_ORE.get(), new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<BlockItem> 			DEEPSLATE_RARITANIUM_ORE_ITEM = ITEMS.register("deepslate_raritanium_ore",
			() -> new BlockItem(BlockInit.DEEPSLATE_RARITANIUM_ORE.get(), new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<Item> 				BOLT = ITEMS.register("bolt",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<Item> 				RAW_RARITANIUM = ITEMS.register("raw_raritanium",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));

	public static final RegistryObject<Item> 				REFINED_RARITANIUM = ITEMS.register("refined_raritanium",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<Item> 				RARITANIUM_ALLOY_NUGGET = ITEMS.register("raritanium_alloy_nugget",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<Item> 				RARITANIUM_ALLOY = ITEMS.register("raritanium_alloy",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<BlockItem> 			RARITANIUM_BLOCK_ITEM = ITEMS.register("raritanium_block",
			() -> new BlockItem(BlockInit.RARITANIUM_BLOCK.get(), new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	public static final RegistryObject<ForgeSpawnEggItem> 	CLANK_SPAWN_EGG = ITEMS.register("clank_spawn_egg",
			() -> new ForgeSpawnEggItem(EntityInit.CLANK, 0xAFAFAF, 0x505050, new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_TAB)));
	
	
	
	public static final RegistryObject<Item> 				WRENCH_HANDLE = ITEMS.register("wrench_handle",
			() -> new Item(new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_WEAPONS_TAB)));
	
	public static final RegistryObject<Item> 				OMNIWRENCH = ITEMS.register("omniwrench",
			() -> new OmniwrenchItem(ToolMaterialInit.RARITANIUM, new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_WEAPONS_TAB)));
	
	public static final RegistryObject<Item> 				OMNIWRENCH10000 = ITEMS.register("omniwrench10000",
			() -> new OmniwrenchItem(ToolMaterialInit.RARITANIUM, new Item.Properties().tab(RatchetAndClankReloadedMod.RCRELOADED_WEAPONS_TAB)));
	
}
