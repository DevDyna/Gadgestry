package com.devdyna.gadgestry.common.register.tab;

import com.devdyna.gadgestry.Gadgestry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;

import net.minecraftforge.registries.RegistryObject;
import com.devdyna.gadgestry.common.register.item.FoodItem;

public class CreativeTab {

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = Gadgestry.CREATIVE_MODE_TABS.register(
            Gadgestry.MODID + "_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> FoodItem.STEW.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(FoodItem.STEW.get());
                    }).build());

}
