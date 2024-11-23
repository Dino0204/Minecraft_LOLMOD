package net.dino.lolmod.item;

import net.dino.lolmod.LolMod;
import net.dino.lolmod.entity.ModEntityTypes;
import net.dino.lolmod.item.custom.NightOfDownfall_Item;
import net.dino.lolmod.item.custom.NoxianGuillotine_Item;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LolMod.MOD_ID);

    // 아이템 등록

    public static final RegistryObject<Item> NIGHT_OF_DOWNFALL = ITEMS.register("night_of_downfall",
            () -> new NightOfDownfall_Item(Tiers.NETHERITE, 7, -2.0f));

    public static final RegistryObject<Item> Noxian_Guillotine = ITEMS.register("noxian_guillotine",
            () -> new NoxianGuillotine_Item(Tiers.NETHERITE, 10, -2.4f));

    public static final RegistryObject<Item> MINION_SPAWN_EGG = ITEMS.register("minion_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MINION, 0xDC143C, 0xFFFFE0,
                    new Item.Properties().tab(CreativeTab_ModItems.MAIN)));

    public static final RegistryObject<Item> CHAOS_MINION_SPAWN_EGG = ITEMS.register("chaos_minion_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CHAOS_MINION, 0xFF0000, 0xFFFF00,
                    new Item.Properties().tab(CreativeTab_ModItems.MAIN)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}