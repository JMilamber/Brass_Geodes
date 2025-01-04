package BrassAmber.com.brass_geodes.block;

import BrassAmber.com.brass_geodes.BGBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

public class BuddingGemcornTrunk extends AmethystBlock {
    public static int GROWTH_CHANCE;
    private static final Direction[] DIRECTIONS = Direction.values();
    private final Block gemBranch;

    public BuddingGemcornTrunk(Properties properties, int growthChance, Block gemBranch) {
        super(properties);
        this.gemBranch = gemBranch;
        GROWTH_CHANCE = growthChance;
    }

    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }


    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        Direction direction = DIRECTIONS[randomSource.nextInt(DIRECTIONS.length)];
        BlockPos blockpos = blockPos.relative(direction);
        BlockState blockstate = serverLevel.getBlockState(blockpos);
        Block block = null;
        if (canClusterGrowAtState(blockstate)) {
            block = BGBlocks.GEMCORN_BRANCH.get();
        }
        if (blockstate.is(BGBlocks.GEMCORN_BRANCH.get()) && blockstate.getValue(GemcornBranch.FACING) == direction) {
            if (randomSource.nextInt(GROWTH_CHANCE / 8) == 0) {
                block = gemBranch;
            }
        }
        if (block != null) {
            BlockState blockstate1 = block.defaultBlockState().setValue(GemcornBranch.FACING, direction).setValue(GemcornBranch.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
            serverLevel.setBlockAndUpdate(blockpos, blockstate1);
        }
    }

    public static boolean canClusterGrowAtState(BlockState p_152735_) {
        return p_152735_.isAir() || p_152735_.is(Blocks.WATER) && p_152735_.getFluidState().getAmount() == 8;
    }
}
