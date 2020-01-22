package me.aquino.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("tp")) {
            if (!p.hasPermission("tp.use")) {
                p.sendMessage("§a§LSem Permissão");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§cUse /tp <jogado>");
                return true;
            }
            Player t = Bukkit.getPlayer(args[0]);
            if (t == p) {
                p.sendMessage("§cVocê não pode dar tp em voce mesmo!");
                return true;
            }
             if(t == null) {
                 p.sendMessage("§cEsse jogar está offline ou inexistente");
                 return true;
             }
              p.teleport(t);
              p.sendMessage("§cFoi levado ao jogador" + t.getName() + "§f!");
        }
        return false;
    }
}