package BrassAmber.com.brass_geodes.world.gen;

import BrassAmber.com.brass_geodes.config.BrassGeodesConfig;
import BrassAmber.com.brass_geodes.world.features.BGCavePlacements;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
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

    public static final boolean removeDiamondOre = BrassGeodesConfig.removeDiamondOre.get();
    public static final boolean removeEmeraldOre = BrassGeodesConfig.removeEmeraldOre.get();

    public static void generateOverworldGeodes(final BiomeLoadingEvent event) {
        // get list of biomeTypes of the biome being loaded
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        // Get the BiomeGenerationSettingsBuilder (object which contains data for all already loaded features)
        BiomeGenerationSettingsBuilder biomeGen = event.getGeneration();

        // Create a list to hold features we want to remove
        List<Holder<PlacedFeature>> features = new ArrayList<>();


        // Geode removal and addition
        // ---------------------------------------------------------------------------- \\

        // get the PlacedFeatures for the generationStep Local_Modifications
        for (Holder<PlacedFeature> f : biomeGen.getFeatures(local)) {
            // get the ConfiguredFeature base of the placed feature
            for (ConfiguredFeature<?,?> g : f.value().getFeatures().toList()) {
                // check if the Configuration of the feature matches the configuration of the one we want to remove
                if (g.config() instanceof GeodeConfiguration) {
                    features.add(f);
                }
            }
        }

        biomeGen.getFeatures(local).removeAll(features);


        // Add all BrassGeodes Features (Including a decreased spawn-rate Amethyst geode)
        biomeGen.addFeature(local, BGCavePlacements.DIAMOND_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.EMERALD_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.SAPPHIRE_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.RUBY_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.TOPAZ_GEODE);
        biomeGen.addFeature(local, BGCavePlacements.BG_AMETHYST_GEODE);




        // clear the list of features for use in next generation step feature removal
        features.clear();

        // Ore removal
        // ---------------------------------------------------------------------------- \\

        ArrayList<BlockState> diamondOres = new ArrayList<>(Arrays.asList(Blocks.DIAMOND_ORE.defaultBlockState(), Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState()));
        ArrayList<BlockState> emeraldOres = new ArrayList<>(Arrays.asList(Blocks.EMERALD_ORE.defaultBlockState(), Blocks.DEEPSLATE_EMERALD_ORE.defaultBlockState()));

        // get the PlacedFeatures for the generationStep Local_Modifications
        for (Holder<PlacedFeature> f : biomeGen.getFeatures(ores)) {
            // get the ConfiguredFeature base of the placed feature
            for (ConfiguredFeature<?, ?> g : f.value().getFeatures().toList()) {
                // check if the Configuration of the feature matches the configuration of the one we want to remove
                if (g.config() instanceof OreConfiguration) {
                    // Check that the target list in the config is equal to emerald/diamond ore and the config values
                    if (diamondOres.contains(((OreConfiguration) g.config()).targetStates.get(0).state)) {
                        if (removeDiamondOre) {
                            features.add(f);
                        }
                    }

                    if (emeraldOres.contains(((OreConfiguration) g.config()).targetStates.get(0).state)) {
                        if (removeEmeraldOre) {
                            features.add(f);
                        }
                    }
                }
            }
        }

        biomeGen.getFeatures(ores).removeAll(features);
    }
}
