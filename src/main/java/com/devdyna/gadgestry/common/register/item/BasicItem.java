package com.devdyna.gadgestry.common.register.item;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.common.register.block.BasicBlock;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
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

        public static final RegistryObject<Item> ITEM_TREASURE_POT = ITEMS.register("treasure_pot",
                        () -> new BlockItem(BasicBlock.TREASURE_POT.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_FANCY_LABORATORY_COMBINER = ITEMS.register(
                        "fancy_laboratory_combiner",
                        () -> new BlockItem(BasicBlock.FANCY_LABORATORY_COMBINER.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_FANCY_LABORATORY_DISSOLVER = ITEMS.register(
                        "fancy_laboratory_dissolver",
                        () -> new BlockItem(BasicBlock.FANCY_LABORATORY_DISSOLVER.get(), new Item.Properties()));

        public static final RegistryObject<Item> CROOK = ITEMS.register("crook",
                        () -> new HoeItem(Tiers.IRON, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe",
                        () -> new PickaxeItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        public static final RegistryObject<Item> STEW = ITEMS.register("stew",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                                        .alwaysEat().nutrition(3).saturationMod(5f).build())));

        public static final RegistryObject<Item> ITEM_ARCHEOLOGY_TABLE = ITEMS.register(
                        "archeology_table",
                        () -> new BlockItem(BasicBlock.ARCHEOLOGY_TABLE.get(), new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }

}
