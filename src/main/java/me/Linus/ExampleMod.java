package me.Linus;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "Fullscreen";
    public static final String VERSION = "1.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }


@SubscribeEvent
public void onChat(ClientChatReceivedEvent event) {
    String message = event.message.getUnformattedText();
        if(message.contains("fullscreen")) {
                 Minecraft.getMinecraft().toggleFullscreen();
        }
}
}
