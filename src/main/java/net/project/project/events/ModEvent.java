package net.project.project.events;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;
import net.project.project.Project;
import net.project.project.command.HomeCommand;
import net.project.project.command.SethomeCommand;

@Mod.EventBusSubscriber(modid = Project.MOD_ID)
public class ModEvent {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new SethomeCommand(event.getDispatcher());
        new HomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getOriginal().getEntityWorld().isRemote()) {
            event.getPlayer().getPersistentData().putIntArray(Project.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(Project.MOD_ID + "homepos"));
        }
    }

}
