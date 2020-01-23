package me.aquino.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitEventE implements Listener {

    @EventHandler
    public void quandoSair(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(null);

        }
    }