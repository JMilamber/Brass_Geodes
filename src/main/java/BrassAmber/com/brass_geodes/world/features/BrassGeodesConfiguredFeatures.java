package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.BrassGeodesBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class BrassGeodesConfiguredFeatures {

    public static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

    public static final ConfiguredFeature<GeodeConfiguration, ?> TOPAZ_GEODE = register("topaz_geode",
            Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_TOPAZ), BlockStateProvider.simple(BrassGeodesBlocks.B_TOPAZ),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_TOPAZ.defaultBlockState(), BrassGeodesBlocks.MEDIUM_TOPAZ.defaultBlockState(),
                            BrassGeodesBlocks.LARGE_TOPAZ.defaultBlockState(), BrassGeodesBlocks.C_TOPAZ.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, 0.083D,
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final ConfiguredFeature<GeodeConfiguration, ?> SAPPHIRE_GEODE = register("sapphire_geode",
            Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_SAPPHIRE), BlockStateProvider.simple(BrassGeodesBlocks.B_SAPPHIRE),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_SAPPHIRE.defaultBlockState(), BrassGeodesBlocks.MEDIUM_SAPPHIRE.defaultBlockState(),
                            BrassGeodesBlocks.LARGE_SAPPHIRE.defaultBlockState(), BrassGeodesBlocks.C_SAPPHIRE.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, 0.083D,
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final ConfiguredFeature<GeodeConfiguration, ?> RUBY_GEODE = register("ruby_geode",
            Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_RUBY), BlockStateProvider.simple(BrassGeodesBlocks.B_RUBY),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_RUBY.defaultBlockState(), BrassGeodesBlocks.MEDIUM_RUBY.defaultBlockState(),
                            BrassGeodesBlocks.LARGE_RUBY.defaultBlockState(), BrassGeodesBlocks.C_RUBY.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, 0.083D,
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.04D, 1)));

    public static final ConfiguredFeature<GeodeConfiguration, ?> EMERALD_GEODE = register("emerald_geode",
            Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_EMERALD), BlockStateProvider.simple(BrassGeodesBlocks.B_EMERALD),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_EMERALD.defaultBlockState(), BrassGeodesBlocks.MEDIUM_EMERALD.defaultBlockState(),
                            BrassGeodesBlocks.LARGE_EMERALD.defaultBlockState(), BrassGeodesBlocks.C_EMERALD.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, 0.083D,
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.065D, 1)));

    public static final ConfiguredFeature<GeodeConfiguration, ?> DIAMOND_GEODE = register("diamond_geode",
            Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(BrassGeodesBlocks.GEODE_DIAMOND), BlockStateProvider.simple(BrassGeodesBlocks.B_DIAMOND),
                    BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(BrassGeodesBlocks.SMALL_DIAMOND.defaultBlockState(), BrassGeodesBlocks.MEDIUM_DIAMOND.defaultBlockState(),
                            BrassGeodesBlocks.LARGE_DIAMOND.defaultBlockState(), BrassGeodesBlocks.C_DIAMOND.defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()),
                    new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                    new GeodeCrackSettings(0.5D, 1.5D, 2), 0.35D, 0.083D,
                    true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                    UniformInt.of(1, 2), -16, 16, 0.075D, 1)));

}
