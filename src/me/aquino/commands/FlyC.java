package me.aquino.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (!(p.hasPermission(""))) {
            p.sendMessage("Sem permissão!");
        }
        if(p.getAllowFlight() == false) {
            p.setAllowFlight(true);
            p.sendMessage("§a§lFLY §fModo voar §2§lATIVADO");
        } else if(p.getAllowFlight() == true) {
            p.setAllowFlight(false);
            p.sendMessage("§a§lFLY §fModo voar §4§lDESATIVADO");
        }
        return false;
    }
}
