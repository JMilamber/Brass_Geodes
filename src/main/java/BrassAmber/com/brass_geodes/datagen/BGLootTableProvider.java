package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.datagen.loot.BGBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class BGLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(BGBlockLootTables::new, LootContextParamSets.BLOCK)));
    }
}
