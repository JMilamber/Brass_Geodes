package BrassAmber.com.brass_geodes.item;

import BrassAmber.com.brass_geodes.BrassGeodes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BrassGeodesItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BrassGeodes.MOD_ID);


    public static final Item PEARL = registerItem("pearl", new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final Item TOPAZ = registerItem("topaz", new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


    /**
     * Helper method for registering all Items
     */
    public static Item registerItem(String registryName, Item item) {
        ITEMS.register(registryName, () -> item);
        return item;
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
