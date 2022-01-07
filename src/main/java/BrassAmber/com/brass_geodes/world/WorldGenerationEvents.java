package BrassAmber.com.brass_geodes.world;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.world.gen.BrassGeodesGeodeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BrassGeodes.MOD_ID)
public class WorldGenerationEvents {

    private static void WorldGenerationEvents() {}

    @SubscribeEvent
    public static void  BrassGeodesWorldGeneration(final BiomeLoadingEvent event) {
        BrassGeodesGeodeGeneration.generateGeodes(event);
    }
}
