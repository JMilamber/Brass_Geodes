package BrassAmber.com.brass_geodes.world.features;

import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

public class BrassGeodesCavePlacements {

    public static final PlacedFeature AMETHYST_GEODE = PlacementUtils.register("amethyst_geode",
            CaveFeatures.AMETHYST_GEODE.placed(RarityFilter.onAverageOnceEvery(48),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature TOPAZ_GEODE = PlacementUtils.register("topaz_geode",
            BrassGeodesConfiguredFeatures.TOPAZ_GEODE.placed(RarityFilter.onAverageOnceEvery(64),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode",
            BrassGeodesConfiguredFeatures.SAPPHIRE_GEODE.placed(RarityFilter.onAverageOnceEvery(80),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature RUBY_GEODE = PlacementUtils.register("ruby_geode",
            BrassGeodesConfiguredFeatures.RUBY_GEODE.placed(RarityFilter.onAverageOnceEvery(96),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature EMERALD_GEODE = PlacementUtils.register("emerald_geode",
            BrassGeodesConfiguredFeatures.EMERALD_GEODE.placed(RarityFilter.onAverageOnceEvery(128),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));

    public static final PlacedFeature DIAMOND_GEODE = PlacementUtils.register("diamond_geode",
            BrassGeodesConfiguredFeatures.DIAMOND_GEODE.placed(RarityFilter.onAverageOnceEvery(176),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(0)), BiomeFilter.biome()));


}
