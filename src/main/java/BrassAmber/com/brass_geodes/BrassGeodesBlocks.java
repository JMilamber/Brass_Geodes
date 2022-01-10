package BrassAmber.com.brass_geodes;

import BrassAmber.com.brass_geodes.block.BuddingGemBlock;
import BrassAmber.com.brass_geodes.block.GemClusterBlock;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BrassGeodesBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrassGeodes.MOD_ID);

    public static final Block GEODE_TOPAZ = registerBlock("geode_topaz", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_SAPPHIRE = registerBlock("geode_sapphire", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLUE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_RUBY = registerBlock("geode_ruby", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_RED).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_EMERALD = registerBlock("geode_emerald", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_DIAMOND = registerBlock("geode_diamond", new AmethystBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final Block AMETHYST_BLOCK = registerBlock("amethyst_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final Block C_TOPAZ = registerDecoration("topaz_cluster", new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_SAPPHIRE = registerDecoration("sapphire_cluster", new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_RUBY = registerDecoration("ruby_cluster", new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_EMERALD = registerDecoration("emerald_cluster", new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_DIAMOND = registerDecoration("diamond_cluster", new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));

    public static final Block LARGE_TOPAZ = registerDecoration("large_topaz_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_SAPPHIRE = registerDecoration("large_sapphire_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_RUBY = registerDecoration("large_ruby_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_EMERALD = registerDecoration("large_emerald_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_DIAMOND = registerDecoration("large_diamond_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));

    public static final Block MEDIUM_TOPAZ = registerDecoration("medium_topaz_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_SAPPHIRE = registerDecoration("medium_sapphire_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_RUBY = registerDecoration("medium_ruby_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_EMERALD = registerDecoration("medium_emerald_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_DIAMOND = registerDecoration("medium_diamond_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));

    public static final Block SMALL_TOPAZ = registerDecoration("small_topaz_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_SAPPHIRE = registerDecoration("small_sapphire_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_RUBY = registerDecoration("small_ruby_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_EMERALD = registerDecoration("small_emerald_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_DIAMOND = registerDecoration("small_diamond_bud", new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));


    public static final Block B_TOPAZ = registerBlock("budding_topaz",
            new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_TOPAZ, MEDIUM_TOPAZ, LARGE_TOPAZ, C_TOPAZ, Math.round(GemMaterial.TOPAZ.getRarity() * 10 * 5)));
    public static final Block B_SAPPHIRE = registerBlock("budding_sapphire",
            new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_SAPPHIRE, MEDIUM_SAPPHIRE, LARGE_SAPPHIRE, C_SAPPHIRE, Math.round(GemMaterial.SAPPHIRE.getRarity() * 10 * 5)));
    public static final Block B_RUBY = registerBlock("budding_ruby",
            new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_RUBY, MEDIUM_RUBY, LARGE_RUBY, C_RUBY, Math.round(GemMaterial.RUBY.getRarity() * 10 * 5)));
    public static final Block B_EMERALD = registerBlock("budding_emerald",
            new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_EMERALD, MEDIUM_EMERALD, LARGE_EMERALD, C_EMERALD, Math.round(GemMaterial.EMERALD.getRarity() * 10 * 5)));
    public static final Block B_DIAMOND = registerBlock("budding_diamond",
            new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_DIAMOND, MEDIUM_DIAMOND, LARGE_DIAMOND, C_DIAMOND, Math.round(GemMaterial.DIAMOND.getRarity() * 10 * 5)));


    public static final Block TOPAZ_TINTED = registerDecoration("topaz_tinted_glass",
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_ORANGE)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final Block SAPPHIRE_TINTED = registerDecoration("sapphire_tinted_glass",
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_BLUE)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final Block RUBY_TINTED = registerDecoration("ruby_tinted_glass",
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_RED)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final Block EMERALD_TINTED = registerDecoration("emerald_tinted_glass",
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.EMERALD)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final Block DIAMOND_TINTED = registerDecoration("diamond_tinted_glass",
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.DIAMOND)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));






    private static Block registerBlock(String name, Block block) {
        BLOCKS.register(name, () -> block);
        BrassGeodesItems.registerItem(name, new BlockItem(block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
        return block;
    }

    private static Block registerDecoration(String name, Block block) {
        BLOCKS.register(name, () -> block);
        BrassGeodesItems.registerItem(name, new BlockItem(block, new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
        return block;
    }

    // Taken from Blocks.java (private function)
    private static boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
        return (boolean) false;
    }

    // Taken from Blocks.java (private function)
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return (boolean) false;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
