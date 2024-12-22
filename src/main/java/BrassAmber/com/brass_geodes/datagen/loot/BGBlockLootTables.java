package BrassAmber.com.brass_geodes.datagen.loot;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BGItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BGBlockLootTables extends BlockLootSubProvider {
    public BGBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BGBlocks.RAW_TOPAZ.get());
        this.dropSelf(BGBlocks.RAW_SAPPHIRE.get());
        this.dropSelf(BGBlocks.RAW_RUBY.get());
        this.dropSelf(BGBlocks.RAW_EMERALD.get());
        this.dropSelf(BGBlocks.RAW_DIAMOND.get());

        this.clusterDrop(BGBlocks.TOPAZ_CLUSTER.get(), BGItems.TOPAZ.get());
        this.clusterDrop(BGBlocks.SAPPHIRE_CLUSTER.get(), BGItems.SAPPHIRE.get());
        this.clusterDrop(BGBlocks.RUBY_CLUSTER.get(), BGItems.RUBY.get());
        this.clusterDrop(BGBlocks.EMERALD_CLUSTER.get(), Items.EMERALD);
        this.clusterDrop(BGBlocks.DIAMOND_CLUSTER.get(), Items.DIAMOND);

        this.dropWhenSilkTouch(BGBlocks.SMALL_TOPAZ_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.SMALL_SAPPHIRE_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.SMALL_RUBY_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.SMALL_EMERALD_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.SMALL_DIAMOND_BUD.get());

        this.dropWhenSilkTouch(BGBlocks.MEDIUM_TOPAZ_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.MEDIUM_SAPPHIRE_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.MEDIUM_RUBY_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.MEDIUM_EMERALD_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.MEDIUM_DIAMOND_BUD.get());

        this.dropWhenSilkTouch(BGBlocks.LARGE_TOPAZ_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.LARGE_SAPPHIRE_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.LARGE_RUBY_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.LARGE_EMERALD_BUD.get());
        this.dropWhenSilkTouch(BGBlocks.LARGE_DIAMOND_BUD.get());

        this.noDrop(BGBlocks.BUDDING_TOPAZ.get());
        this.noDrop(BGBlocks.BUDDING_SAPPHIRE.get());
        this.noDrop(BGBlocks.BUDDING_RUBY.get());
        this.noDrop(BGBlocks.BUDDING_EMERALD.get());
        this.noDrop(BGBlocks.BUDDING_DIAMOND.get());

        this.noDrop(BGBlocks.GEMCORN_BRANCH.get());
        this.noDrop(BGBlocks.GEMCORN_TRUNK.get());

        this.dropSelf(BGBlocks.TOPAZ_TINTED_GLASS.get());
        this.dropSelf(BGBlocks.SAPPHIRE_TINTED_GLASS.get());
        this.dropSelf(BGBlocks.RUBY_TINTED_GLASS.get());
        this.dropSelf(BGBlocks.EMERALD_TINTED_GLASS.get());
        this.dropSelf(BGBlocks.DIAMOND_TINTED_GLASS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BGBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected void dropWhenSilkTouchAndDropOtherAmount(Block block, ItemLike drop, float min, float max) {
        this.add(block, createSilkTouchOnlyTable(block).withPool(
                LootPool.lootPool().when(HAS_NO_SILK_TOUCH).setRolls(
                        UniformGenerator.between(min, max)
                ).add(LootItem.lootTableItem(drop)))
        );
    }

    protected void clusterDrop(Block block, ItemLike drop) {
        createSilkTouchDispatchTable(block, LootItem.lootTableItem(drop).apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)).when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES))).otherwise(this.applyExplosionDecay(block, LootItem.lootTableItem(drop).apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
    }

    protected void noDrop(Block block) {
        this.add(block, noDrop());
    }

}
