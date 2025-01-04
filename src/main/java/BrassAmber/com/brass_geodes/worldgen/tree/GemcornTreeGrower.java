package BrassAmber.com.brass_geodes.worldgen.tree;

import BrassAmber.com.brass_geodes.util.GemMaterial;
import BrassAmber.com.brass_geodes.worldgen.BGConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import static BrassAmber.com.brass_geodes.BGBlocks.AMETHYST_BLOCK;

public class GemcornTreeGrower extends AbstractTreeGrower {
    public final GemMaterial KEY;
    public GemcornTreeGrower(GemMaterial key) {
        this.KEY = key;
    }

    @Override
    protected @Nullable ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean p_222911_) {
        return switch (this.KEY) {
            case AMETHYST -> BGConfiguredFeatures.AMETHYST_GEMCORN_KEY;
            case TOPAZ -> BGConfiguredFeatures.TOPAZ_GEMCORN_KEY;
            case SAPPHIRE -> BGConfiguredFeatures.SAPPHIRE_GEMCORN_KEY;
            case RUBY -> BGConfiguredFeatures.RUBY_GEMCORN_KEY;
            case EMERALD -> BGConfiguredFeatures.EMERALD_GEMCORN_KEY;
            case DIAMOND -> BGConfiguredFeatures.DIAMOND_GEMCORN_KEY;
        };
    }
}
