package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Fusions extends JavaPlugin implements SlimefunAddon{

    private static Fusions instance;

    @Override
    public void onEnable() {
        instance = this;

        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update")) {

        }
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static Fusions getInstance() {
        return instance;
    }

    public static FileConfiguration getCfg() {
        return instance.getConfig();
    }
}
