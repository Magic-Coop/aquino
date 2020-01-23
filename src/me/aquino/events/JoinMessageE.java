package me.aquino.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessageE implements Listener {
    @EventHandler
    public void onJoinM(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        p.sendMessage("§b      BEM VINDO AO MAGICMC       ");
    }
}

