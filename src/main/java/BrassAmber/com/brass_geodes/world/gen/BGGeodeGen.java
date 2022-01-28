package BrassAmber.com.brass_geodes.world.gen;

import BrassAmber.com.brass_geodes.config.BrassGeodesConfig;
import BrassAmber.com.brass_geodes.world.features.BGCavePlacements;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.*;
import java.util.function.Supplier;

public class BGGeodeGen {
    public static final GenerationStep.Decoration local = GenerationStep.Decoration.LOCAL_MODIFICATIONS;
    public static final GenerationStep.Decoration ores = GenerationStep.Decoration.UNDERGROUND_ORES;
    public static void generateGeodes(final BiomeLoadingEvent event) {
        // get list of biomeTypes of the biome being loaded
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        // Get the BiomeGenerationSettingsBuilder (object which contains data for all already loaded features)
        BiomeGenerationSettingsBuilder biomeGen = event.getGeneration();

        // Create a list to hold features we want to remove
        List<Supplier<PlacedFeature>> features = new ArrayList<Supplier<PlacedFeature>>();


        // Geode removal and addition
        // ---------------------------------------------------------------------------- \\

        // get the PlacedFeatures for the generationStep Local_Modifications
        for (Supplier<PlacedFeature> f : biomeGen.getFeatures(local)) {
            // get the ConfiguredFeature base of the placed feature
            for (ConfiguredFeature<?,?> g : f.get().getFeatures().toList()) {
                // check if the Configuration of the feature matches the configuration of the one we want to remove
                if (g.config instanceof GeodeConfiguration) {
                    features.add(f);
                }
            }
        }

        biomeGen.getFeatures(local).removeAll(features);

        // Add all BrassGeodes Features (Including a decreased spawn-rate Amethyst geode)
        biomeGen.addFeature(local, BGCavePlacements.BG_AMETHYST_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.TOPAZ_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.SAPPHIRE_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.RUBY_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.EMERALD_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.DIAMOND_GEODE);

        // clear the list of features for use in next generation step feature removal
        features.clear();

        // Ore removal
        // ---------------------------------------------------------------------------- \\

        // get the PlacedFeatures for the generationStep Local_Modifications
        for (Supplier<PlacedFeature> f : biomeGen.getFeatures(ores)) {
            // get the ConfiguredFeature base of the placed feature
            for (ConfiguredFeature<?, ?> g : f.get().getFeatures().toList()) {
                // check if the Configuration of the feature matches the configuration of the one we want to remove
                if (g.config instanceof OreConfiguration) {
                    // Check that the target list in the config is equal to emerald/diamond ore and the config values
                    if (((OreConfiguration) g.config).targetStates == OreFeatures.ORE_DIAMOND_TARGET_LIST) {
                        if (BrassGeodesConfig.removeDiamondOre.get()) {
                            features.add(f);
                        }
                    }

                    if (((OreConfiguration) g.config).targetStates.get(0).state == Blocks.EMERALD_ORE.defaultBlockState()) {
                        if (BrassGeodesConfig.removeEmeraldOre.get()) {
                            features.add(f);
                        }
                    }
                }
            }
        }

        biomeGen.getFeatures(ores).removeAll(features);
    }
}
