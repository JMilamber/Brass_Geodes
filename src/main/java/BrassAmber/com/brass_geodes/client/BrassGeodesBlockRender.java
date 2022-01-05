package BrassAmber.com.brass_geodes.client;

import BrassAmber.com.brass_geodes.block.BrassGeodesBlocks;
import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class BrassGeodesBlockRender {

    public static void setRenderLayers() {
        RenderType rendertype = RenderType.cutout();
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_DIAMOND, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_DIAMOND, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_DIAMOND, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_DIAMOND, rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_EMERALD, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_EMERALD, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_EMERALD, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_EMERALD, rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_RUBY, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_RUBY, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_RUBY, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_RUBY, rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_SAPPHIRE, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_SAPPHIRE, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_SAPPHIRE, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_SAPPHIRE, rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_TOPAZ, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_TOPAZ, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_TOPAZ, rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_TOPAZ, rendertype);
    }
    
}
