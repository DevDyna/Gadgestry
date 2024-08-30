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
                        // APIARY
                        // --------------------------------------------------------------//
                        output.accept(BasicItem.SCOOP.get());
                        output.accept(BasicItem.BEEWAX.get());
                        output.accept(BasicItem.BEE.get());
                        // --------------------------------------------------------------//
                        // GATHERING
                        // -------------------------------------------------------------------//
                        output.accept(BasicItem.POTASSIUM.get());
                        output.accept(BasicItem.RESIN.get());
                        output.accept(BasicItem.PATINA.get());
                        output.accept(BasicItem.RAW_COPPER_NUGGET.get());
                        output.accept(BasicItem.RAW_GOLD_NUGGET.get());
                        output.accept(BasicItem.RAW_IRON_NUGGET.get());

                        // TOOLS
                        // --------------------------------------------------------------//
                        //----------//AQUAMARINE
                        output.accept(BasicItem.AQUAMARINE_AXE.get());
                        output.accept(BasicItem.AQUAMARINE_HOE.get());
                        output.accept(BasicItem.AQUAMARINE_PICKAXE.get());
                        output.accept(BasicItem.AQUAMARINE_SWORD.get());
                        output.accept(BasicItem.AQUAMARINE_SHOVEL.get());
                        //----------//ROSE DIAMOND
                        output.accept(BasicItem.ROSE_DIAMOND_AXE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_HOE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_PICKAXE.get());
                        output.accept(BasicItem.ROSE_DIAMOND_SWORD.get());
                        output.accept(BasicItem.ROSE_DIAMOND_SHOVEL.get());
                        // GEMS
                        // --------------------------------------------------------------//
                        output.accept(BasicItem.APATITE.get());
                        output.accept(BasicItem.AQUAMARINE.get());
                        output.accept(BasicItem.BLUE_TANZANITE.get());
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
                        // -------------------------------------------------------------------//
                        // BLOCKITEM
                        // --------------------------------------------------------------//
                        output.accept(BasicItem.ITEM_TREASURE_POT.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_COMBINER.get());
                        output.accept(BasicItem.ITEM_FANCY_LABORATORY_DISSOLVER.get());
                        output.accept(BasicItem.ITEM_ARCHEOLOGY_TABLE.get());
                        // --------------------------------------------------------------//
                        output.accept(BasicItem.ROTTEN_BALL.get());
                        output.accept(BasicItem.GEM_TEMPLATE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
