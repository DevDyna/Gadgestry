package com.devdyna.gadgestry.common.register.item;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.common.register.block.BasicBlock;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.FoodProperties;
//import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.*;
//import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasicItem {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        Gadgestry.MODID);

        // APIARY
        // -------------------------------------------------------------------//
        public static final RegistryObject<Item> SCOOP = ITEMS.register("scoop",
                        () -> new ScoopItem(new Item.Properties()));

        public static final RegistryObject<Item> BEEWAX = ITEMS.register("beewax",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder().fast().alwaysEat()
                                        .nutrition(4).saturationMod(4)
                                        .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1000), 25)
                                        .build())));

        

        @SuppressWarnings("deprecation")
        public static final RegistryObject<Item> BEE = ITEMS.register("bee",
                        () -> new SpawnEggItem(EntityType.BEE, 15582019, 4400155, new Item.Properties()));
        // -------------------------------------------------------------------//

        // GATHERING
        // --------------------------------------------------------------------------------------//

        public static final RegistryObject<Item> POTASSIUM = ITEMS.register("potassium",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                                        .alwaysEat().nutrition(4).saturationMod(0.3f)
                                        .effect(() -> new MobEffectInstance(MobEffects.WITHER, 100, 200), 75)
                                        .build())));

        public static final RegistryObject<Item> PATINA = ITEMS.register("patina",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                                        .alwaysEat().nutrition(3).saturationMod(0.5f)
                                        .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 1000), 75)
                                        .build())));

        public static final RegistryObject<Item> RAW_COPPER_NUGGET = ITEMS.register("raw_copper_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_GOLD_NUGGET = ITEMS.register("raw_gold_nugget",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_IRON_NUGGET = ITEMS.register("raw_iron_nugget",
                        () -> new Item(new Item.Properties()));

        // TOOLS
        // -------------------------------------------------------------------//
        // ----------//AQUAMARINE
        public static final RegistryObject<Item> AQUAMARINE_PICKAXE = ITEMS.register("aquamarine_pickaxe",
                        () -> new PickaxeItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE_AXE = ITEMS.register("aquamarine_axe",
                        () -> new AxeItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE_SWORD = ITEMS.register("aquamarine_sword",
                        () -> new SwordItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE_HOE = ITEMS.register("aquamarine_hoe",
                        () -> new HoeItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE_SHOVEL = ITEMS.register("aquamarine_shovel",
                        () -> new ShovelItem(TierTool.AQUAMARINE, 2, 1, new Item.Properties()));

        // ----------//ROSE DIAMOND
        public static final RegistryObject<Item> ROSE_DIAMOND_PICKAXE = ITEMS.register("rose_diamond_pickaxe",
                        () -> new PickaxeItem(TierTool.ROSE_DIAMOND, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> ROSE_DIAMOND_AXE = ITEMS.register("rose_diamond_axe",
                        () -> new AxeItem(TierTool.ROSE_DIAMOND, 2, 2, new Item.Properties()));

        public static final RegistryObject<Item> ROSE_DIAMOND_SWORD = ITEMS.register("rose_diamond_sword",
                        () -> new SwordItem(TierTool.ROSE_DIAMOND, 1, 1, new Item.Properties()));

        public static final RegistryObject<Item> ROSE_DIAMOND_HOE = ITEMS.register("rose_diamond_hoe",
                        () -> new HoeItem(TierTool.ROSE_DIAMOND, 2, 3, new Item.Properties()));

        public static final RegistryObject<Item> ROSE_DIAMOND_SHOVEL = ITEMS.register("rose_diamond_shovel",
                        () -> new ShovelItem(TierTool.ROSE_DIAMOND, 2, 1, new Item.Properties()));
        // -------------------------------------------------------------------//

        // GEMS
        // -------------------------------------------------------------------//
        public static final RegistryObject<Item> APATITE = ITEMS.register("apatite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> DARK_QUARTZ = ITEMS.register("dark_quartz",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IOLITE = ITEMS.register("iolite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> JADE = ITEMS.register("jade",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> KUNZITE = ITEMS.register("kunzite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> OLIVINE = ITEMS.register("olivine",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> ROSE_DIAMOND = ITEMS.register("rose_diamond",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> TSAVORITE = ITEMS.register("tsavorite",
                        () -> new Item(new Item.Properties()));
        // --------------------------------------------------------------------------------------//

        // BLOCK-ITEMS
        // -------------------------------------------------------------------//

        public static final RegistryObject<Item> ITEM_TREASURE_POT = ITEMS.register("treasure_pot",
                        () -> new BlockItem(BasicBlock.TREASURE_POT.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_FANCY_LABORATORY_COMBINER = ITEMS.register(
                        "fancy_laboratory_combiner",
                        () -> new BlockItem(BasicBlock.FANCY_LABORATORY_COMBINER.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_FANCY_LABORATORY_DISSOLVER = ITEMS.register(
                        "fancy_laboratory_dissolver",
                        () -> new BlockItem(BasicBlock.FANCY_LABORATORY_DISSOLVER.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_ARCHEOLOGY_TABLE = ITEMS.register(
                        "archeology_table",
                        () -> new BlockItem(BasicBlock.ARCHEOLOGY_TABLE.get(), new Item.Properties()));

        public static final RegistryObject<Item> ITEM_TERMITE = ITEMS.register(
                        "termite",
                        () -> new BlockItem(BasicBlock.TERMITE.get(), new Item.Properties()));

                        public static final RegistryObject<Item> ITEM_STATUE_1 = ITEMS.register(
                                "statue_1",
                                () -> new BlockItem(BasicBlock.STATUE_1.get(), new Item.Properties()));

                                public static final RegistryObject<Item> ITEM_STATUE_2 = ITEMS.register(
                                        "statue_2",
                                        () -> new BlockItem(BasicBlock.STATUE_2.get(), new Item.Properties()));

        // -------------------------------------------------------------------//

        // TO DO - NOT YET COMPLETLY IMPLEMENTED
        // -------------------------------------------------------------------//
        // public static final RegistryObject<Item> FLOREAL_BONEMEAL =
        // ITEMS.register("floreal_bonemeal",
        // () -> new Item(new Item.Properties()));

        // public static final RegistryObject<Item> MINERAL_BONEMEAL =
        // ITEMS.register("mineral_bonemeal",
        // () -> new Item(new Item.Properties()));

        // public static final RegistryObject<Item> CROOK = ITEMS.register("crook",
        // () -> new HoeItem(Tiers.IRON, 1, 1, new Item.Properties()));
        // public static final RegistryObject<Item> PAXEL = ITEMS.register("paxel",
        // () -> new PickaxeItem(Tiers.IRON, 1, 1, new Item.Properties()));

        // public static final RegistryObject<Item> STEW = ITEMS.register("stew",
        // () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
        // .alwaysEat().nutrition(3).saturationMod(5f).build())));

        // -------------------------------------------------------------------//

        public static final RegistryObject<Item> ROTTEN_BALL = ITEMS.register("rotten_ball",
                        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                                        .alwaysEat().nutrition(4).saturationMod(0.3f)
                                        .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 1, 200), 100).build())));

        public static final RegistryObject<Item> GEM_TEMPLATE = ITEMS.register("gem_template",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> IRON_ROD = ITEMS.register("iron_rod",
                        () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }

}
