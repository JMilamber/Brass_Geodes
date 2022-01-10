package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.config.BrassGeodesConfig;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class BGCavePlacements {

    public static final int baseChance = BrassGeodesConfig.baseGeodeChance.get();

    public static final PlacedFeature AMETHYST_GEODE = PlacementUtils.register("amethyst_geode",
            BGConfiguredFeatures.AMETHYST_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.amethystGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature TOPAZ_GEODE = PlacementUtils.register("topaz_geode",
            BGConfiguredFeatures.TOPAZ_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.topazGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode",
            BGConfiguredFeatures.SAPPHIRE_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.sapphireGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature RUBY_GEODE = PlacementUtils.register("ruby_geode",
            BGConfiguredFeatures.RUBY_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.rubyGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));

    public static final PlacedFeature EMERALD_GEODE = PlacementUtils.register("emerald_geode",
            BGConfiguredFeatures.EMERALD_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.emeraldGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));

    public static final PlacedFeature DIAMOND_GEODE = PlacementUtils.register("diamond_geode",
            BGConfiguredFeatures.DIAMOND_GEODE.placed(RarityFilter.onAverageOnceEvery(BrassGeodesConfig.diamondGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(0)), BiomeFilter.biome()));


}
