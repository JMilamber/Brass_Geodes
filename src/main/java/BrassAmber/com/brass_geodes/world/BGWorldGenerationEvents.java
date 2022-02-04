package BrassAmber.com.brass_geodes.world;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.world.gen.BGGeodeGen;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BrassGeodes.MOD_ID)
public class BGWorldGenerationEvents {

    private static void BGWorldGenerationEvents() {
    }

    @SubscribeEvent
    public static void BrassGeodesWorldGeneration(final BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            // empty for now
        } else if (event.getCategory() == Biome.BiomeCategory.THEEND) {
            // empty for now
        } else {
            BGGeodeGen.generateOverworldGeodes(event);
        }

    }
}
