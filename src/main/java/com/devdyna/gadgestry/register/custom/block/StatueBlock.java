package com.devdyna.gadgestry.register.custom.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StatueBlock extends HorizontalDirectionalBlock {

   protected static final VoxelShape Shape = Block.box(2, 0, 2, 14, 14, 14);

   @SuppressWarnings("null")
   @Override
   public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
      return Shape;
   }

   public StatueBlock(BlockBehaviour.Properties p_53677_) {
      super(p_53677_);
   }

   @SuppressWarnings("null")
   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53681_) {
      p_53681_.add(FACING);
   }

   @SuppressWarnings("null")
   public BlockState getStateForPlacement(BlockPlaceContext p_53679_) {
      return this.defaultBlockState().setValue(FACING, p_53679_.getHorizontalDirection().getOpposite());
   }


}
