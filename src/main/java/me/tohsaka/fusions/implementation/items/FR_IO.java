package me.tohsaka.fusions.implementation.items;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.attributes.WitherProof;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.cscorelib2.data.PersistentDataAPI;
import me.tohsaka.fusions.Fusions;
import me.tohsaka.fusions.Items;
import me.tohsaka.fusions.Utils;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataHolder;
import me.tohsaka.fusions.Utils.*;

import java.awt.image.LookupTable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FR_IO extends SlimefunItem implements WitherProof {
    public static final BlockFace[] Directions = { BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST };

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
        Block clicked = event.getClickedBlock().get();
        Block Core = locateCore(clicked);

        if (Core == null)
            return;
        else if (Fusions.validFRs.contains(clicked.getLocation())) {
            //openinv();
        } else {
            BlockFace direc = null;
            if (Core.getLocation().getBlockX() - clicked.getLocation().getBlockX() == 0)
                if (Core.getLocation().getBlockZ() > clicked.getLocation().getBlockZ())
                    direc = BlockFace.SOUTH;
                else
                    direc = BlockFace.NORTH;

            else if (Core.getLocation().getBlockX() - clicked.getLocation().getBlockX() == 0)
                if (Core.getLocation().getBlockZ() > clicked.getLocation().getBlockZ())
                    direc = BlockFace.EAST;
                else
                    direc = BlockFace.WEST;

            if (BlockStorage.check(clicked.getRelative(direc, 1), "FR_CASING")) {
                //Fusions.getMcServer().broadcastMessage("found Case");
                if (BlockStorage.check(clicked.getRelative(direc, 2), "FR_CASING")) {
                    //Fusions.getMcServer().broadcastMessage("found Case");

                    BlockFace newdirec1 = Utils.getNextDirection(direc, 1);
                    if (BlockStorage.check(clicked.getRelative(newdirec1, 1), "FR_CASING")) {
                        //Fusions.getMcServer().broadcastMessage("found Case");
                        if (BlockStorage.check(clicked.getRelative(newdirec1, 1).getRelative(direc, 1), "FR_CASING")) {
                            //Fusions.getMcServer().broadcastMessage("found Case");
                            if (BlockStorage.check(clicked.getRelative(newdirec1, 1).getRelative(direc, 2), "FR_CASING")) {
                                //Fusions.getMcServer().broadcastMessage("found Case");

                                BlockFace newdirec2 = Utils.getNextDirection(direc, 3);
                                if (BlockStorage.check(clicked.getRelative(newdirec2, 1), "FR_CASING")) {
                                    //Fusions.getMcServer().broadcastMessage("found Case");
                                    if (BlockStorage.check(clicked.getRelative(newdirec2, 1).getRelative(direc, 1), "FR_CASING")) {
                                        //Fusions.getMcServer().broadcastMessage("found Case");
                                        if (BlockStorage.check(clicked.getRelative(newdirec2, 1).getRelative(direc, 2), "FR_CASING")) {
                                            //Fusions.getMcServer().broadcastMessage("found Case");


                                            //layer2
                                            if (BlockStorage.check(clicked.getRelative(0 , 1, 0), "FR_GLASS")) {
                                                //Fusions.getMcServer().broadcastMessage("found Case");
                                                if (BlockStorage.check(clicked.getRelative(0, 1, 0).getRelative(direc, 3), "FR_GLASS")) {
                                                    //Fusions.getMcServer().broadcastMessage("found Case");
                                                    Block b = clicked.getRelative(0, 1,0);
                                                    BlockFace newdirec3 = Utils.getNextDirection(direc, 1);
                                                    if (BlockStorage.check(b.getRelative(newdirec1, 1), "FR_CASING")) {
                                                        //Fusions.getMcServer().broadcastMessage("found Case");
                                                        if (BlockStorage.check(b.getRelative(newdirec1, 1).getRelative(direc, 1), "FR_CASING")) {
                                                            //Fusions.getMcServer().broadcastMessage("found Case");
                                                            if (BlockStorage.check(b.getRelative(newdirec1, 1).getRelative(direc, 2), "FR_CASING")) {
                                                                //Fusions.getMcServer().broadcastMessage("found Case");

                                                                BlockFace newdirec4 = Utils.getNextDirection(direc, 3);
                                                                if (BlockStorage.check(b.getRelative(newdirec2, 1), "FR_CASING")) {
                                                                    //Fusions.getMcServer().broadcastMessage("found Case");
                                                                    if (BlockStorage.check(b.getRelative(newdirec2, 1).getRelative(direc, 1), "FR_CASING")) {
                                                                        //Fusions.getMcServer().broadcastMessage("found Case");
                                                                        if (BlockStorage.check(b.getRelative(newdirec2, 1).getRelative(direc, 2), "FR_CASING")) {
                                                                            //Fusions.getMcServer().broadcastMessage("found Case");


                                                                            //layer 3 oof
                                                                            if (BlockStorage.check(clicked.getRelative(0 , 1, 0), "FR_GLASS")) {
                                                                                //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                if (BlockStorage.check(clicked.getRelative(0, 1, 0).getRelative(direc, 3), "FR_GLASS")) {
                                                                                    //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                    Block b1 = clicked.getRelative(0, 1,0);
                                                                                    BlockFace newdirec5 = Utils.getNextDirection(direc, 1);
                                                                                    if (BlockStorage.check(b1.getRelative(newdirec1, 1), "FR_CASING")) {
                                                                                        //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                        if (BlockStorage.check(b1.getRelative(newdirec1, 1).getRelative(direc, 1), "FR_CASING")) {
                                                                                            //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                            if (BlockStorage.check(b1.getRelative(newdirec1, 1).getRelative(direc, 2), "FR_CASING")) {
                                                                                                //Fusions.getMcServer().broadcastMessage("found Case");

                                                                                                BlockFace newdirec6 = Utils.getNextDirection(direc, 3);
                                                                                                if (BlockStorage.check(b1.getRelative(newdirec2, 1), "FR_CASING")) {
                                                                                                    //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                                    if (BlockStorage.check(b1.getRelative(newdirec2, 1).getRelative(direc, 1), "FR_CASING")) {
                                                                                                        //Fusions.getMcServer().broadcastMessage("found Case");
                                                                                                        if (BlockStorage.check(b1.getRelative(newdirec2, 1).getRelative(direc, 2), "FR_CASING")) {
                                                                                                            //Fusions.getMcServer().broadcastMessage("found Case");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
//Fusions.validFRs.add(clicked.getLocation());
    @Override
    public void onAttack(Block block, Wither wither) {
        return;
    }

    private Block locateCore(Block b) {
        Block block = null;

        if (b.getRelative(1, 1, 0).getType() == Material.CONDUIT) block = b.getRelative(1, 1, 0);
        else if (b.getRelative(0, 1, 1).getType() == Material.CONDUIT) block = b.getRelative(0, 1, 1);
        else if (b.getRelative(-1, 1, 0).getType() == Material.CONDUIT) block = b.getRelative(-1, 1, 0);
        else if (b.getRelative(0, 1, -1).getType() == Material.CONDUIT) block = b.getRelative(0, 1, -1);

        else if (b.getRelative(2, 1, 0).getType() == Material.CONDUIT) block = b.getRelative(2, 1, 0);
        else if (b.getRelative(0, 1, 2).getType() == Material.CONDUIT) block = b.getRelative(0, 1, 2);
        else if (b.getRelative(-2, 1, 0).getType() == Material.CONDUIT) block = b.getRelative(-2, 1, 0);
        else if (b.getRelative(0, 1, -2).getType() == Material.CONDUIT) block = b.getRelative(0, 1, -2);

        return block;
    }

    private void save(Location l) {
        Fusions.validFRs.add(l);
    }

    private void fr_open(Player p) {
        p.openInventory(Fusions.FR_inv);
    }
}
