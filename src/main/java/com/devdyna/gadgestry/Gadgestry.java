package com.devdyna.gadgestry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(Gadgestry.MODID)
public class Gadgestry {
        public static final String MODID = "gadgestry";

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        Gadgestry.MODID);
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
                        .create(Registries.CREATIVE_MODE_TAB, Gadgestry.MODID);
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        Gadgestry.MODID);

        public Gadgestry() {
                IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
                // modEventBus.addListener(this::commonSetup);
                BLOCKS.register(modEventBus);
                ITEMS.register(modEventBus);
                CREATIVE_MODE_TABS.register(modEventBus);

        }
}
