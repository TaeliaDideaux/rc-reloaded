package com.TaeliaDideaux.ratchetandclankreloaded.core.init;

import com.TaeliaDideaux.ratchetandclankreloaded.RatchetAndClankReloadedMod;
import com.TaeliaDideaux.ratchetandclankreloaded.common.entity.Clank;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class EntityInit {
	
	private EntityInit() {}
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, RatchetAndClankReloadedMod.MODID);
	
	public static final RegistryObject<EntityType<Clank>> 	CLANK = ENTITIES.register("clank",
			() -> EntityType.Builder.of(Clank::new, MobCategory.MISC).sized(0.8F, 1.5F)
				.build(new ResourceLocation(RatchetAndClankReloadedMod.MODID, "clank").toString()));

}
