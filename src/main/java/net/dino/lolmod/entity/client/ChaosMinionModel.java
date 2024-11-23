package net.dino.lolmod.entity.client;

import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.custom.ChaosMinionEntity;
import net.dino.lolmod.entity.custom.MinionEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChaosMinionModel extends AnimatedGeoModel<ChaosMinionEntity> {
    @Override
    public ResourceLocation getModelResource(ChaosMinionEntity entity) {
        return new ResourceLocation(LolMod.MOD_ID, "geo/chaos_minion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChaosMinionEntity entity) {
        return new ResourceLocation(LolMod.MOD_ID, "textures/entity/chaos_minion.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChaosMinionEntity entity) {
        return new ResourceLocation(LolMod.MOD_ID, "animations/chaos_minion.animation.json");
    }
}

