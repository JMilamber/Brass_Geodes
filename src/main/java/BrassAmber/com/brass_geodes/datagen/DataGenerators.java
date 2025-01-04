package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BrassGeodes;

import BrassAmber.com.brass_geodes.datagen.loot.BGBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
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
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), BGLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new BGRecipeProvider(packOutput));
        BlockTagsProvider blockTagsProvider = new BGBlockTagGenerator(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new BGItemTagGenerator(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new BGItemModelProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeClient(), new BGBlocksStateProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new BGWorldGenProvider(packOutput, lookupProvider));
    }
}
