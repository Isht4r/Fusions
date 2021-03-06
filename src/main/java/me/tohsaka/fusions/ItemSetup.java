package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.tohsaka.fusions.implementation.items.*;
import me.tohsaka.fusions.implementation.machines.FUSIONREACTOR;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

final class ItemSetup {
    static final ItemSetup INSTANCE = new ItemSetup();
    private final ItemStack glass = new ItemStack(Material.GLASS);
    private final SlimefunAddon plugin = Fusions.getInstance();
    private boolean initialised;

    private ItemSetup() {}

    public void init() {
        if (initialised) {
            return;
        }

        initialised = true;

        registerMachines();
        registerItems();
    }

    private void registerMachines() {
        new FR_CORE().register(Fusions.getInstance());
        new FUSIONREACTOR().register(Fusions.getInstance());
        new FR_IO().register(Fusions.getInstance());
        new FR_CASING().register(Fusions.getInstance());
    }

    private void registerItems() {
        new FR_GUIDE().register(Fusions.getInstance());
        new SYNTHETIC_RUBY().register(Fusions.getInstance());
        new ENRICHED_BLISTERING_INGOT().register(Fusions.getInstance());
    }
}
