package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.worldgen.BGBiomeModifiers;
import BrassAmber.com.brass_geodes.worldgen.BGConfiguredFeatures;
import BrassAmber.com.brass_geodes.worldgen.BGPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class BGWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, BGConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, BGPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BGBiomeModifiers::bootstrap);

    public BGWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(BrassGeodes.MOD_ID));
    }
}
