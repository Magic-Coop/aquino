package me.aquino.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (!(p.hasPermission(""))) {
            p.sendMessage("Sem Permissão");

            }
        if(p.getAllowFlight() == false) {
            p.setAllowFlight(true);
            p.sendMessage("§a§LFLY §fModo de voar §fATIVADO ");
            } else if(p.getAllowFlight() == true) {
            p.setAllowFlight(false);
            p.sendMessage("§a§LFLY §fModo de voar §fDESATIVADO");
            }
        return false;
        }
}

