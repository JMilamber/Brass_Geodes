package BrassAmber.com.brass_geodes.client;

import BrassAmber.com.brass_geodes.BrassGeodesBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BGBlockRender {

    public static void setRenderLayers() {
        RenderType rendertype = RenderType.cutout();
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_DIAMOND.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_DIAMOND.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_DIAMOND.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_DIAMOND.get(), rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_EMERALD.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_EMERALD.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_EMERALD.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_EMERALD.get(), rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_RUBY.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_RUBY.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_RUBY.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_RUBY.get(), rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_SAPPHIRE.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_SAPPHIRE.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_SAPPHIRE.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_SAPPHIRE.get(), rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SMALL_TOPAZ.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.MEDIUM_TOPAZ.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.LARGE_TOPAZ.get(), rendertype);
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.C_TOPAZ.get(), rendertype);

        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.TOPAZ_TINTED.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.SAPPHIRE_TINTED.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.RUBY_TINTED.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.EMERALD_TINTED.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BrassGeodesBlocks.DIAMOND_TINTED.get(), RenderType.translucent());
    }
    
}
