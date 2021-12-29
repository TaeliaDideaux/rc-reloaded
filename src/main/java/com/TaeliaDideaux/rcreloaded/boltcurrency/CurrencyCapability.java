package com.TaeliaDideaux.rcreloaded.boltcurrency;

import com.TaeliaDideaux.rcreloaded.RatchetAndClankReloadedMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

public class CurrencyCapability {
	
	public static Capability<ICurrencyCapability> CURRENCY_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() {});
	public static final ResourceLocation CAPABILITY_KEY = new ResourceLocation(RatchetAndClankReloadedMod.MODID, "currency");

}
