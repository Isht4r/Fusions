package me.tohsaka.fusions.implementation.machines;

import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import me.tohsaka.fusions.Fusions;
import me.tohsaka.fusions.Items;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FUSIONREACTOR extends AGenerator implements EnergyNetProvider, NotPlaceable {


    ItemStack[] multiBlockRecipe;

    public FUSIONREACTOR() {
        super(Items.FUSIONS, Items.FUSION_REACTOR, RecipeType.MULTIBLOCK, new ItemStack[] {
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), Items.HINT, new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR)
                }
        );
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(Fusions.getCfg().getInt("fr.fuel.tritium.last"), Items.FR_TRITIUM));
        registerFuel(new MachineFuel(Fusions.getCfg().getInt("fr.fuel.deuterium.last"), Items.FR_DEUTERIUM));
        registerFuel(new MachineFuel(Fusions.getCfg().getInt("fr.fuel.hydrogen.last"), Items.FR_HYDROGEN));
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHERITE_HELMET);
    }

    @Override
    public String getInventoryTitle() {
        return "&9Fusion Reactor";
    }

    @Override
    public int getEnergyProduction() {
        return Fusions.getCfg().getInt("fr.energy.out");
    }

    @Override
    public int getCapacity() {
        return Fusions.getCfg().getInt("fr.energy.max-storage");
    }
}
