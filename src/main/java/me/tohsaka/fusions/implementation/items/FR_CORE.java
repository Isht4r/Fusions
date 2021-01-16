package me.tohsaka.fusions.implementation.items;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.tohsaka.fusions.Items;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Wither;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.inventory.ItemStack;

public class FR_CORE extends SlimefunItem implements Radioactive, WitherProof {
    public FR_CORE() {
        super(Items.FUSIONS, Items.FR_CORE, RecipeType.PRESSURE_CHAMBER, new ItemStack[] {
                Items.ENRICHED_BLISTERING_INGOT, Items.ENRICHED_BLISTERING_INGOT, Items.ENRICHED_BLISTERING_INGOT,
                Items.ENRICHED_BLISTERING_INGOT, SlimefunItems.ENRICHED_NETHER_ICE, Items.ENRICHED_BLISTERING_INGOT,
                Items.ENRICHED_BLISTERING_INGOT,Items.ENRICHED_BLISTERING_INGOT, Items.ENRICHED_BLISTERING_INGOT
        });
    }

    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.VERY_DEADLY;
    }

    @Override
    public void onAttack(Block block, Wither wither) {
        return;
    }
}
