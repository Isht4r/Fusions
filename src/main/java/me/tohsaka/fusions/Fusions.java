package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Fusions extends JavaPlugin implements SlimefunAddon{

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {

        }

        ItemStack categoryItem = new CustomItem(Material.DIAMOND, "&4Addon Category", "", "&a> Click to open");

        // Give your Category a unique id.
        NamespacedKey categoryId = new NamespacedKey(this, "addon_category");
        Category category = new Category(categoryId, categoryItem);

        // Create a new Slimefun ItemStack
        // This class has many constructors, it is very important that you give each item a unique id.
        SlimefunItemStack slimefunItem = new SlimefunItemStack("COOL_DIAMOND", Material.DIAMOND, "&4Cool Diamond", "&c+20% Coolness");

        // The Recipe is an ItemStack Array with a length of 9.
        // It represents a Shaped Recipe in a 3x3 crafting grid
        // The machine in which this recipe is crafted in is specified further down
        ItemStack[] recipe = { new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.DIAMOND), null, new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        // Now you just have to register the item
        // RecipeType.ENHANCED_CRAFTING_TABLE refers to the machine in which this item is crafted in.
        // Recipy Types from Slimefun itself will automatically add the recipe to that machine
        SlimefunItem item = new SlimefunItem(category, slimefunItem, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        item.register(this);
    }

    @Override
    public void onDisable() {

    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
