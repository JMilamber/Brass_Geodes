package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BrassGeodes;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BTBlocksStateProvider extends BlockStateProvider {
    public BTBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BrassGeodes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(
                BGBlocks.AMETHYST_GEMCORN_SAPLING,
                models().singleTexture()
                );
    }


    private void chestBlock(RegistryObject<Block> block) {
        simpleBlock(
                block.get(),
                models().getBuilder(block.getId().getPath())
                        .texture("particle", new ResourceLocation("minecraft:block/stone"))
        );
    }

    private void spawnerBlock(RegistryObject<Block> block) {
        simpleBlockWithItem(
                block.get(),
                models().cubeAll(block.getId().getPath(), new ResourceLocation(BrassGeodes.MOD_ID,"block/spawner/" + block.getId().getPath()))
        );
    }
}
