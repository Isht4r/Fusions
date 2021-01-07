package me.tohsaka.fusions.implementation.items;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.tohsaka.fusions.Items;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FUSIONREACTOR extends SlimefunItem {

    ItemStack[] multiBlockRecipe;

    public FUSIONREACTOR() {
        super(Items.FUSIONS, Items.FUSION_REACTOR, RecipeType.MULTIBLOCK, new ItemStack[] {
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), Items.HINT, new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR)
                }
        );
    }
}
