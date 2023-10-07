package net.xanthian.missing_slabs.block.blocktypes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import org.jetbrains.annotations.NotNull;

public class MudSlab extends SlabBlock {
    public MudSlab(BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected static final VoxelShape BOTTOM_COLLISION_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
    protected static final VoxelShape TOP_COLLISION_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
    protected static final VoxelShape DOUBLE_COLLISION_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull VoxelShape getCollisionShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        SlabType slabType = blockState.getValue(TYPE);
        switch (slabType) {
            case DOUBLE -> {
                return DOUBLE_COLLISION_SHAPE;
            }
            case TOP -> {
                return TOP_COLLISION_SHAPE;
            }
        }
        return BOTTOM_COLLISION_SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public float getShadeBrightness(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos) {
        return 0.2f;
    }
}