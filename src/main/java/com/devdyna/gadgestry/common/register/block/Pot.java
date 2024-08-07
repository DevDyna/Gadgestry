package com.devdyna.gadgestry.common.register.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Pot extends Block {

    public Pot(Properties p_49795_) {
        super(p_49795_);
    }

    protected static final VoxelShape POT = Block.box(1, 0, 1, 15, 16, 15);

    @SuppressWarnings("null")
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return POT;
    }

}
