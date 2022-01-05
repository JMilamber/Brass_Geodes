package BrassAmber.com.brass_geodes.block;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.item.BrassGeodesItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BrassGeodesBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrassGeodes.MOD_ID);

    public static final Block B_DIAMOND = registerBlock("budding_diamond", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block B_EMERALD = registerBlock("budding_emerald", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block B_RUBY = registerBlock("budding_ruby", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block B_SAPPHIRE = registerBlock("budding_sapphire", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block B_TOPAZ = registerBlock("budding_topaz", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final Block GEODE_DIAMOND = registerBlock("geode_diamond", new AmethystBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_EMERALD = registerBlock("geode_emerald", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_RUBY = registerBlock("geode_ruby", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_RED).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_SAPPHIRE = registerBlock("geode_sapphire", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLUE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final Block GEODE_TOPAZ = registerBlock("geode_topaz", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final Block AMETHYST_BLOCK = registerBlock("amethyst_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final Block C_DIAMOND = registerDecoration("diamond_cluster", new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_EMERALD = registerDecoration("emerald_cluster", new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_RUBY = registerDecoration("ruby_cluster", new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_SAPPHIRE = registerDecoration("sapphire_cluster", new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final Block C_TOPAZ = registerDecoration("topaz_cluster", new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));

    public static final Block LARGE_DIAMOND = registerDecoration("large_diamond_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_EMERALD = registerDecoration("large_emerald_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_RUBY = registerDecoration("large_ruby_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_SAPPHIRE = registerDecoration("large_sapphire_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final Block LARGE_TOPAZ = registerDecoration("large_topaz_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));

    public static final Block MEDIUM_DIAMOND = registerDecoration("medium_diamond_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_EMERALD = registerDecoration("medium_emerald_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_RUBY = registerDecoration("medium_ruby_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_SAPPHIRE = registerDecoration("medium_sapphire_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final Block MEDIUM_TOPAZ = registerDecoration("medium_topaz_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));

    public static final Block SMALL_DIAMOND = registerDecoration("small_diamond_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_EMERALD = registerDecoration("small_emerald_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_RUBY = registerDecoration("small_ruby_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_SAPPHIRE = registerDecoration("small_sapphire_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final Block SMALL_TOPAZ = registerDecoration("small_topaz_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));



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
    

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
