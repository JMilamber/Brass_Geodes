package BrassAmber.com.brass_geodes.worldgen.tree.custom;

import BrassAmber.com.brass_geodes.worldgen.tree.BGTrunkPlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

public class GemcornTrunkPlacer extends TrunkPlacer {
    public static final Codec<GemcornTrunkPlacer> CODEC = RecordCodecBuilder.create(gemcornTrunkPlacerInstance ->
            trunkPlacerParts(gemcornTrunkPlacerInstance).apply(gemcornTrunkPlacerInstance, GemcornTrunkPlacer::new));

    public static List<Direction> BRANCH_DIRECTIONS = List.of(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);
    public List<List<Direction>> branches;

    public GemcornTrunkPlacer(int baseHeight, int heightRandA, int heightRandB) {
        super(baseHeight, heightRandA, heightRandB);
        this.branches = new ArrayList<>();
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return BGTrunkPlacerTypes.GEMCORN_TREE_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource pRandom, int pFreeTreeHeight, BlockPos blockPos, TreeConfiguration treeConfig) {

        setDirtAt(pLevel, blockSetter, pRandom, blockPos.below(), treeConfig);

        int branch_count_b = pRandom.nextInt(1,4);

        int height = 9 + pRandom.nextInt(1,4);
        for (int i = 0; i < height; i++) {
            placeLog(pLevel, blockSetter, pRandom, blockPos.above(i), treeConfig);
            branches.add(new ArrayList<>());
        }
        for (int j = 0; j < 5; j++) {
            Direction randDirection;
            int newBranchHeight;
            do {
                newBranchHeight = pRandom.nextInt(4, 8);
                randDirection = BRANCH_DIRECTIONS.get(pRandom.nextInt(4));
            } while (
                    branches.get(newBranchHeight).contains(randDirection)
                            || branches.get(newBranchHeight - 1).contains(randDirection)
                            || branches.get(newBranchHeight + 1).contains(randDirection)
            );

            branches.get(newBranchHeight).add(randDirection);
            placeBranch(pLevel, blockSetter, pRandom, blockPos.above(newBranchHeight), treeConfig, randDirection, newBranchHeight);
        }

        for (int j = 0; j < branch_count_b; j++) {
            Direction randDirection;
            int newBranchHeight;
            do {
                newBranchHeight = pRandom.nextInt(7, height-2);
                randDirection = BRANCH_DIRECTIONS.get(pRandom.nextInt(4));
            } while (
                    branches.get(newBranchHeight).contains(randDirection)
                            || branches.get(newBranchHeight - 1).contains(randDirection)
                            || branches.get(Math.min(branches.size()-2, newBranchHeight + 1)).contains(randDirection)
            );

            branches.get(newBranchHeight).add(randDirection);
            placeBranch(pLevel, blockSetter, pRandom, blockPos.above(newBranchHeight), treeConfig, randDirection, newBranchHeight);
        }

        return List.of();
    }

    public void placeBranch(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> blockSetter,
                            RandomSource pRandom, BlockPos blockPos, TreeConfiguration treeConfig, Direction direction, int height) {
        placeLog(pLevel, blockSetter, pRandom, blockPos.relative(direction), treeConfig);
        if (height > 6 && pRandom.nextFloat() < (float) height /10) {
            if (pRandom.nextBoolean()) {
                placeLog(pLevel, blockSetter, pRandom, blockPos.relative(direction).relative(direction), treeConfig);
            } else {
                placeLog(pLevel, blockSetter, pRandom, blockPos.relative(direction).relative(direction).above(), treeConfig);
            }
        }

    }
}

