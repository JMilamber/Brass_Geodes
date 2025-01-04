package BrassAmber.com.brass_geodes.worldgen;

import BrassAmber.com.brass_geodes.BrassGeodes;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class BGBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_AMETHYST_TREE = registerKey("add_amethyst_tree");
    public static final ResourceKey<BiomeModifier> ADD_TOPAZ_TREE = registerKey("add_topaz_tree");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_TREE = registerKey("add_sapphire_tree");
    public static final ResourceKey<BiomeModifier> ADD_RUBY_TREE = registerKey("add_ruby_tree");
    public static final ResourceKey<BiomeModifier> ADD_EMERALD_TREE = registerKey("add_emerald_tree");
    public static final ResourceKey<BiomeModifier> ADD_DIAMOND_TREE = registerKey("add_diamond_tree");

    public static final ResourceKey<BiomeModifier> ADD_TOPAZ_GEODE = registerKey("add_topaz_geode");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_GEODE = registerKey("add_sapphire_geode");
    public static final ResourceKey<BiomeModifier> ADD_RUBY_GEODE = registerKey("add_ruby_geode");
    public static final ResourceKey<BiomeModifier> ADD_EMERALD_GEODE = registerKey("add_emerald_geode");
    public static final ResourceKey<BiomeModifier> ADD_DIAMOND_GEODE = registerKey("add_diamond_geode");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_AMETHYST_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.AMETHYST_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );
        context.register(ADD_TOPAZ_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.TOPAZ_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );
        context.register(ADD_SAPPHIRE_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.SAPPHIRE_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );
        context.register(ADD_RUBY_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.RUBY_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );
        context.register(ADD_EMERALD_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.EMERALD_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );
        context.register(ADD_DIAMOND_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.DIAMOND_GEMCORN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION)
        );

        context.register(ADD_TOPAZ_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.TOPAZ_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS)
        );
        context.register(ADD_SAPPHIRE_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.SAPPHIRE_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS)
        );
        context.register(ADD_RUBY_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.RUBY_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS)
        );
        context.register(ADD_EMERALD_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.EMERALD_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS)
        );
        context.register(ADD_DIAMOND_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(BGPlacedFeatures.DIAMOND_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS)
        );
    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(BrassGeodes.MOD_ID, name));
    }
}
