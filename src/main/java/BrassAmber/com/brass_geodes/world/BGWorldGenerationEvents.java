package BrassAmber.com.brass_geodes.world;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.world.gen.BGGeodeGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BrassGeodes.MOD_ID)
public class BGWorldGenerationEvents {

    private static void WorldGenerationEvents() {}

    @SubscribeEvent
    public static void  BrassGeodesWorldGeneration(final BiomeLoadingEvent event) {
        BGGeodeGen.generateGeodes(event);
    }
}
