package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.config.BrassGeodesConfig;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import net.minecraft.core.Holder;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class BGCavePlacements {

    public static final int baseChance = BrassGeodesConfig.baseGeodeChance.get();

    public static final Holder<PlacedFeature> BG_AMETHYST_GEODE = PlacementUtils.register("bg_amethyst_geode",
            BGConfiguredFeatures.BG_AMETHYST_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.amethystGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> TOPAZ_GEODE = PlacementUtils.register("topaz_geode",
            BGConfiguredFeatures.TOPAZ_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.topazGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode",
            BGConfiguredFeatures.SAPPHIRE_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.sapphireGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> RUBY_GEODE = PlacementUtils.register("ruby_geode",
            BGConfiguredFeatures.RUBY_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.rubyGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> EMERALD_GEODE = PlacementUtils.register("emerald_geode",
            BGConfiguredFeatures.EMERALD_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.emeraldGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> DIAMOND_GEODE = PlacementUtils.register("diamond_geode",
            BGConfiguredFeatures.DIAMOND_GEODE, RarityFilter.onAverageOnceEvery(BrassGeodesConfig.diamondGeodeChance.get() + baseChance),
                    InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)), BiomeFilter.biome());



}
