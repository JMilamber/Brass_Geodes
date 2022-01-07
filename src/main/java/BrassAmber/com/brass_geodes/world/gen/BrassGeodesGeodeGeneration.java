package BrassAmber.com.brass_geodes.world.gen;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.world.features.BrassGeodesCavePlacements;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.MiscOverworldPlacements;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import org.apache.logging.log4j.Level;

import java.util.Set;

public class BrassGeodesGeodeGeneration {
    public static void generateGeodes(final BiomeLoadingEvent event) {
        // get list of biomeTypes of the biome being loaded
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        // Get the BiomeGenerationSettingsBuilder (objects which contains data for all already loaded vanilla features)
        BiomeGenerationSettingsBuilder biomeGen = event.getGeneration();

        // Get the list of LOCAL_MODIFCATIONS features that vanilla minecraft has loaded (contains the default AMETHYST GEODE)
        // Clear the list
        biomeGen.getFeatures(GenerationStep.Decoration.LOCAL_MODIFICATIONS).clear();

        // Add all BrassGeodes Features (Including a decreased spawn-rate Amethyst geode)
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.AMETHYST_GEODE);
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.TOPAZ_GEODE);
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.SAPPHIRE_GEODE);
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.RUBY_GEODE);
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.EMERALD_GEODE);
        biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BrassGeodesCavePlacements.DIAMOND_GEODE);

        // Re-add biome specific local_modifications
        if (types.contains(Biomes.DRIPSTONE_CAVES)) {
            biomeGen.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, CavePlacements.LARGE_DRIPSTONE);
        } else if (types.contains(Biomes.OLD_GROWTH_PINE_TAIGA) || types.contains(Biomes.OLD_GROWTH_SPRUCE_TAIGA)) {
            BiomeDefaultFeatures.addMossyStoneBlock(biomeGen);
        } else if (types.contains(Biomes.FROZEN_OCEAN)) {
            BiomeDefaultFeatures.addIcebergs(biomeGen);
        }

        // Get the list of UNDERGROUND_ORES features that vanilla minecraft has loaded (contains Diamond and Emerald ore)
        // Clear the list
        event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).clear();

        // Re-add stone variation
        BiomeDefaultFeatures.addDefaultUndergroundVariety(biomeGen);

        // Re-add clay/dirt/sand/gravel
        BiomeDefaultFeatures.addDefaultSoftDisks(biomeGen);

        // Re-add Ores (Besides Diamond and Emerald)
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_COAL_UPPER);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_COAL_LOWER);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_IRON_UPPER);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_IRON_MIDDLE);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_IRON_SMALL);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GOLD);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GOLD_LOWER);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_REDSTONE);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_REDSTONE_LOWER);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_LAPIS);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_LAPIS_BURIED);
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, types.contains(Biomes.DRIPSTONE_CAVES) ? OrePlacements.ORE_COPPER_LARGE : OrePlacements.ORE_COPPER);

        // Re-add Magma (Dont know why this is considered and ore? Probably it uses the ore worldgen to generate)
        biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, CavePlacements.UNDERWATER_MAGMA);

        // Re-add biome specific ores
        if (types.contains(Biomes.BADLANDS)) {
            biomeGen.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GOLD_EXTRA);
        }  else if (types.contains(Biomes.LUSH_CAVES)) {
            BiomeDefaultFeatures.addLushCavesSpecialOres(biomeGen);
        }


    }
}
