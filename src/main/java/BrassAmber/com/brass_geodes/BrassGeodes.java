package BrassAmber.com.brass_geodes;

import BrassAmber.com.brass_geodes.block.BrassGeodesBlocks;
import BrassAmber.com.brass_geodes.client.BrassGeodesBlockRender;
import BrassAmber.com.brass_geodes.item.BrassGeodesItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BrassGeodes.MOD_ID)
public class BrassGeodes {
    public static final String MOD_ID = "brass_geodes";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public BrassGeodes() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BrassGeodesItems.register(eventBus);
        BrassGeodesBlocks.register(eventBus);

        eventBus.addListener(this::setUpClient);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setUpClient(final FMLClientSetupEvent event) {
        BrassGeodesBlockRender.setRenderLayers();
    }

    /*@SubscribeEvent
    public static  void onItemRegister(final RegistryEvent.Register<Item> event) {
        for (Item item : event.getRegistry()) {
            if (item.getRegistryName().equals(Items.AMETHYST_SHARD.getRegistryName())) {
                event.getRegistry().register(BrassGeodesItems.Amethyst.asItem());
            }
        }
    }*/

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        LOGGER.debug("Running common setup.");
    }


    // Helper method for resource locations
    public static ResourceLocation locate(String name) {
        return new ResourceLocation(BrassGeodes.MOD_ID, name);
    }

}
