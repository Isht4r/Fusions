package me.tohsaka.fusions.setup;

import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.categories.FlexCategory;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideLayout;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.Category;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;

import java.util.ArrayList;
import java.util.List;

public class FUSIONS_CATEGORY extends FlexCategory {

    public final List<Category> categories = new ArrayList<>();

    public FUSIONS_CATEGORY(NamespacedKey key, ItemStack item, int tier) {
        super(key, item, tier);
    }

    @Override
    public boolean isVisible(Player p, PlayerProfile profile, SlimefunGuideLayout layout) {
        return layout == SlimefunGuideLayout.CHEST;
    }

    @Override
    public void open(Player p, PlayerProfile profile, SlimefunGuideLayout layout) {
        ChestMenu menu = new ChestMenu(getUnlocalizedName());
        menu.setEmptySlotsClickable(false);

        for (int i = 0 ; i < 9 ; i ++) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        menu.addItem(1, ChestMenuUtils.getBackButton(p, "", ChatColor.GRAY + SlimefunPlugin.getLocalization().getMessage(p, "guide.back.guide")));
        menu.addMenuClickHandler(1, (pl, s, is, action) -> {
            SlimefunGuide.openMainMenu(profile, layout, 1);
            return false;
        });

        for (int i = 0 ; i < this.categories.size() ; i++) {
            Category category = this.categories.get(i);
            menu.addItem(i + 9, category.getItem(p), (pl, s, is, action) -> {
                SlimefunGuide.openCategory(profile, category, layout, 1);
                return false;
            });
        }


        for (int i = 45 ; i < 54 ; i ++) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        p.playSound(p.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1, 1);
        profile.getGuideHistory().add(this, 1);

        menu.open(p);
    }
}
