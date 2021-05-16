package moretorches;

import moretorches.block.BlockRegistry;
import moretorches.item.ItemRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moretorches")
public class MoreTorches
{
    public static final String MOD_ID = "moretorches";

    public MoreTorches()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::setup);
        modBus.addListener(this::doClientStuff);
        ItemRegistry.ITEMS.register(modBus);
        BlockRegistry.BLOCKS.register(modBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void doClientStuff(final FMLClientSetupEvent event)
    {
        RenderTypeLookup.setRenderLayer(BlockRegistry.lecterntorch.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.talltorch.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockRegistry.sconce.get(), RenderType.translucent());
    }

}