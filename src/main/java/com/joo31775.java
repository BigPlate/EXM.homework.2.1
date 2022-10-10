package com;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class joo31775 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        first_method fm = new first_method();
        fm.helloworld();

        second_method sm = new second_method();
        sm.gameruleset();

        third_method tm = new third_method();
        getServer().getPluginManager().registerEvents(tm, this);

    }

}
