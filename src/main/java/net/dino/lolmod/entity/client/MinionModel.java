package net.dino.lolmod.entity.client;

import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.custom.MinionEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MinionModel extends AnimatedGeoModel<MinionEntity> {
    @Override
    public ResourceLocation getModelResource(MinionEntity minionEntity) {
        return new ResourceLocation(LolMod.MOD_ID,"geo/minion.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MinionEntity minionEntity) {
        return new ResourceLocation(LolMod.MOD_ID,"textures/entity/minion.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MinionEntity minionEntity) {
        return new ResourceLocation(LolMod.MOD_ID,"animations/minion.animation.json");
    }
}
