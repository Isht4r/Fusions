package me.tohsaka.fusions.implementation.items;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.tohsaka.fusions.Items;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Wither;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.inventory.ItemStack;

public class FR_CASING extends SlimefunItem implements WitherProof {

    public FR_CASING() {
        super(Items.FUSIONS, Items.FR_CASING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.REINFORCED_PLATE, Items.SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE,
                Items.SYNTHETIC_RUBY, SlimefunItems.GOLD_24K_BLOCK, Items.SYNTHETIC_RUBY,
                SlimefunItems.REINFORCED_PLATE, Items.SYNTHETIC_RUBY, SlimefunItems.REINFORCED_PLATE,
        });
    }

    private void OnExplosion(BlockExplodeEvent e) {
        e.setCancelled(true);
    }

    @Override
    public void onAttack(Block block, Wither wither) {
        return;
    }
}
