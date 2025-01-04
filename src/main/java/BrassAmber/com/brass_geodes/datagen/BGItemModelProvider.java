package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BGItems;
import BrassAmber.com.brass_geodes.BrassGeodes;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BGItemModelProvider extends ItemModelProvider {
    public BGItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BrassGeodes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(BGItems.TOPAZ);
        simpleItem(BGItems.SAPPHIRE);
        simpleItem(BGItems.RUBY);
        simpleItem(BGItems.PEARL);

        saplingItem(BGBlocks.AMETHYST_SAPLING);
        saplingItem(BGBlocks.TOPAZ_SAPLING);
        saplingItem(BGBlocks.SAPPHIRE_SAPLING);
        saplingItem(BGBlocks.RUBY_SAPLING);
        saplingItem(BGBlocks.EMERALD_SAPLING);
        saplingItem(BGBlocks.DIAMOND_SAPLING);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BrassGeodes.MOD_ID,"item/" + item.getId().getPath().split("_")[0] + "_gemcorn"));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BrassGeodes.MOD_ID, "item/" + item.getId().getPath()));
    }


    private ItemModelBuilder simpleExtraFolderItem(RegistryObject<Item> item, String folder) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BrassGeodes.MOD_ID, "item/"+ folder + "/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BrassGeodes.MOD_ID,"item/" + item.getId().getPath()));
    }

}
