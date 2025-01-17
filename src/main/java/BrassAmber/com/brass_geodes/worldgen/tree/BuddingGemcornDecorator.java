package BrassAmber.com.brass_geodes.worldgen.tree;

import BrassAmber.com.brass_geodes.util.BGUtil;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CocoaBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;
import java.util.stream.Stream;

public class BuddingGemcornDecorator extends TreeDecorator {
    public static final Codec<BuddingGemcornDecorator> CODEC = RecordCodecBuilder.create((decoratorInstance) ->
            decoratorInstance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((gemcornDecorator) -> gemcornDecorator.buddingProbability),
                    BlockState.CODEC.fieldOf("budding_block").forGetter((gemcornDecorator) -> gemcornDecorator.buddingBlock)
            ).apply(decoratorInstance, BuddingGemcornDecorator::new)
    );

    private final float buddingProbability;
    private final BlockState buddingBlock;

    public BuddingGemcornDecorator(float buddingProbability, BlockState buddingBlock) {
        this.buddingProbability = buddingProbability;
        this.buddingBlock = buddingBlock;
    }

    protected TreeDecoratorType<?> type() {
        return BGTreeDecorators.BUDDING_GEMCORN_DECORATOR.get();
    }

    public void place(TreeDecorator.Context context) {
        RandomSource randomsource = context.random();
        List<BlockPos> logList = context.logs();
        BlockPos startPos = logList.get(0);
        logList.forEach((logPos) -> {
            float nextChance = randomsource.nextFloat();
            if ((BGUtil.distanceTo3D(startPos, logPos) > 4 && nextChance <= this.buddingProbability)
                    || (BGUtil.distanceTo2D(startPos, logPos) > 0.5 && nextChance <= .9)
            ) {
                context.setBlock(logPos, buddingBlock);
            }
        });
    }

}
