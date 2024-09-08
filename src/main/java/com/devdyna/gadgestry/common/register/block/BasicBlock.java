package com.devdyna.gadgestry.common.register.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gadgestry.Gadgestry;

public class BasicBlock {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        Gadgestry.MODID);

        public static final RegistryObject<Block> TREASURE_POT = BLOCKS.register("treasure_pot",
                        () -> new TreasurePot(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT)
                                        .sound(SoundType.DECORATED_POT_CRACKED)));

        // public static final RegistryObject<Block> NEPTUNIAN_GRASS =
        // BLOCKS.register("neptunian_grass",
        // () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.CAVE_VINES)));

        public static final RegistryObject<Block> FANCY_LABORATORY_COMBINER = BLOCKS
                        .register("fancy_laboratory_combiner",
                                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                                                        .sound(SoundType.METAL).noCollission()));

        public static final RegistryObject<Block> Nylium = BLOCKS
                        .register("nylium",
                                        () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN)
                                                        .strength(0.1F).sound(SoundType.MOSS)
                                                        .pushReaction(PushReaction.DESTROY)));

        public static final RegistryObject<Block> FANCY_LABORATORY_DISSOLVER = BLOCKS.register(
                        "fancy_laboratory_dissolver",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                                        .noCollission()));

        public static final RegistryObject<Block> ARCHEOLOGY_TABLE = BLOCKS.register(
                        "archeology_table",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
