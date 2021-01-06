package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.tohsaka.fusions.implementation.items.FR_CORE;
import me.tohsaka.fusions.implementation.items.FR_IO;
import me.tohsaka.fusions.implementation.items.FUSIONREACTOR;
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
    }

    private void registerMachines() {
        new FR_CORE().register(Fusions.getInstance());
        new FUSIONREACTOR().register(Fusions.getInstance());
        new FR_IO().register(Fusions.getInstance());
    }
}
