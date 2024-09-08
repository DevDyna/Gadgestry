package com.devdyna.gadgestry.common.register.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TreasurePot extends Block {

    public TreasurePot(Properties p_49795_) {
        super(p_49795_);
    }

    protected static final VoxelShape POT = Block.box(1, 0, 1, 15, 16, 15);

    @SuppressWarnings("null")
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return POT;
    }

    @SuppressWarnings("null")
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.literal("Can drop good gems"));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
    }

}
