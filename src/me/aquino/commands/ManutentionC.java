package me.aquino.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class ManutentionC implements Listener, CommandExecutor {

    public static boolean manutencao = false;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {
        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("manutencao")) {
            if(p.isOp()) {
                if(args.length == 0) {
                    p.sendMessage("§d§lMANUTENCAO §F➜ §cCalma! Use isto de forma correta, use: §f/manuntecao <on || off>");
                    return true;
                }
                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("on")) {
                        if((manutencao)) {
                            p.sendMessage("§d§lMANUTENÇÃO §F➜ §cA manutenção do §d§lLOBBY §cjá está ativada!");
                            return true;
                        } else {
                            Bukkit.broadcastMessage("§6§lLion§c§lMC §F➜ §aA manuntenção do lobby foi ativada, todos os jogadores serão kickados em 5s.");
                            manutencao = true;
                            p.sendMessage("§d§lMANUTENCAO §F➜ §aManutenção ativada!");
                            for(Player todos : Bukkit.getOnlinePlayers()) {
                                if(!(sender.isOp())) {
                                    todos.kickPlayer("§6§lAquino§c§lMC" + "\n" + "   §cO servidor §d§lLOBBY §cacaba de entrar em manunteção!" + "\n" + "§aVoltamos já! Estamos fazendo tudo o mais rápido possível." + "\n" + "\n" + "§ewww.lionmc.com.br" + "\n" + "§dAtenciosamente Equipe §6§lLion§c§lMC§d.");
                                    return true;
                                }
                            }
                            return true;
                        }
                    } else if(args[0].equalsIgnoreCase("off")) {
                        if(!(manutencao)) {
                            p.sendMessage("§d§lMANUTENÇÃO §F➜ §aA manutenção neste servidor já está desativada!");
                            return true;
                        } else {
                            Bukkit.broadcastMessage("§6§lLion§c§lMC §F➜ §aA manuntenção do lobby foi desativada, agora todos podem entrar!");
                            p.sendMessage("§d§lMANUTENCAO §F➜ §aManutenção desativada.");
                            manutencao = false;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @EventHandler
    public void onJoin(PlayerLoginEvent e) {
        Player p = e.getPlayer();
        if((manutencao) && (!p.isOp())) {
            e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§6§lLion§c§lMC" + "\n" + "   §cDesculpe, estamos temporariamente em manutenção!" + "\n" + "§aVoltamos já! Estamos fazendo tudo o mais rápido possível." + "\n" + "\n" + "§ewww.lionmc.com.br");
        }
    }

}
