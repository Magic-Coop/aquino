package me.aquino.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TagC implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("tag")) {
            if (args.length == 0) {
                p.sendMessage("§aUse §f/tag <tag> §a para alterar sua tag!");
                if (p.isOp() == true) {
                    p.sendMessage("§aVocê possui as tags: §4§l§oDONO§f, §c§l§oGERENTE§f, §5§l§oMODERADOR§f, §5§l§oTRIAL§f, §b§lYOUTUBER§f, §6§lVIP§f, §7§lMEMBRO.");
                } else if (p.hasPermission("group.gerente")) {
                    p.sendMessage("§aVocê possui as tags: §c§l§oGERENTE§f, §5§l§oMODERADOR§f, §5§l§oTRIAL§f, §b§lYOUTUBER§f, §6§lVIP§f, §7§lMEMBRO.");
                }
                return true;
            }
            if (p.getName().equals("FireManBaby_")) {
                if (args[0].equalsIgnoreCase("ceo")) {
                    p.sendMessage("§fSua tag foi alterada para §4§lCEO§f.");
                    p.setDisplayName("§4§l§oCEO §4" + p.getName());
                    p.setPlayerListName("§4§l§oCEO §4" + p.getName());

                } else if (p.hasPermission("group.dono")) {
                    if (args[0].equalsIgnoreCase("dono")) {
                        p.sendMessage("§fSua tag foi alterada para §4§l§oDONO§f.");
                        p.setDisplayName("§4§l§oDONO §4" + p.getName());
                        p.setPlayerListName("§4§l§oDONO §4" + p.getName());

                    } else if (p.hasPermission("group.gerente")) {
                        if (args[0].equalsIgnoreCase("gerente")) {
                            p.sendMessage("§fSua tag foi alterada para §c§l§oGERENTE§f.");
                            p.setDisplayName("§c§l§oGERENTE §c" + p.getName());
                            p.setPlayerListName("§c§l§oGERENTE §c" + p.getName());

                        } else if (p.hasPermission("group.mod")) {
                            if (args[0].equalsIgnoreCase("moderador")) {
                                p.sendMessage("§fSua tag foi alterada para §5§l§oMODERADOR§f.");
                                p.setDisplayName("§5§l§oMODERADOR §5");
                                p.setPlayerListName("§5§l§oMODERADOR §5");

                            } else if (p.hasPermission("group.trial")) {
                                if (args[0].equalsIgnoreCase("trial")) {
                                    p.sendMessage("§fSua tag foi alterada para §5§l§oTRIAL§f.");
                                    p.setDisplayName("§5§l§oTRIAL §5" + p.getName());
                                    p.setPlayerListName("§5§l§oTRIAL §5" + p.getName());

                                } else if (p.hasPermission("group.youtuber")) {
                                    if (args[0].equalsIgnoreCase("youtuber")) {
                                        p.sendMessage("§fSua tag foi alterada para §b§l§oYOUTUBER§f.");
                                        p.setDisplayName("§b§l§oYOUTUBER §b" + p.getName());
                                        p.setPlayerListName("§b§l§oTRIAL §b" + p.getName());

                                    } else if (p.hasPermission("group.vip")) {
                                        if (args[0].equalsIgnoreCase("vip")) {
                                            p.sendMessage("§fSua tag foi alterada para §6§lVIP§f.");
                                            p.setDisplayName("§6§lVIP §6" + p.getName());
                                            p.setPlayerListName("§6§lVIP §6" + p.getName());

                                        }
                                    } else {
                                        p.sendMessage("Sem permissão!");
                                    }
                                    if ((p.isOp() || !p.isOp()) && args[0].equalsIgnoreCase("membro")) {
                                        p.sendMessage("§6§lLion§c§lMC §a - Sua tag foi alterada para §7§lMEMBRO§a.");
                                        p.setDisplayName("§7§lMEMBRO §7" + p.getName());
                                        p.setPlayerListName("§7§lMEMBRO §7" + p.getName());
                                }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
