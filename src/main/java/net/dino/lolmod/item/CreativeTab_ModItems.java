package net.dino.lolmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CreativeTab_ModItems {
    public static final CreativeModeTab MAIN = new CreativeModeTab("League Of Legends"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.Noxian_Guillotine.get()); // 아이콘으로 사용할 아이템
        }
    };
}
