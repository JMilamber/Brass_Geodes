package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BrassGeodes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BrassGeodes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packoutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BTRecipeProvider(packoutput));
        generator.addProvider(event.includeServer(), new BGBlockTagGenerator(packoutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new BGModelProvider(packoutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new BTBlocksStateProvider(packoutput, existingFileHelper));
    }
}
