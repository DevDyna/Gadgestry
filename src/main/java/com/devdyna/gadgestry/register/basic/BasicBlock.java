package com.devdyna.gadgestry.register.basic;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gadgestry.Gadgestry;
import com.devdyna.gadgestry.register.custom.block.*;

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

        public static final RegistryObject<Block> NULLSTONE = BLOCKS
                        .register("nullstone",
                                        () -> new NullBlock(
                                                        BlockBehaviour.Properties.of()
                                                                        .strength(1F).sound(SoundType.SCULK_CATALYST)
                                                                        .pushReaction(PushReaction.DESTROY)
                                                                        .randomTicks()));

        public static final RegistryObject<Block> SEMI_NULLSTONE = BLOCKS
                        .register("semi_nullstone",
                                        () -> new Block(
                                                        BlockBehaviour.Properties.of()
                                                                        .strength(1F).sound(SoundType.SCULK_CATALYST)
                                                                        .pushReaction(PushReaction.DESTROY)));

        public static final RegistryObject<Block> FANCY_LABORATORY_DISSOLVER = BLOCKS.register(
                        "fancy_laboratory_dissolver",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)
                                        .noCollission()));

        public static final RegistryObject<Block> ARCHEOLOGY_TABLE = BLOCKS.register(
                        "archeology_table",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

        public static final RegistryObject<Block> STATUE_CAT = BLOCKS.register(
                        "statue_1",
                        () -> new StatueBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
