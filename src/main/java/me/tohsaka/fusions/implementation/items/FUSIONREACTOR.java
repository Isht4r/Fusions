package me.tohsaka.fusions.implementation.items;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.tohsaka.fusions.Items;
import org.bukkit.inventory.ItemStack;

public class FUSIONREACTOR extends SlimefunItem {

    ItemStack[] multiBlockRecipe;

    public FUSIONREACTOR() {
        super(Items.FUSIONS, Items.FUSION_REACTOR, RecipeType.MULTIBLOCK, new ItemStack[] {
                Items.FR_CASING, Items.FR_CASING, Items.FR_CASING,
                Items.FR_GLASS, Items.FR_GLASS, Items.FR_GLASS,
                Items.FR_CASING, Items.FR_IO, Items.FR_CASING
        });
    }

    public ItemStack[] page2 = new ItemStack[] {
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_GLASS, Items.FR_CORE, Items.FR_GLASS,
            Items.FR_CASING, Items.FR_CASING, Items.FR_CASING
    };

    public ItemStack[] page3 = new ItemStack[] {
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_CASING, Items.FR_CASING, Items.FR_CASING
    };
}
