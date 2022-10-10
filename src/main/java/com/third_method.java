package com;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class third_method implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));
    }

}