package BrassAmber.com.brass_geodes.world.features;

import BrassAmber.com.brass_geodes.BrassGeodes;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;
import java.util.List;

public class BGCavePlacements {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, BrassGeodes.MOD_ID);

    public static final RegistryObject<PlacedFeature> TOPAZ_GEODE = PLACED_FEATURES.register("topaz_geode_placed",
            () -> new PlacedFeature(BGConfiguredFeatures.TOPAZ_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(64),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> SAPPHIRE_GEODE = PLACED_FEATURES.register("sapphire_geode_placed",
            () -> new PlacedFeature(BGConfiguredFeatures.SAPPHIRE_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(64),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> RUBY_GEODE = PLACED_FEATURES.register("ruby_geode_placed",
            () -> new PlacedFeature(BGConfiguredFeatures.RUBY_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(64),
                    InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> EMERALD_GEODE = PLACED_FEATURES.register("emerald_geode_placed",
            () -> new PlacedFeature(BGConfiguredFeatures.EMERALD_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(96),
                    InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(30)), BiomeFilter.biome())));

    public static final RegistryObject<PlacedFeature> DIAMOND_GEODE = PLACED_FEATURES.register("diamond_geode_placed",
            () -> new PlacedFeature(BGConfiguredFeatures.DIAMOND_GEODE.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(128),
                    InSquarePlacement.spread(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)), BiomeFilter.biome())));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}
