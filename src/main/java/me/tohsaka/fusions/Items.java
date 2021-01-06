package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.categories.FlexCategory;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideLayout;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public final class Items {

    public static final FlexCategory FUSIONS = new FlexCategory(new NamespacedKey(Fusions.getInstance(), "FUSIONS_CATEGORY"), CATEGORY_ITEM_()) {
        @Override
        public boolean isVisible(Player player, PlayerProfile playerProfile, SlimefunGuideLayout slimefunGuideLayout) {
            return true;
        }

        @Override
        public void open(Player player, PlayerProfile playerProfile, SlimefunGuideLayout slimefunGuideLayout) {

        }
    };

    public static final SlimefunItemStack FR_CORE = new SlimefunItemStack(
            "FR_CORE",
            Material.CONDUIT,
            "&cFusion Reactor Core",
            "",
            "&7Heart of the &6Fusion Reactor",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_DEADLY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED
    );

    public static final SlimefunItemStack FUSION_REACTOR = new SlimefunItemStack(
            "FUSION_REACTOR",
            Material.NETHERITE_BLOCK,
            "&6Fusion Reactor",
            "",
            "&fRequires Cooling!",
            "&b> Must be waterlogged",
            "&b> Must be supplied with Reactor Coolant Cells",
            "",
            LoreBuilder.powerBuffer(524288),
            LoreBuilder.powerPerSecond(32696)
    );

    public static final SlimefunItemStack ENRICHED_BLISTERING_INGOT = new SlimefunItemStack(
            "ENRICHED_BLISTERING_INGOT",
            new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJhOTlkMDc0OWIzOGM0NGJjMTU5ZTRjNzEwZGRmNGU2MWNlYzEyNGM2NjllODk1MTBlN2I2NGNiOWQ0YjI0NyJ9fX0=")),
            "&6Enriched Blistering Ingot",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_DEADLY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED
    );

    public static final SlimefunItemStack FR_CASING = new SlimefunItemStack(
            "FR_CASING",
            Material.NETHERITE_BLOCK,
            "&bFusion Reactor Casing",
            "",
            "&7Surrounds the &cFusion Reactor Core",
            "&7Wither-proof"
    );

    public static final SlimefunItemStack FR_GLASS = new SlimefunItemStack(
            "FR_GLASS",
            Material.NETHERITE_BLOCK,
            "&bFusion Reactor Glass",
            "",
            "&7Surrounds the &cFusion Reactor Core",
            "&7Wither-proof"
    );

    public static final SlimefunItemStack FR_IO = new SlimefunItemStack(
            "FR_IO",
            Material.DISPENSER,
            "&3Fusion Reactor I/O",
            "",
            "&fAllows you to interact with the Fusion Reactor"
    );

    public static final SlimefunItemStack SYNTHETIC_RUBY = new SlimefunItemStack(
            "SYNTHETIC_RUBY",
            Material.REDSTONE_BLOCK,
            "&bSynthetic Ruby",
            ""
    );

    public static ItemStack CATEGORY_ITEM_() {
        ItemStack CATEGORY_ITEM = new ItemStack(Material.ANCIENT_DEBRIS);
        ItemMeta meta = CATEGORY_ITEM.getItemMeta();
        meta.setLore(null);
        List<String> lore = meta.getLore();
        lore = null;
        lore.add(0,"");
        lore.add(1,"\n&a> Click to open");
        meta.setLore(lore);
        meta.setDisplayName("&9Fusions");
        CATEGORY_ITEM.setItemMeta(meta);
        return CATEGORY_ITEM;
    }
}
