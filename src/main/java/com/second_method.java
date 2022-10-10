package com;

import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.event.Listener;

import static org.bukkit.Bukkit.getServer;

public class second_method implements Listener {

    private final joo31775 plugin = null;

    void gameruleset() {
        World world = getServer().getWorld("world");
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

    }

}
