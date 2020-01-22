package me.aquino;

import me.aquino.commands.ChatClearC;
import me.aquino.commands.GamemodeCMD;
import me.aquino.events.FormatChatE;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    public static Main getInstance() {
        return instance;
    }

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aPLUGIN §fIniciando plugin...");
        instance = this;
        registerEvents();
        commands();
    }

    public void onDisable() {

    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new FormatChatE(), this);
    }

    public void commands() {
        getCommand("gm").setExecutor(new GamemodeCMD());
        getCommand("cc").setExecutor(new ChatClearC());
    }
}
