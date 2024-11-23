package net.dino.lolmod.entity;

import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.custom.ChaosMinionEntity;
import net.dino.lolmod.entity.custom.MinionEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LolMod.MOD_ID);

    public static final RegistryObject<EntityType<MinionEntity>> MINION =
            ENTITY_TYPES.register("minion",()
            -> EntityType.Builder.of(MinionEntity::new, MobCategory.MONSTER)
                    .sized(0.4f,1.5f)
                    .build(new ResourceLocation(LolMod.MOD_ID,"minion").toString()));

    public static final RegistryObject<EntityType<ChaosMinionEntity>> CHAOS_MINION =
            ENTITY_TYPES.register("chaos_minion", () ->
                    EntityType.Builder.of(ChaosMinionEntity::new, MobCategory.MONSTER)
                            .sized(0.6f, 1.5f)
                            .build(new ResourceLocation(LolMod.MOD_ID, "chaos_minion").toString()));

    public static void register(IEventBus eventBus)
    {
        ENTITY_TYPES.register(eventBus);
    }
}
