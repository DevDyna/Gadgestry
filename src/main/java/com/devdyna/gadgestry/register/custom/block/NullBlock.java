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

    public int min = 8;
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
        int[][] all = {
                { 0, 0, 1 },
                { 0, 1, 0 },
                { 0, 1, 1 },
                { 1, 0, 0 },
                { 1, 0, 1 },
                { 1, 1, 0 },
                { 1, 1, 1 }
        };
        int x = pos.getX(), y = pos.getY(), z = pos.getZ();

        int chance = Calc.rnd(min, max);
        int invalid_sides = 0;
        for (int i = 0; i < chance; i++) {

            for (int[] nextpos : all) {

                BlockState next = world.getBlockState(pos.offset(x + nextpos[0], y + nextpos[1], z + nextpos[2]));
                if (next.is(Blocks.END_STONE)) {
                    x += nextpos[0];
                    y += nextpos[1];
                    z += nextpos[2];
                    world.setBlock(pos.offset(x, y, z), TypeFest.getModBlock("semi_nullstone"), UPDATE_ALL);
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