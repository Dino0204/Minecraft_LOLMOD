package net.dino.lolmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.custom.ChaosMinionEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChaosMinionRenderer extends GeoEntityRenderer<ChaosMinionEntity> {
    public ChaosMinionRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChaosMinionModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(ChaosMinionEntity instance) {
        return new ResourceLocation(LolMod.MOD_ID, "textures/entity/chaos_minion.png");
    }

    @Override
    public RenderType getRenderType(ChaosMinionEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

