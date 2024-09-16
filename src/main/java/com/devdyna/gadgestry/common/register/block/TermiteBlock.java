package com.devdyna.gadgestry.common.register.block;

import com.devdyna.gadgestry.common.utils.Calc;
import com.devdyna.gadgestry.common.utils.TypeFest;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class TermiteBlock extends Block {

    public TermiteBlock(Properties pProperties) {
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

        BlockState termite = TypeFest.getBlockState("gadgestry:termite");
        BlockState air = TypeFest.getBlockState("minecraft:air");

        BlockPos[] dir = {
                pos.above(),
                pos.below(),
                pos.east(),
                pos.west(),
                pos.north(),
                pos.south()
        };

        for (BlockPos position : dir) {
            if (Calc.rnd25() && !world.getBlockState(position).isAir()) {
                world.setBlockAndUpdate(pos, termite);
                break;
            }
             if (Calc.rnd50()) {
                world.setBlock(pos, air, UPDATE_ALL);
                break;
            }
        }

    }

}
