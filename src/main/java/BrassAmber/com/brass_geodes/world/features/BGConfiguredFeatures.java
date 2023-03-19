package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.BrassGeodesBlocks;
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
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
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
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_TOPAZ.get()), BlockStateProvider.simple(BrassGeodesBlocks.B_TOPAZ.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_TOPAZ.get().defaultBlockState(), BrassGeodesBlocks.MEDIUM_TOPAZ.get().defaultBlockState(),
                            BrassGeodesBlocks.LARGE_TOPAZ.get().defaultBlockState(), BrassGeodesBlocks.C_TOPAZ.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.TOPAZ.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_GEODE = CONFIGURED_FEATURES.register("sapphire_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_SAPPHIRE.get()), BlockStateProvider.simple(BrassGeodesBlocks.B_SAPPHIRE.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_SAPPHIRE.get().defaultBlockState(), BrassGeodesBlocks.MEDIUM_SAPPHIRE.get().defaultBlockState(),
                            BrassGeodesBlocks.LARGE_SAPPHIRE.get().defaultBlockState(), BrassGeodesBlocks.C_SAPPHIRE.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.SAPPHIRE.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_GEODE =  CONFIGURED_FEATURES.register("ruby_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_RUBY.get()), BlockStateProvider.simple(BrassGeodesBlocks.B_RUBY.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_RUBY.get().defaultBlockState(), BrassGeodesBlocks.MEDIUM_RUBY.get().defaultBlockState(),
                            BrassGeodesBlocks.LARGE_RUBY.get().defaultBlockState(), BrassGeodesBlocks.C_RUBY.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.RUBY.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> EMERALD_GEODE = CONFIGURED_FEATURES.register("emerald_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_EMERALD.get()), BlockStateProvider.simple(BrassGeodesBlocks.B_EMERALD.get()),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_EMERALD.get().defaultBlockState(), BrassGeodesBlocks.MEDIUM_EMERALD.get().defaultBlockState(),
                            BrassGeodesBlocks.LARGE_EMERALD.get().defaultBlockState(), BrassGeodesBlocks.C_EMERALD.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, GemMaterial.EMERALD.getRarity(),
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.03D, 1)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DIAMOND_GEODE = CONFIGURED_FEATURES.register("diamond_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(
                    new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(BrassGeodesBlocks.GEODE_DIAMOND.get()),
                            BlockStateProvider.simple(BrassGeodesBlocks.B_DIAMOND.get()), BlockStateProvider.simple(Blocks.CALCITE),
                            BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                            List.of(BrassGeodesBlocks.SMALL_DIAMOND.get().defaultBlockState(), BrassGeodesBlocks.MEDIUM_DIAMOND.get().defaultBlockState(),
                                    BrassGeodesBlocks.LARGE_DIAMOND.get().defaultBlockState(), BrassGeodesBlocks.C_DIAMOND.get().defaultBlockState()),
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
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BrassGeodesBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BrassGeodesBlocks.TOPAZ_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> RUBY_GEMCORN_TREE = FeatureUtils.register("ruby_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BrassGeodesBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BrassGeodesBlocks.RUBY_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SAPPHIRE_GEMCORN_TREE = FeatureUtils.register("sapphire_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BrassGeodesBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BrassGeodesBlocks.SAPPHIRE_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EMERALD_GEMCORN_TREE = FeatureUtils.register("emerald_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BrassGeodesBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BrassGeodesBlocks.EMERALD_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DIAMOND_GEMCORN_TREE = FeatureUtils.register("diamond_gemcorn_tree", Feature.TREE,
            (
                    new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BrassGeodesBlocks.GEMCORN_TRUNK.get()),
                            new ForkingTrunkPlacer(4, 3, 3), BlockStateProvider.simple(BrassGeodesBlocks.DIAMOND_LEAVES.get()),
                            new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 1),
                            new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().dirt(BlockStateProvider.simple(Blocks.STONE)).build()
    );



    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }

}
