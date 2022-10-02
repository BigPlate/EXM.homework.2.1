package com;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.*;


public class joo31775 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getLogger().warning("Server started perfectly.");
        
        first_method fm = new first_method();
        fm.helloworld();

        second_method sm = new second_method();
        sm.gameruleset();

        third_method tm = new third_method();
        getServer().getPluginManager().registerEvents(tm, this);
        // tm.hellomessage();


    }


}

class first_method implements Listener {

    private final joo31775 plugin = null;

    void helloworld() {
        getLogger().warning("Server started!");
    }

}

class second_method implements Listener {

    private final joo31775 plugin = null;

    void gameruleset() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
        // getLogger().warning("gamerule set.");
    }
}

class third_method implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendActionBar(Component.text("Welcome",(NamedTextColor.BLUE)));
        // getLogger().warning("player joined.");
    }


}
