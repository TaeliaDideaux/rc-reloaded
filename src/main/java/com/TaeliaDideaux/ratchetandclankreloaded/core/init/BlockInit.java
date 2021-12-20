package com.TaeliaDideaux.ratchetandclankreloaded.core.init;

import com.TaeliaDideaux.ratchetandclankreloaded.RatchetAndClankReloadedMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	private BlockInit() {}
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RatchetAndClankReloadedMod.MODID);

	
	public static final RegistryObject<Block> BOLT_CRATE 				= BLOCKS.register("bolt_crate",
			() -> new FallingBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(4F)));
	
	public static final RegistryObject<Block> RARITANIUM_ORE 			= BLOCKS.register("raritanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> DEEPSLATE_RARITANIUM_ORE 	= BLOCKS.register("deepslate_raritanium_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4.5F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
	
	public static final RegistryObject<Block> RARITANIUM_BLOCK 			= BLOCKS.register("raritanium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
}