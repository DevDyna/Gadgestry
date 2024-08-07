package com.devdyna.gadgestry.common.register.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import com.devdyna.gadgestry.Gadgestry;

public class BasicBlock {

        public static final RegistryObject<Block> EXAMPLE_BLOCK = Gadgestry.BLOCKS.register("example_block",
                        () -> new Block(BlockBehaviour.Properties.of()));

}
