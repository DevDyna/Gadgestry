package com.devdyna.gadgestry.common.register.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gadgestry.Gadgestry;

public class BasicBlock {

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        Gadgestry.MODID);

        public static final RegistryObject<Block> TREASURE_POT = BLOCKS.register("treasure_pot",
                        () -> new Block(BlockBehaviour.Properties.of()));

                        public static final RegistryObject<Block> FANCY_LABORATORY_BREAKER = BLOCKS.register("fancy_laboratory_breaker",
                        () -> new Block(BlockBehaviour.Properties.of()));

                        public static final RegistryObject<Block> FANCY_LABORATORY_CRAFTER = BLOCKS.register("fancy_laboratory_crafter",
                        () -> new Block(BlockBehaviour.Properties.of()));


        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
