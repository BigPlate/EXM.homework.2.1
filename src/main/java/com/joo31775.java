package com;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public class joo31775 extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().warning("Server started.");

        first_function first = new first_function(); // An error occurred that starts from here.
        first.onEnable();


        getLogger().info("Nice try!"); // check point
    }
}

class first_function implements Listener {
    void onEnable() {
        String ababa = "1";
    }
}