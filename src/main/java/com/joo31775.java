package com;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import org.bukkit.event.EventHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class joo31775 extends JavaPlugin {
    first_class fc = new first_class();
    public static first_class instance;
    public static first_class getInstance() { return instance; }

}

class first_class extends JavaPlugin{
    public void onEnable() {
        getLogger().warning("Hello, World!");
    }
}


class second_class extends JavaPlugin {
    public void onEnable() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
    }
}


class third_class extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this); // using listener
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));
    }
}