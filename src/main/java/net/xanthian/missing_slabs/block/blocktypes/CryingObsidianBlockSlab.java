package net.xanthian.missing_slabs.block.blocktypes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.VoxelShape;

import org.jetbrains.annotations.NotNull;

public class CryingObsidianBlockSlab extends SlabBlock {
    public CryingObsidianBlockSlab(BlockBehaviour.Properties properties) {
        super(properties);
    }

    protected static final VoxelShape BOTTOM_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);
    protected static final VoxelShape TOP_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
    protected static final VoxelShape DOUBLE_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

    @Override
    public void animateTick(BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull RandomSource randomSource) {
        SlabType slabType = blockState.getValue(TYPE);
        VoxelShape voxelShape;

        switch (slabType) {
            case DOUBLE:
                voxelShape = DOUBLE_SHAPE;
                break;
            case TOP:
                voxelShape = TOP_SHAPE;
                break;
            default:
                voxelShape = BOTTOM_SHAPE;
                break;
        }
        double minY = voxelShape.min(Direction.Axis.Y);
        double maxY = voxelShape.max(Direction.Axis.Y);

        if (randomSource.nextInt(5) == 0) {
            double d0 = randomSource.nextDouble();
            double d1 = minY + (maxY - minY) * randomSource.nextDouble();
            double d2 = randomSource.nextDouble();
            level.addParticle(
                    ParticleTypes.DRIPPING_OBSIDIAN_TEAR,
                    (double) blockPos.getX() + d0,
                    (double) blockPos.getY() + d1,
                    (double) blockPos.getZ() + d2,
                    0.0D, 0.0D, 0.0D
            );
        }
    }
}