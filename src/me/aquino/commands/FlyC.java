package me.aquino.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        p.hasPermission("aquino.fly");
        p.sendMessage("§d§lSem permissão!");

        if (p.getAllowFlight() == false) {
            p.setAllowFlight(true);
            p.sendMessage("§c§lModo voo ativado");

        }else if (p.getAllowFlight() == true) {
         p.setAllowFlight(false);
         p.sendMessage("§c§lModo voo desativado");
        }
        return false;
    }
}