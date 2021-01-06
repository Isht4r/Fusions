package me.tohsaka.fusions.implementation.items;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.tohsaka.fusions.Items;
import org.bukkit.block.Block;
import org.bukkit.entity.Wither;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.inventory.ItemStack;

public class FR_IO extends SlimefunItem implements WitherProof {
    public FR_IO() {
        super(Items.FUSIONS, Items.FR_IO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.CARGO_MOTOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.CARGO_MANAGER,
                Items.FR_CASING, SlimefunItems.COOLING_UNIT, Items.FR_CASING,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR
        });
    }

    @Override
    public void preRegister() {
        BlockUseHandler blockUseHandler = this::onBlockRightClick;
        addItemHandler(blockUseHandler);
    }

    private void onBlockRightClick(PlayerRightClickEvent event) {
        boolean comp = true;
        if (comp) {

        }
        else {
            event.getPlayer().sendMessage("These blocks are missing: ");
            event.cancel();
        }
    }

    private void OnExplosion(BlockExplodeEvent e) {
        e.setCancelled(true);
    }

    @Override
    public void onAttack(Block block, Wither wither) {
        return;
    }
}
