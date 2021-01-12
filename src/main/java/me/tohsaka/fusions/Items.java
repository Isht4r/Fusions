package me.tohsaka.fusions;

import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.categories.FlexCategory;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideLayout;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.Slimefun;
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

    public static final Category FUSIONS = new Category(new NamespacedKey(Fusions.getInstance(),
            "FUSIONS_CATEGORY"),
            CATEGORY_ITEM_()) {
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
            "&43x3x3 Multiblock recipe! See /fr guide",
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

    public static final SlimefunItemStack HINT = new SlimefunItemStack(
            "FR_HINT_3X3X3",
            Material.PAPER,
            "&43x3x3 Multiblock recipe!",
            "",
            "&cSee /fr guid for the recipe!"
            );

    public static final ItemStack CATEGORY_ITEM_() {
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

    public static final ItemStack[] PAGE2 = new ItemStack[] {
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_GLASS, Items.FR_CORE, Items.FR_GLASS,
            Items.FR_CASING, Items.FR_CASING, Items.FR_CASING
    };

    public static final ItemStack[] PAGE3 = new ItemStack[] {
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_CASING, Items.FR_GLASS, Items.FR_CASING,
            Items.FR_CASING, Items.FR_CASING, Items.FR_CASING
    };

    public static final ItemStack[] PAGE1 = new ItemStack[] {
            Items.FR_CASING, Items.FR_CASING, Items.FR_CASING,
            Items.FR_GLASS, Items.FR_GLASS, Items.FR_GLASS,
            Items.FR_CASING, Items.FR_IO, Items.FR_CASING
    };


    public static final SlimefunItemStack FR_GUIDE = new SlimefunItemStack(
            "FR_GUIDE",
            Material.WRITTEN_BOOK,
            "",
            "",
            "&eRight Click &c&o&8\u21E8 &7See Fusion Reactor recipe"
    );

    public static final SlimefunItemStack FR_TRITIUM = new SlimefunItemStack(
            "FR_TRITIUM",
            Material.LIGHT_BLUE_DYE,
            "&1Tritium",
            "",
            "&7Fuel for Fusion Reactor"
    );

    public static final SlimefunItemStack FR_DEUTERIUM = new SlimefunItemStack(
            "FR_DEUTERIUM",
            Material.LIGHT_BLUE_DYE,
            "&9Deuterium",
            "",
            "&7Fuel for Fusion Reactor"
    );

    public static final SlimefunItemStack FR_HYDROGEN = new SlimefunItemStack(
            "FR_HYDROGEN",
            Material.LIGHT_BLUE_DYE,
            "&bHydrogen",
            "",
            "&7Fuel for Fusion Reactor"
    );

    public static final SlimefunItemStack P1 = new SlimefunItemStack(
            "P1_",
            Material.PAPER,
            "&bFront Side"
    );

    public static final SlimefunItemStack P2 = new SlimefunItemStack(
            "P2_",
            Material.PAPER,
            "&bMiddle Side"
    );

    public static final SlimefunItemStack P3 = new SlimefunItemStack(
            "P3_",
            Material.PAPER,
            "&bBack Side"
    );

    private Items() {}
}
