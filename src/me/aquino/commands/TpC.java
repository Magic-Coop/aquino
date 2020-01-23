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
            if (t == null) {
                p.sendMessage("§cEsse jogar está offline ou inexistente");
                return true;
            }
            p.teleport(t);
            p.sendMessage("§cFoi levado ao jogador" + t.getName() + "§f!");
        }
        if (label.equalsIgnoreCase("tphere")) {
            if (!p.hasPermission("tp.use")) {
                p.sendMessage("§cSem permissão");
                return true;
            }
            if (args.length == 0) {
                p.sendMessage("§cUse /tphere <jogador>");
                return true;
            }
            Player t = Bukkit.getPlayer(args[0]);
            if (t == p) {
                p.sendMessage("§cVocê não pode puxar você mesmo");
                return true;
            }
            if (t == null) {
                p.sendMessage("§cEste jogador está offline");
                return true;
            }
            t.teleport(p);
            p.sendMessage("[tphere] §c Você puxou o jogador" + t.getName() + "§f'.");
            t.sendMessage("[tphere] §c Você foi puxado por'" + p.getName() + "§f'.");
            }
        if(label.equalsIgnoreCase("tpall")) {
            if(!p.hasPermission("tp.use")) {
                p.sendMessage("§cSem permissão!");
                return true;
            }
            for (Player o : Bukkit.getOnlinePlayers())
                o.teleport(p);
            p.sendMessage("[§aTpALL] §fTodos os jogadores foram puxados até '" + p.getName() + "§f'.");

        }
        return false;
        }
    }