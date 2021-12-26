package com.TaeliaDideaux.ratchetandclankreloaded.core.init;

import com.TaeliaDideaux.ratchetandclankreloaded.RatchetAndClankReloadedMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class SoundsInit {
	private SoundsInit() {}
	
	
	public static final DeferredRegister<SoundEvent> 	SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RatchetAndClankReloadedMod.MODID);
	
	public static final RegistryObject<SoundEvent> 		BOLT_CRATE_BREAKING = SOUNDS.register("block.bolt_crate.break", 
			() -> new SoundEvent(new ResourceLocation(RatchetAndClankReloadedMod.MODID, "block.bolt_crate.break")));

}
