package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Fusions extends JavaPlugin implements SlimefunAddon{
    public static Inventory inv = Fusions.getInstance().getServer().createInventory(null,54, "&0Fusion Reactor Guide");
    private static Fusions instance;

    @Override
    public void onEnable() {
        instance = this;

        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update")) {

        }

        editInventory(inv);

        ItemSetup.INSTANCE.init();

        getServer().getPluginManager().registerEvents(new Events(), this);
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

    public static void editInventory(Inventory i) {
        i.setItem(17, Items.P1);
        i.setItem(14, Items.P2);
        i.setItem(11, Items.P3);
        i.setContents(Items.PAGE1);
        i.setContents(Items.PAGE2);
        i.setContents(Items.PAGE3);

    }
}
