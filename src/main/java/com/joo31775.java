package com;

import net.kyori.adventure.text.Component;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;




public class joo31775 extends JavaPlugin implements Listener {

    public void onEnable() {
        getLogger().warning("Server started");

        getLogger().info("a"); // check point 1

        testing test = new testing(); // An error occurred that starts from here.
        test.onEnable();

        getLogger().info("b"); // check point 2

        first_class_one aaaa = new first_class_one();
        aaaa.onEnable();

        getLogger().info("c"); // check point 3
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("content",(NamedTextColor.BLUE)));
    }

}

class testing extends JavaPlugin {
    public void onEnable() {
        getLogger().warning("Hello!");
    }
}