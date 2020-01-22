package me.aquino.events;

        import org.bukkit.entity.Player;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.event.player.AsyncPlayerChatEvent;

public class FormatChatE implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(p.hasPermission("aquino.chatcolor")) {
            e.setFormat(p.getDisplayName() + " §7» " + e.getMessage().replace("&", "§").replace("%", " Porcento(s)".replace("<3", "§4❤")));
        } else {
            e.setFormat(p.getDisplayName() + " §7» " + e.getMessage());
        }
        if(p.hasPermission("aquino.chatcolor")) {
            e.setFormat(p.getDisplayName() + " §6»§f " + e.getMessage().replace("&", "§").replace("%", "Porcento(s)").replace("<3", "§4❤"));
        }
    }
}
