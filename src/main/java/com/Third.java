package com;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Third extends JavaPlugin implements Listener {

    public void setting(){
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event){
        event.getPlayer().sendActionBar(Component.text("Welcome", (NamedTextColor.BLUE)));
        }



}
