package BrassAmber.com.brass_geodes.world.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class GemcornTreeGrower extends AbstractTreeGrower {
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222938_, boolean p_222939_) {
        if (p_222938_.nextInt(10) == 0) {
            return p_222939_ ? TreeFeatures.FANCY_OAK_BEES_005 : TreeFeatures.FANCY_OAK;
        } else {
            return p_222939_ ? TreeFeatures.OAK_BEES_005 : TreeFeatures.OAK;
        }
    }
}
