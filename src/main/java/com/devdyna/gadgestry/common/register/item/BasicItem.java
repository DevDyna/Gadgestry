package com.devdyna.gadgestry.common.register.item;

import com.devdyna.gadgestry.Gadgestry;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Gadgestry.MODID);

    public static final RegistryObject<Item> SCOOP = ITEMS.register("scoop",
            () -> new Item(new Item.Properties().durability(128)));

    public static final RegistryObject<Item> FLOREAL_BONEMEAL = ITEMS.register("floreal_bonemeal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MINERAL_BONEMEAL = ITEMS.register("mineral_bonemeal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BEEWAX = ITEMS.register("beewax",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BEE = ITEMS.register("bee",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IOLITE = ITEMS.register("iolite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
