package com.devdyna.gadgestry.common.register.item;

import com.devdyna.gadgestry.Gadgestry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class BasicItem {

    public static final RegistryObject<Item> SCOOP = Gadgestry.ITEMS.register("scoop",
            () -> new Item(new Item.Properties().durability(128)));

            public static final RegistryObject<Item> FLOREAL_BONEMEAL = Gadgestry.ITEMS.register("floreal bonemeal",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> MINERAL_BONEMEAL = Gadgestry.ITEMS.register("mineral bonemeal",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> BEEWAX = Gadgestry.ITEMS.register("beewax",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> BEE = Gadgestry.ITEMS.register("bee",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> IOLITE = Gadgestry.ITEMS.register("iolite",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> JADE = Gadgestry.ITEMS.register("jade",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> TOPAZ = Gadgestry.ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

            public static final RegistryObject<Item> AQUAMARINE = Gadgestry.ITEMS.register("aquamarine",
            () -> new Item(new Item.Properties()));








}
