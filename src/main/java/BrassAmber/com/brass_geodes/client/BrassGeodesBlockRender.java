package BrassAmber.com.brass_geodes.client;

import BrassAmber.com.brass_geodes.BrassGeodesBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

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
