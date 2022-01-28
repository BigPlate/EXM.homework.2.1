package com;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.GameRule;

public class Second extends JavaPlugin {

    public void second() {
        World world = getServer().getWorld("world");
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);
    }

}
