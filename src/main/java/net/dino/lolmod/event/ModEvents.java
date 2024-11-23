package net.dino.lolmod.event;

import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.ModEntityTypes;
import net.dino.lolmod.entity.custom.MinionEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = LolMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.MINION.get(), MinionEntity.setAttributes());
            event.put(ModEntityTypes.CHAOS_MINION.get(), MinionEntity.setAttributes());
        }
    }
}
