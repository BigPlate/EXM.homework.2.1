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


public final class joo31775 extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("server started.");
    }
    First ban1 = new First();

}


class First extends JavaPlugin{
    public void onEnable() {
        getLogger().warning("Hello, World!");
    }
}


class Second extends JavaPlugin {
    public void onEnable() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
    }
}


class Third extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this); // using listener
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));
    }
}


