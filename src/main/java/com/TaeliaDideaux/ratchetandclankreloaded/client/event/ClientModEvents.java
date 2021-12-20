package com.TaeliaDideaux.ratchetandclankreloaded.client.event;

import com.TaeliaDideaux.ratchetandclankreloaded.RatchetAndClankReloadedMod;
import com.TaeliaDideaux.ratchetandclankreloaded.client.renderer.ClankRenderer;
import com.TaeliaDideaux.ratchetandclankreloaded.core.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = RatchetAndClankReloadedMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	
	private ClientModEvents() {}
	
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityInit.CLANK.get(), ClankRenderer::new);
	}

}