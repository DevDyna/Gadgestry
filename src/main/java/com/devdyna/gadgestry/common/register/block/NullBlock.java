package com.devdyna.gadgestry.common.register.block;

import com.devdyna.gadgestry.common.utils.TypeFest;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class NullBlock extends Block {

    public NullBlock(Properties pProperties) {
        super(pProperties);
    }

    @SuppressWarnings("null")
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @SuppressWarnings("null")
    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource rand) {

        BlockPos[] all = {
                pos.below(),
                pos.above(),
                pos.west(),
                pos.east(),
                pos.south(),
                pos.north()
        };

        for (BlockPos position : all) {
            BlockState block = world.getBlockState(position);
            if (!block.is(BlockTags.FEATURES_CANNOT_REPLACE)) {

                if (block.is(Blocks.END_STONE)) {
                    world.setBlock(pos, TypeFest.getModBlock("nullstone"), UPDATE_ALL);
                    world.setBlock(position, TypeFest.getModBlock("semi_nullstone"), UPDATE_ALL);
                }
            }
        }

    }

}