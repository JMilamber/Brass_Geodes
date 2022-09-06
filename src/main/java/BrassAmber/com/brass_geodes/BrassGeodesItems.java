package BrassAmber.com.brass_geodes;

import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.item.GemItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrassGeodesItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrassGeodes.MOD_ID);


    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new GemItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new GemItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new GemItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new GemItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).rarity(Rarity.COMMON)));

    /* -------------Blocks--------------*/
    public static final RegistryObject<Item> GEODE_TOPAZ = ITEMS.register("geode_topaz", () -> new BlockItem(BrassGeodesBlocks.GEODE_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GEODE_SAPPHIRE = ITEMS.register("geode_sapphire", () -> new BlockItem(BrassGeodesBlocks.GEODE_SAPPHIRE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GEODE_RUBY = ITEMS.register("geode_ruby", () -> new BlockItem(BrassGeodesBlocks.GEODE_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GEODE_EMERALD = ITEMS.register("geode_emerald", () -> new BlockItem(BrassGeodesBlocks.GEODE_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> GEODE_DIAMOND = ITEMS.register("geode_diamond", () -> new BlockItem(BrassGeodesBlocks.GEODE_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> AMETHYST_BLOCK = ITEMS.register("amethyst_block", () -> new BlockItem(BrassGeodesBlocks.AMETHYST_BLOCK .get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> TOPAZ_BLOCK = ITEMS.register("topaz_block", () -> new BlockItem(BrassGeodesBlocks.TOPAZ_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(BrassGeodesBlocks.SAPPHIRE_BLOCK .get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BrassGeodesBlocks.RUBY_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> C_TOPAZ = ITEMS.register("topaz_cluster", () -> new BlockItem(BrassGeodesBlocks.C_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> C_SAPPHIRE = ITEMS.register("sapphire_cluster", () -> new BlockItem(BrassGeodesBlocks.C_SAPPHIRE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> C_RUBY = ITEMS.register("ruby_cluster", () -> new BlockItem(BrassGeodesBlocks.C_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> C_EMERALD = ITEMS.register("emerald_cluster", () -> new BlockItem(BrassGeodesBlocks.C_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> C_DIAMOND = ITEMS.register("diamond_cluster", () -> new BlockItem(BrassGeodesBlocks.C_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> LARGE_TOPAZ = ITEMS.register("large_topaz_bud", () -> new BlockItem(BrassGeodesBlocks.LARGE_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LARGE_SAPPHIRE = ITEMS.register("large_sapphire_bud", () -> new BlockItem(BrassGeodesBlocks.LARGE_SAPPHIRE .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LARGE_RUBY = ITEMS.register("large_ruby_bud", () -> new BlockItem(BrassGeodesBlocks.LARGE_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LARGE_EMERALD = ITEMS.register("large_emerald_bud", () -> new BlockItem(BrassGeodesBlocks.LARGE_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LARGE_DIAMOND = ITEMS.register("large_diamond_bud", () -> new BlockItem(BrassGeodesBlocks.LARGE_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> MEDIUM_TOPAZ = ITEMS.register("medium_topaz_bud", () -> new BlockItem(BrassGeodesBlocks.MEDIUM_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MEDIUM_SAPPHIRE = ITEMS.register("medium_sapphire_bud", () -> new BlockItem(BrassGeodesBlocks.MEDIUM_SAPPHIRE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MEDIUM_RUBY = ITEMS.register("medium_ruby_bud", () -> new BlockItem(BrassGeodesBlocks.MEDIUM_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MEDIUM_EMERALD = ITEMS.register("medium_emerald_bud", () -> new BlockItem(BrassGeodesBlocks.MEDIUM_EMERALD .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MEDIUM_DIAMOND = ITEMS.register("medium_diamond_bud", () -> new BlockItem(BrassGeodesBlocks.MEDIUM_DIAMOND .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> SMALL_TOPAZ = ITEMS.register("small_topaz_bud", () -> new BlockItem(BrassGeodesBlocks.SMALL_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SMALL_SAPPHIRE = ITEMS.register("small_sapphire_bud", () -> new BlockItem(BrassGeodesBlocks.SMALL_SAPPHIRE .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SMALL_RUBY = ITEMS.register("small_ruby_bud", () -> new BlockItem(BrassGeodesBlocks.SMALL_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SMALL_EMERALD = ITEMS.register("small_emerald_bud", () -> new BlockItem(BrassGeodesBlocks.SMALL_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SMALL_DIAMOND = ITEMS.register("small_diamond_bud", () -> new BlockItem(BrassGeodesBlocks.SMALL_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> B_TOPAZ = ITEMS.register("budding_topaz", () -> new BlockItem(BrassGeodesBlocks.B_TOPAZ.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> B_SAPPHIRE = ITEMS.register("budding_sapphire", () -> new BlockItem(BrassGeodesBlocks.B_SAPPHIRE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> B_RUBY = ITEMS.register("budding_ruby", () -> new BlockItem(BrassGeodesBlocks.B_RUBY.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> B_EMERALD = ITEMS.register("budding_emerald", () -> new BlockItem(BrassGeodesBlocks.B_EMERALD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> B_DIAMOND = ITEMS.register("budding_diamond", () -> new BlockItem(BrassGeodesBlocks.B_DIAMOND.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> TOPAZ_TINTED = ITEMS.register("topaz_tinted_glass", () -> new BlockItem(BrassGeodesBlocks.TOPAZ_TINTED.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> SAPPHIRE_TINTED = ITEMS.register("sapphire_tinted_glass", () -> new BlockItem(BrassGeodesBlocks.SAPPHIRE_TINTED.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> RUBY_TINTED = ITEMS.register("ruby_tinted_glass", () -> new BlockItem(BrassGeodesBlocks.RUBY_TINTED.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> EMERALD_TINTED = ITEMS.register("emerald_tinted_glass", () -> new BlockItem(BrassGeodesBlocks.EMERALD_TINTED .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> DIAMOND_TINTED = ITEMS.register("diamond_tinted_glass", () -> new BlockItem(BrassGeodesBlocks.DIAMOND_TINTED .get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    /**
     * Helper method for registering all Items
     */

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
