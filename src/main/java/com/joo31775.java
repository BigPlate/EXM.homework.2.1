package com;
/// test one
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public class joo31775 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().warning("Server started prefectly.");

        first_function first = new first_function(this);
        first.onEnable();

        second_function second = new second_function(this);
        second.onEnable();

        third_function third = new third_function(this);
        getServer().getPluginManager().registerEvents(third, this);

    }
}

class first_function implements Listener {

    private final joo31775 plugin;

    first_function(joo31775 plugin) {
        this.plugin = plugin;
    }

    void onEnable() {
        this.plugin.getLogger().warning("Hello, world!");
    }
}

class second_function implements Listener {

    private final joo31775 plugin;

    second_function(joo31775 plugin) {
        this.plugin = plugin;
    }
    void onEnable() {
        World world = this.plugin.getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
    }


}

class third_function implements Listener {

    private final joo31775 plugin;

    third_function(joo31775 plugin) {
        this.plugin = plugin;
    }
    Listener third_listener = (this);

    void onEnable() {
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));
    }

}
