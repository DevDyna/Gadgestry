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

    public static final RegistryObject<CreativeModeTab> TAB_APIARY = CREATIVE_MODE_TABS.register("apiary",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(BasicItem.SCOOP.get()))
                    .title(Component.translatable("tab.gadgestry.apiary.name"))
                    .displayItems((parameters, output) -> {
                        output.accept(BasicItem.SCOOP.get());
                        output.accept(BasicItem.BEEWAX.get());
                        output.accept(BasicItem.BEE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> TAB_RESOURCE = CREATIVE_MODE_TABS.register("resource",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(BasicItem.PATINA.get()))
                    .title(Component.translatable("tab.gadgestry.resource.name"))
                    .displayItems((parameters, output) -> {

                        // extra
                        output.accept(BasicItem.POTASSIUM.get());
                        output.accept(BasicItem.RESIN.get());
                        output.accept(BasicItem.PATINA.get());
                        output.accept(BasicItem.RAW_COPPER_NUGGET.get());
                        output.accept(BasicItem.COPPER_NUGGET.get());
                        output.accept(BasicItem.RAW_GOLD_NUGGET.get());
                        output.accept(BasicItem.RAW_IRON_NUGGET.get());
                        output.accept(BasicItem.ROTTEN_BALL.get());
                        output.accept(BasicItem.GEM_TEMPLATE.get());
                        output.accept(BasicItem.IRON_ROD.get());
                        // gems
                        output.accept(BasicItem.APATITE.get());
                        output.accept(BasicItem.AQUAMARINE.get());
                        output.accept(BasicItem.TANZANITE.get());
                        output.accept(BasicItem.CITRINE.get());
                        output.accept(BasicItem.DARK_QUARTZ.get());
                        output.accept(BasicItem.IOLITE.get());
                        output.accept(BasicItem.JADE.get());
                        output.accept(BasicItem.KUNZITE.get());
                        output.accept(BasicItem.OLIVINE.get());
                        output.accept(BasicItem.ROSE_DIAMOND.get());
                        output.accept(BasicItem.SUNSTONE.get());
                        output.accept(BasicItem.TOPAZ.get());
                        output.accept(BasicItem.TSAVORITE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> TAB_TOOL = CREATIVE_MODE_TABS.register("tool",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(BasicItem.ROSE_DIAMOND_PICKAXE.get()))
                    .title(Component.translatable("tab.gadgestry.tools.name"))
                    .displayItems((parameters, output) -> {
                        // ----------//AQUAMARINE
                        output.accept(BasicItem.AQUAMARINE_AXE.get());
                        output.accept(BasicItem.AQUAMARINE_HOE.get());
                        output.accept(BasicItem.AQUAMARINE_PICKAXE.get());
                        output.accept(BasicItem.AQUAMARINE_SWORD.get());
                        output.accept(BasicItem.AQUAMARINE_SHOVEL.get());
                        // ----------//ROSE DIAMOND
                        output.accept(BasicItem.ROSE_DIAMOND_AXE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_HOE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_PICKAXE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_SWORD.get());
                        output.accept(BasicItem.ROSE_DIAMOND_SHOVEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> TAB_BLOCKITEM = CREATIVE_MODE_TABS.register("blockitem",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(BasicItem.ITEM_FANCY_LABORATORY_DISSOLVER.get()))
                    .title(Component.translatable("tab.gadgestry.blockitem.name"))
                    .displayItems((parameters, output) -> {
                        output.accept(BasicItem.ITEM_TREASURE_POT.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_COMBINER.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_DISSOLVER.get());
                        output.accept(BasicItem.ITEM_ARCHEOLOGY_TABLE.get());
                        output.accept(BasicItem.ITEM_TERMITE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
