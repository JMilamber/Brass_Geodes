package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BrassGeodes;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BGModelProvider extends ItemModelProvider {
    public BGModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BrassGeodes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    }

    private ItemModelBuilder emptyItem(ResourceLocation location) {
        return getBuilder(location.toString());
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

}
