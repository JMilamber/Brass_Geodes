package BrassAmber.com.brass_geodes.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

public class BuddingGemBlock extends AmethystBlock {
    public static int GROWTH_CHANCE;
    private static final Direction[] DIRECTIONS = Direction.values();
    private final Block small;
    private final Block medium;
    private final Block large;
    private final Block cluster;

    public BuddingGemBlock(Properties properties, Block small, Block medium, Block large, Block cluster, int growthChance) {
        super(properties);
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.cluster = cluster;
        GROWTH_CHANCE = growthChance;
    }


    public PushReaction getPistonPushReaction(BlockState p_152733_) {
      return PushReaction.DESTROY;
   }

   public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, Random random) {
      if (random.nextInt(GROWTH_CHANCE) == 0) {
         Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
         BlockPos blockpos = blockPos.relative(direction);
         BlockState blockstate = serverLevel.getBlockState(blockpos);
         Block block = null;
         if (canClusterGrowAtState(blockstate)) {
            block = this.small;
         } else if (blockstate.is(this.small) && blockstate.getValue(GemClusterBlock.FACING) == direction) {
            block = this.medium;
         } else if (blockstate.is(this.medium) && blockstate.getValue(GemClusterBlock.FACING) == direction) {
            block = this.large;
         } else if (blockstate.is(this.large) && blockstate.getValue(GemClusterBlock.FACING) == direction) {
            block = this.cluster;
         }

         if (block != null) {
            BlockState blockstate1 = block.defaultBlockState().setValue(GemClusterBlock.FACING, direction)
                    .setValue(GemClusterBlock.WATERLOGGED,
                            blockstate.getFluidState().getType() == Fluids.WATER);
            serverLevel.setBlockAndUpdate(blockpos, blockstate1);
         }

      }
   }

   public static boolean canClusterGrowAtState(BlockState blockState) {
      return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
   }
}
