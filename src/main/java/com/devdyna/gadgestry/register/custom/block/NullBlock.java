package com.devdyna.gadgestry.register.custom.block;

import com.devdyna.gadgestry.utils.Calc;
import com.devdyna.gadgestry.utils.TypeFest;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class NullBlock extends Block {

    public int min = 4;
    public int max = 16;

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

        int chance = (int) Calc.rnd((double) min, (double) max);
        int invalid_sides = 0;

        for (int i = 0; i < chance; i++) {

            for (BlockPos nextpos : all) {

                // BlockState actual = world.getBlockState(pos);
                BlockState next = world.getBlockState(nextpos);
                if (Calc.rnd50() && next.is(Blocks.END_STONE)) {
                    world.setBlock(nextpos, TypeFest.getModBlock("nullstone"), UPDATE_ALL);
                    pos = nextpos;
                } else {
                    invalid_sides++;
                }

            }
            if (invalid_sides == 6) {
                break;
            }

        }

    }

}