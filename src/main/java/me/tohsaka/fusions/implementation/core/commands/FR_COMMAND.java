package me.tohsaka.fusions.implementation.core.commands;

import io.github.thebusybiscuit.slimefun4.core.commands.SubCommand;
import me.tohsaka.fusions.Items;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Map;

public class FR_COMMAND implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player p = (Player)sender;
        if (args.length > 0) {
            if(args[0].toLowerCase()== "guide")
                p.getInventory().addItem(Items.FR_GUIDE);
        }
        return true;
    }
}
