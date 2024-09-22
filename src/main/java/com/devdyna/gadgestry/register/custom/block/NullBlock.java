package com.devdyna.gadgestry.register.custom.block;

import com.devdyna.gadgestry.utils.Calc;
import com.devdyna.gadgestry.utils.TypeFest;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
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

        int chance = Calc.rnd(min, max);
        int invalid_sides = 0;
        for (int i = 0; i < chance; i++) {

            for (int[] nextpos : all) {
                BlockPos newpos = pos
                        .offset(new Vec3i(pos.getX() + nextpos[0], pos.getY() + nextpos[1], pos.getZ() + nextpos[2]));
                BlockState next = world.getBlockState(newpos);
                if (Calc.rnd50() && next.is(Blocks.END_STONE)) {

                    world.setBlock(newpos, TypeFest.getModBlock("semi_nullstone"), UPDATE_ALL);
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