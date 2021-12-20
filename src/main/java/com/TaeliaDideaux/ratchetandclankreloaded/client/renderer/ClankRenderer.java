package com.TaeliaDideaux.ratchetandclankreloaded.client.renderer;

import com.TaeliaDideaux.ratchetandclankreloaded.client.renderer.model.ClankModel;
import com.TaeliaDideaux.ratchetandclankreloaded.common.entity.Clank;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ClankRenderer<Type extends Clank> extends GeoEntityRenderer<Clank> {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ClankRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ClankModel());
		this.shadowRadius = 0.7F;
	}

}
