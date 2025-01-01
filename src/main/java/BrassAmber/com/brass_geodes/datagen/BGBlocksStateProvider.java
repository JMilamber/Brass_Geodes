package BrassAmber.com.brass_geodes.datagen;

import BrassAmber.com.brass_geodes.BGBlocks;
import BrassAmber.com.brass_geodes.BrassGeodes;
import BrassAmber.com.brass_geodes.block.GemcornSaplingBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BGBlocksStateProvider extends BlockStateProvider {
    public BGBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BrassGeodes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        cubeBlock(BGBlocks.RAW_TOPAZ);
        cubeBlock(BGBlocks.RAW_SAPPHIRE);
        cubeBlock(BGBlocks.RAW_RUBY);
        cubeBlock(BGBlocks.RAW_EMERALD);
        cubeBlock(BGBlocks.RAW_DIAMOND);

        cubeBlock(BGBlocks.TOPAZ_BLOCK);
        cubeBlock(BGBlocks.RAW_SAPPHIRE);
        cubeBlock(BGBlocks.RAW_RUBY);
        cubeBlock(BGBlocks.RAW_EMERALD);
        cubeBlock(BGBlocks.RAW_DIAMOND);

        clusterBlock(BGBlocks.TOPAZ_CLUSTER);
        clusterBlock(BGBlocks.SAPPHIRE_CLUSTER);
        clusterBlock(BGBlocks.RUBY_CLUSTER);
        clusterBlock(BGBlocks.EMERALD_CLUSTER);
        clusterBlock(BGBlocks.DIAMOND_CLUSTER);

        clusterBlock(BGBlocks.SMALL_TOPAZ_BUD);
        clusterBlock(BGBlocks.SMALL_SAPPHIRE_BUD);
        clusterBlock(BGBlocks.SMALL_RUBY_BUD);
        clusterBlock(BGBlocks.SMALL_EMERALD_BUD);
        clusterBlock(BGBlocks.SMALL_DIAMOND_BUD);

        clusterBlock(BGBlocks.MEDIUM_TOPAZ_BUD);
        clusterBlock(BGBlocks.MEDIUM_SAPPHIRE_BUD);
        clusterBlock(BGBlocks.MEDIUM_RUBY_BUD);
        clusterBlock(BGBlocks.MEDIUM_EMERALD_BUD);
        clusterBlock(BGBlocks.MEDIUM_DIAMOND_BUD);

        clusterBlock(BGBlocks.LARGE_TOPAZ_BUD);
        clusterBlock(BGBlocks.LARGE_SAPPHIRE_BUD);
        clusterBlock(BGBlocks.LARGE_RUBY_BUD);
        clusterBlock(BGBlocks.LARGE_EMERALD_BUD);
        clusterBlock(BGBlocks.LARGE_DIAMOND_BUD);

        cubeBlock(BGBlocks.BUDDING_TOPAZ);
        cubeBlock(BGBlocks.BUDDING_SAPPHIRE);
        cubeBlock(BGBlocks.BUDDING_RUBY);
        cubeBlock(BGBlocks.BUDDING_EMERALD);
        cubeBlock(BGBlocks.BUDDING_DIAMOND);

        branchBlock(BGBlocks.GEMCORN_BRANCH);
        branchBlock(BGBlocks.AMETHYST_BRANCH);
        branchBlock(BGBlocks.TOPAZ_BRANCH);
        branchBlock(BGBlocks.SAPPHIRE_BRANCH);
        branchBlock(BGBlocks.RUBY_BRANCH);
        branchBlock(BGBlocks.EMERALD_BRANCH);
        branchBlock(BGBlocks.DIAMOND_BRANCH);

        trunkBlock(BGBlocks.GEMCORN_TRUNK);
        trunkBlock(BGBlocks.BUDDING_AMETHYST_TRUNK);
        trunkBlock(BGBlocks.BUDDING_TOPAZ_TRUNK);
        trunkBlock(BGBlocks.BUDDING_SAPPHIRE_TRUNK);
        trunkBlock(BGBlocks.BUDDING_RUBY_TRUNK);
        trunkBlock(BGBlocks.BUDDING_EMERALD_TRUNK);
        trunkBlock(BGBlocks.BUDDING_DIAMOND_TRUNK);

        sapling(BGBlocks.AMETHYST_SAPLING);
        sapling(BGBlocks.TOPAZ_SAPLING);
        sapling(BGBlocks.SAPPHIRE_SAPLING);
        sapling(BGBlocks.RUBY_SAPLING);
        sapling(BGBlocks.EMERALD_SAPLING);
        sapling(BGBlocks.DIAMOND_SAPLING);

        cubeBlock(BGBlocks.TOPAZ_TINTED_GLASS);
        cubeBlock(BGBlocks.SAPPHIRE_TINTED_GLASS);
        cubeBlock(BGBlocks.RUBY_TINTED_GLASS);
        cubeBlock(BGBlocks.EMERALD_TINTED_GLASS);
        cubeBlock(BGBlocks.DIAMOND_TINTED_GLASS);

    }


    private void sapling(RegistryObject<Block> block) {
        getVariantBuilder(block.get()).forAllStates(state -> switch (state.getValue(GemcornSaplingBlock.AGE)) {
            default -> new ConfiguredModel[]{new ConfiguredModel(
                    models().cross(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/gemcorn_sapling")))
            };
            case 1 -> new ConfiguredModel[]{new ConfiguredModel(
                    models().cross(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/gemcorn_sapling_grown")))
            };
            case 2 -> new ConfiguredModel[]{new ConfiguredModel(
                    models().cross(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/" + block.getId().getPath())))
            };
        });
        simpleBlockItem(
                block.get(),
                models().cross(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/" + block.getId().getPath()))
        );
    }

    private void branchBlock(RegistryObject<Block> block) {
        directionalBlock(
                block.get(),
                models().cross(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/" + block.getId().getPath()))
        );
    }

    private void clusterBlock(RegistryObject<Block> block) {
        directionalBlock(
                block.get(),
                models().cross(block.getId().getPath(), BrassGeodes.locate("block/" + block.getId().getPath()))
        );
    }

    private void simpleBlockWithItemFolder(RegistryObject<Block> block, String path) {
        simpleBlockWithItem(
                block.get(),
                models().cubeAll(block.getId().getPath(), BrassGeodes.locate("block/" + path + block.getId().getPath()))
        );
    }

    private void cubeBlock(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), BrassGeodes.locate("block/" + block.getId().getPath())));
    }

    private void trunkBlock(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), BrassGeodes.locate("block/gemcorn/" + block.getId().getPath())));
    }


    private void chestBlock(RegistryObject<Block> block) {
        simpleBlock(
                block.get(),
                models().getBuilder(block.getId().getPath())
                        .texture("particle", new ResourceLocation("minecraft:block/stone"))
        );
    }

}
