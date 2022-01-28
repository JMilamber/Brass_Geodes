package BrassAmber.com.brass_geodes.world;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.world.gen.BGGeodeGen;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = BrassGeodes.MOD_ID)
public class BGWorldGenerationEvents {

    private static void BGWorldGenerationEvents() {
    }

    @SubscribeEvent
    public static void BrassGeodesWorldGeneration(final BiomeLoadingEvent event) {
        BGGeodeGen.generateGeodes(event);
    }
}
