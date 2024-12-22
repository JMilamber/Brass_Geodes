package BrassAmber.com.brass_geodes;

import BrassAmber.com.brass_geodes.block.*;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import BrassAmber.com.brass_geodes.world.features.GemcornTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BGBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrassGeodes.MOD_ID);

    public static final RegistryObject<Block> RAW_TOPAZ = registerBlock("raw_topaz", () -> new AmethystBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SAPPHIRE = registerBlock("raw_sapphire", () -> new AmethystBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_RUBY = registerBlock("raw_ruby", () -> new AmethystBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_EMERALD = registerBlock("raw_emerald", () -> new AmethystBlock(BlockBehaviour.Properties.of().mapColor(MapColor.EMERALD).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_DIAMOND = registerBlock("raw_diamond", () -> new AmethystBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TOPAZ_CLUSTER = registerBlock("topaz_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("ruby_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block> EMERALD_CLUSTER = registerBlock("emerald_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block> DIAMOND_CLUSTER = registerBlock("diamond_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of().noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));

    public static final RegistryObject<Block> SMALL_TOPAZ_BUD = registerBlock("small_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(TOPAZ_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(SAPPHIRE_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(RUBY_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block> SMALL_EMERALD_BUD = registerBlock("small_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block> SMALL_DIAMOND_BUD = registerBlock("small_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));

    public static final RegistryObject<Block> MEDIUM_TOPAZ_BUD = registerBlock("medium_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(TOPAZ_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(SAPPHIRE_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(RUBY_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block> MEDIUM_EMERALD_BUD = registerBlock("medium_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block> MEDIUM_DIAMOND_BUD = registerBlock("medium_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));

    public static final RegistryObject<Block> LARGE_TOPAZ_BUD = registerBlock("large_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(TOPAZ_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(SAPPHIRE_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(RUBY_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block> LARGE_EMERALD_BUD = registerBlock("large_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(EMERALD_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block> LARGE_DIAMOND_BUD = registerBlock("large_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(DIAMOND_CLUSTER.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));

    public static final RegistryObject<Block> BUDDING_TOPAZ = registerBlock("budding_topaz",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of().randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_TOPAZ_BUD.get(), MEDIUM_TOPAZ_BUD.get(), LARGE_TOPAZ_BUD.get(), TOPAZ_CLUSTER.get(), Math.round(GemMaterial.TOPAZ.getRarity() * 300)));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE = registerBlock("budding_sapphire",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of().randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_SAPPHIRE_BUD.get(), MEDIUM_SAPPHIRE_BUD.get(), LARGE_SAPPHIRE_BUD.get(), SAPPHIRE_CLUSTER.get(), Math.round(GemMaterial.SAPPHIRE.getRarity() * 300)));
    public static final RegistryObject<Block> BUDDING_RUBY = registerBlock("budding_ruby",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of().randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_RUBY_BUD.get(), MEDIUM_RUBY_BUD.get(), LARGE_RUBY_BUD.get(), RUBY_CLUSTER.get(), Math.round(GemMaterial.RUBY.getRarity() * 300)));
    public static final RegistryObject<Block> BUDDING_EMERALD = registerBlock("budding_emerald",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of().randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_EMERALD_BUD.get(), MEDIUM_EMERALD_BUD.get(), LARGE_EMERALD_BUD.get(), EMERALD_CLUSTER.get(), Math.round(GemMaterial.EMERALD.getRarity() * 300)));
    public static final RegistryObject<Block> BUDDING_DIAMOND = registerBlock("budding_diamond",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of().randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_DIAMOND_BUD.get(), MEDIUM_DIAMOND_BUD.get(), LARGE_DIAMOND_BUD.get(), DIAMOND_CLUSTER.get(), Math.round(GemMaterial.DIAMOND.getRarity() * 300)));


    public static final RegistryObject<Block> GEMCORN_BRANCH = registerBlock("gemcorn_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AMETHYST_BRANCH = registerBlock("amethyst_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TOPAZ_BRANCH = registerBlock("topaz_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SAPPHIRE_BRANCH = registerBlock("sapphire_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RUBY_BRANCH = registerBlock("ruby_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> EMERALD_BRANCH = registerBlock("emerald_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DIAMOND_BRANCH = registerBlock("diamond_branch",
            () -> new GemcornBranch(5, 3, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).replaceable().noCollission().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GEMCORN_TRUNK = registerBlock("gemcorn_trunk",
            () -> log(MapColor.DEEPSLATE, MapColor.STONE));

    public static final RegistryObject<Block> BUDDING_AMETHYST_TRUNK = registerBlock("budding_amethyst_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.AMETHYST.getRarity()), AMETHYST_BRANCH.get()
            ));
    public static final RegistryObject<Block> BUDDING_TOPAZ_TRUNK = registerBlock("budding_topaz_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.TOPAZ.getRarity()), AMETHYST_BRANCH.get()
            ));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE_TRUNK = registerBlock("budding_sapphire_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.SAPPHIRE.getRarity()), SAPPHIRE_BRANCH.get()
            ));
    public static final RegistryObject<Block> BUDDING_RUBY_TRUNK = registerBlock("budding_ruby_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.RUBY.getRarity()), RUBY_BRANCH.get()
            ));
    public static final RegistryObject<Block> BUDDING_EMERALD_TRUNK = registerBlock("budding_emerald_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.EMERALD.getRarity()), EMERALD_BRANCH.get()
            ));
    public static final RegistryObject<Block> BUDDING_DIAMOND_TRUNK = registerBlock("budding_diamond_trunk",
            () -> new BuddingGemcornTrunk(
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops().pushReaction(PushReaction.DESTROY),
                    Math.round(GemMaterial.DIAMOND.getRarity()), DIAMOND_BRANCH.get()
            ));

    public static final RegistryObject<Block> AMETHYST_GEMCORN_SAPLING = registerBlock("amethyst_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TOPAZ_GEMCORN_SAPLING = registerBlock("topaz_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> RUBY_GEMCORN_SAPLING = registerBlock("ruby_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> SAPPHIRE_GEMCORN_SAPLING = registerBlock("sapphire_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> EMERALD_GEMCORN_SAPLING = registerBlock("emerald_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> DIAMOND_GEMCORN_SAPLING = registerBlock("diamond_gemcorn_sapling",
            () -> new GemcornSaplingBlock(new GemcornTreeGrower(), BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.COPPER)));

    public static final RegistryObject<Block> TOPAZ_TINTED_GLASS = registerBlock("topaz_tinted_glass", () -> tintedGlass(MapColor.COLOR_ORANGE));

    public static final RegistryObject<Block> SAPPHIRE_TINTED_GLASS = registerBlock("sapphire_tinted_glass", () -> tintedGlass(MapColor.COLOR_BLUE));

    public static final RegistryObject<Block> RUBY_TINTED_GLASS = registerBlock("ruby_tinted_glass", () -> tintedGlass(MapColor.COLOR_RED));

    public static final RegistryObject<Block> EMERALD_TINTED_GLASS = registerBlock("emerald_tinted_glass", () -> tintedGlass(MapColor.EMERALD));

    public static final RegistryObject<Block> DIAMOND_TINTED_GLASS = registerBlock("diamond_tinted_glass", () -> tintedGlass(MapColor.DIAMOND));


    // Taken from Blocks.java (private function)
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }

    // Taken from Blocks.java (private function)
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    private static RotatedPillarBlock log(MapColor mapColor, MapColor mapColor1) {
        return new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((blockState) -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? mapColor : mapColor1).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD));
    }

    private static TintedGlassBlock tintedGlass(MapColor color) {
        return new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).mapColor(color)
                .noOcclusion().isValidSpawn(BGBlocks::never).isRedstoneConductor(BGBlocks::never)
                .isSuffocating(BGBlocks::never).isViewBlocking(BGBlocks::never));
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static  <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BGItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
