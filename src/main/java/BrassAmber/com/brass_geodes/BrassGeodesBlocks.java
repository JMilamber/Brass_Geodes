package BrassAmber.com.brass_geodes;

import BrassAmber.com.brass_geodes.block.BuddingGemBlock;
import BrassAmber.com.brass_geodes.block.GemClusterBlock;
import BrassAmber.com.brass_geodes.util.GemMaterial;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrassGeodesBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, BrassGeodes.MOD_ID);

    public static final RegistryObject<Block> GEODE_TOPAZ = BLOCKS.register("geode_topaz", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEODE_SAPPHIRE = BLOCKS.register("geode_sapphire", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLUE).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEODE_RUBY = BLOCKS.register("geode_ruby", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_RED).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEODE_EMERALD = BLOCKS.register("geode_emerald", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.EMERALD).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEODE_DIAMOND = BLOCKS.register("geode_diamond", () -> new AmethystBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(3.0F, 6.0F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block>  C_TOPAZ = BLOCKS.register("topaz_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block>  C_SAPPHIRE = BLOCKS.register("sapphire_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block>  C_RUBY = BLOCKS.register("ruby_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block>  C_EMERALD = BLOCKS.register("emerald_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));
    public static final RegistryObject<Block>  C_DIAMOND = BLOCKS.register("diamond_cluster", () -> new GemClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> 5)));

    public static final RegistryObject<Block>  LARGE_TOPAZ = BLOCKS.register("large_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block>  LARGE_SAPPHIRE = BLOCKS.register("large_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block>  LARGE_RUBY = BLOCKS.register("large_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block>  LARGE_EMERALD = BLOCKS.register("large_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));
    public static final RegistryObject<Block>  LARGE_DIAMOND = BLOCKS.register("large_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND.get()).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_152629_) -> 4)));

    public static final RegistryObject<Block>  MEDIUM_TOPAZ = BLOCKS.register("medium_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block>  MEDIUM_SAPPHIRE = BLOCKS.register("medium_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block>  MEDIUM_RUBY = BLOCKS.register("medium_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block>  MEDIUM_EMERALD = BLOCKS.register("medium_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));
    public static final RegistryObject<Block>  MEDIUM_DIAMOND = BLOCKS.register("medium_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND.get()).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> 2)));

    public static final RegistryObject<Block>  SMALL_TOPAZ = BLOCKS.register("small_topaz_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_TOPAZ.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block>  SMALL_SAPPHIRE = BLOCKS.register("small_sapphire_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_SAPPHIRE.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block>  SMALL_RUBY = BLOCKS.register("small_ruby_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_RUBY.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block>  SMALL_EMERALD = BLOCKS.register("small_emerald_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_EMERALD.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));
    public static final RegistryObject<Block>  SMALL_DIAMOND = BLOCKS.register("small_diamond_bud", () -> new GemClusterBlock(5, 3, BlockBehaviour.Properties.copy(C_DIAMOND.get()).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_152629_) -> 1)));


    public static final RegistryObject<Block> B_TOPAZ = BLOCKS.register("budding_topaz",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_TOPAZ.get(), MEDIUM_TOPAZ.get(), LARGE_TOPAZ.get(), C_TOPAZ.get(), Math.round(GemMaterial.TOPAZ.getRarity() * 10 * 5)));
    public static final RegistryObject<Block> B_SAPPHIRE = BLOCKS.register("budding_sapphire",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_SAPPHIRE.get(), MEDIUM_SAPPHIRE.get(), LARGE_SAPPHIRE.get(), C_SAPPHIRE.get(), Math.round(GemMaterial.SAPPHIRE.getRarity() * 10 * 5)));
    public static final RegistryObject<Block> B_RUBY = BLOCKS.register("budding_ruby",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_RUBY.get(), MEDIUM_RUBY.get(), LARGE_RUBY.get(), C_RUBY.get(), Math.round(GemMaterial.RUBY.getRarity() * 10 * 5)));
    public static final RegistryObject<Block> B_EMERALD = BLOCKS.register("budding_emerald",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_EMERALD.get(), MEDIUM_EMERALD.get(), LARGE_EMERALD.get(), C_EMERALD.get(), Math.round(GemMaterial.EMERALD.getRarity() * 10 * 5)));
    public static final RegistryObject<Block> B_DIAMOND = BLOCKS.register("budding_diamond",
          () ->  new BuddingGemBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops(),
                    SMALL_DIAMOND.get(), MEDIUM_DIAMOND.get(), LARGE_DIAMOND.get(), C_DIAMOND.get(), Math.round(GemMaterial.DIAMOND.getRarity() * 10 * 5)));


    public static final RegistryObject<Block>  TOPAZ_TINTED = BLOCKS.register("topaz_tinted_glass",
          () ->  new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_ORANGE)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final RegistryObject<Block>  SAPPHIRE_TINTED = BLOCKS.register("sapphire_tinted_glass",
          () ->  new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_BLUE)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final RegistryObject<Block>  RUBY_TINTED = BLOCKS.register("ruby_tinted_glass",
          () ->  new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.COLOR_RED)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final RegistryObject<Block>  EMERALD_TINTED = BLOCKS.register("emerald_tinted_glass",
          () ->  new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.EMERALD)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    public static final RegistryObject<Block> DIAMOND_TINTED = BLOCKS.register("diamond_tinted_glass", () ->
            new TintedGlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).color(MaterialColor.DIAMOND)
                    .noOcclusion().isValidSpawn(BrassGeodesBlocks::never).isRedstoneConductor(BrassGeodesBlocks::never)
                    .isSuffocating(BrassGeodesBlocks::never).isViewBlocking(BrassGeodesBlocks::never)));

    

    // Taken from Blocks.java (private function)
    private static boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
        return false;
    }

    // Taken from Blocks.java (private function)
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
