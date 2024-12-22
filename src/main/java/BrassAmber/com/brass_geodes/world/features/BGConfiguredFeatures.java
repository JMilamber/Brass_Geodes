package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class BGConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, BrassGeodes.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> BG_AMETHYST_GEODE = CONFIGURED_FEATURES.register("bg_amethyst_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(Blocks.AMETHYST_BLOCK), BlockStateProvider.simple(Blocks.BUDDING_AMETHYST),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(Blocks.SMALL_AMETHYST_BUD.defaultBlockState(), Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                            Blocks.LARGE_AMETHYST_BUD.defaultBlockState(), Blocks.AMETHYST_CLUSTER.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, GemMaterial.AMETHYST.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.05D, 1)));


    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_GEODE =  CONFIGURED_FEATURES.register("topaz_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BGBlocks.RAW_TOPAZ.get()), BlockStateProvider.simple(BGBlocks.BUDDING_TOPAZ.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BGBlocks.SMALL_TOPAZ_BUD.get().defaultBlockState(), BGBlocks.MEDIUM_TOPAZ_BUD.get().defaultBlockState(),
                            BGBlocks.LARGE_TOPAZ_BUD.get().defaultBlockState(), BGBlocks.TOPAZ_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.TOPAZ.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_GEODE = CONFIGURED_FEATURES.register("sapphire_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BGBlocks.RAW_SAPPHIRE.get()), BlockStateProvider.simple(BGBlocks.BUDDING_SAPPHIRE.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BGBlocks.SMALL_SAPPHIRE_BUD.get().defaultBlockState(), BGBlocks.MEDIUM_SAPPHIRE_BUD.get().defaultBlockState(),
                            BGBlocks.LARGE_SAPPHIRE_BUD.get().defaultBlockState(), BGBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.SAPPHIRE.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_GEODE =  CONFIGURED_FEATURES.register("ruby_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BGBlocks.RAW_RUBY.get()), BlockStateProvider.simple(BGBlocks.BUDDING_RUBY.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BGBlocks.SMALL_RUBY_BUD.get().defaultBlockState(), BGBlocks.MEDIUM_RUBY_BUD.get().defaultBlockState(),
                            BGBlocks.LARGE_RUBY_BUD.get().defaultBlockState(), BGBlocks.RUBY_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.RUBY.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> EMERALD_GEODE = CONFIGURED_FEATURES.register("emerald_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BGBlocks.RAW_EMERALD.get()), BlockStateProvider.simple(BGBlocks.BUDDING_EMERALD.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BGBlocks.SMALL_EMERALD_BUD.get().defaultBlockState(), BGBlocks.MEDIUM_EMERALD_BUD.get().defaultBlockState(),
                            BGBlocks.LARGE_EMERALD_BUD.get().defaultBlockState(), BGBlocks.EMERALD_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.EMERALD.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.03D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DIAMOND_GEODE = CONFIGURED_FEATURES.register("diamond_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(BGBlocks.RAW_DIAMOND.get()),
                            BlockStateProvider.simple(BGBlocks.BUDDING_DIAMOND.get()), BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(BGBlocks.SMALL_DIAMOND_BUD.get().defaultBlockState(), BGBlocks.MEDIUM_DIAMOND_BUD.get().defaultBlockState(),
                                    BGBlocks.LARGE_DIAMOND_BUD.get().defaultBlockState(), BGBlocks.DIAMOND_CLUSTER.get().defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2),
                    0.30D,
                    GemMaterial.DIAMOND.getRarity(),
                    true,
                    UniformInt.of(4, 6),
                    UniformInt.of(3, 4),
                    UniformInt.of(1, 2),
                    16,
                    32,
                    0.02D,
                    1)));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> TOPAZ_GEMCORN_TREE = FeatureUtils.register("topaz_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BGBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BGBlocks.TOPAZ_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RUBY_GEMCORN_TREE = FeatureUtils.register("ruby_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BGBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BGBlocks.RUBY_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SAPPHIRE_GEMCORN_TREE = FeatureUtils.register("sapphire_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BGBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BGBlocks.SAPPHIRE_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EMERALD_GEMCORN_TREE = FeatureUtils.register("emerald_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BGBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BGBlocks.EMERALD_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DIAMOND_GEMCORN_TREE = FeatureUtils.register("diamond_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BGBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BGBlocks.DIAMOND_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );



    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
