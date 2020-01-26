package me.aquino.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickEventE implements Listener {
    @EventHandler
        public void onPlayerInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
            Block clickedBlock = e.getClickedBlock();



        }
}
