package dev.mruniverse.dragoncrystal;

import dev.mruniverse.dragoncrystal.listeners.CrystalExplode;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class DragonCrystal extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CrystalExplode(),this);
        getServer().getConsoleSender().sendMessage(color("&e[Dragon Crystal] &fCreated by &bMrUniverse44&f. &aENABLED"));
    }

    public String color(String msg) {
        return ChatColor.translateAlternateColorCodes('&',msg);
    }
}
