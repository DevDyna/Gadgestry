package com.devdyna.gadgestry.common.register.tab;

import com.devdyna.gadgestry.Gadgestry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gadgestry.common.register.item.BasicItem;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, Gadgestry.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> new ItemStack(BasicItem.SCOOP.get()))
                    .title(Component.translatable("tab.gadgestry.name"))
                    .displayItems((parameters, output) -> {
                        output.accept(BasicItem.SCOOP.get());
                        output.accept(BasicItem.FLOREAL_BONEMEAL.get());
                        output.accept(BasicItem.MINERAL_BONEMEAL.get());
                        output.accept(BasicItem.BEEWAX.get());
                        output.accept(BasicItem.BEE.get());
                        output.accept(BasicItem.IOLITE.get());
                        output.accept(BasicItem.JADE.get());
                        output.accept(BasicItem.TOPAZ.get());
                        output.accept(BasicItem.AQUAMARINE.get());
                        output.accept(BasicItem.ITEM_TREASURE_POT.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_COMBINER.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_DISSOLVER.get());
                        output.accept(BasicItem.CROOK.get());
                        output.accept(BasicItem.AQUAMARINE_PICKAXE.get());
                        output.accept(BasicItem.STEW.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
