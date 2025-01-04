package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BGItems;
import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.util.BGTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BGItemTagGenerator extends ItemTagsProvider {
    public BGItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                              CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, BrassGeodes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BGTags.Items.GEMS)
                .add(BGItems.TOPAZ.get())
                .add(BGItems.SAPPHIRE.get())
                .add(BGItems.RUBY.get())
                .add(BGItems.PEARL.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
