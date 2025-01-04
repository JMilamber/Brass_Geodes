package BrassAmber.com.brass_geodes.util;

import BrassAmber.com.brass_geodes.BrassGeodes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BGTags {
    public static class Items {

        public static final TagKey<Item> GEMS = tag("gems");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(BrassGeodes.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {

        public static final TagKey<Block> GEMCORN_LOGS = tag("gemcorn_logs");
        public static final TagKey<Block> GEMCORN_CAN_GROW_THROUGH = tag("gemcorn_growthrough");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(BrassGeodes.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
