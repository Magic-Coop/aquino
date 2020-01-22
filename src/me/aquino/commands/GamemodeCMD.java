package me.aquino.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 0) {
                if (p.getGameMode() == GameMode.CREATIVE) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lSURVIVAL§a!");
                } else {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lCRIATIVO§a!");
                }
            } else if (args.length == 1) {
                String gm = args[0];
                if (gm.equals("1")) {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lCRIATIVO§a!");
                }
                if (gm.equals("0")) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lSURVIVAL§a!");
                }
                if (gm.equals("2")) {
                    p.setGameMode(GameMode.ADVENTURE);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lADVENTURE§a!");
                }
                if (gm.equals("3")) {
                    p.setGameMode(GameMode.SPECTATOR);
                    p.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lSPECTATOR§a!");
                }
            } else {
                Player j = Bukkit.getPlayer(args[1]);
                String gm = args[0];
                if (j == null) {
                    p.sendMessage("§cJogador offline ou inexistente!");
                    return true;
                }
                if (gm.equals("1")) {
                    j.setGameMode(GameMode.CREATIVE);
                    j.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lCRIATIVO§a. Pelo jogador §e" + p.getName() + "§a!");
                    p.sendMessage("§a§lGM §aVocê alterou o modo de jogo do jogador §e" + j.getName() + " §apara CRIATIVO!");
                }
                if (gm.equals("0")) {
                    j.setGameMode(GameMode.SURVIVAL);
                    j.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lCRIATIVO§a. Pelo jogador §e" + p.getName() + "§a!");
                    p.sendMessage("§a§lGM §aVocê alterou o modo de jogo do jogador §e" + j.getName() + " §apara CRIATIVO!");
                }
                if(gm.equals("2")) {
                    j.setGameMode(GameMode.ADVENTURE);
                    j.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lADVENTURE§a. Pelo jogador §e" + p.getName() + "§a!");
                    p.sendMessage("§a§lGM §aVocê alterou o modo de jogo do jogador §e" + j.getName() + " §apara ADVENTURE!");
                }
                if(gm.equals("3")) {
                    j.setGameMode(GameMode.SPECTATOR);
                    j.sendMessage("§a§lGM §aSeu modo de jogo foi alterado para §a§lSPECTATOR§a. Pelo jogador §e" + p.getName() + "§a!");
                    p.sendMessage("§a§lGM §aVocê alterou o modo de jogo do jogador §e" + j.getName() + " §apara SPECTATOR!");

                }

            }
        }
        return false;
    }

}
