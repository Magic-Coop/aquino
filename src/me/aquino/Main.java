package me.aquino;

import me.aquino.commands.*;
import me.aquino.events.FormatChatE;
import me.aquino.events.JoinMessageE;
import me.aquino.events.QuitEventE;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerQuitEvent;
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
        Bukkit.getPluginManager().registerEvents(new JoinMessageE(), this);
        Bukkit.getPluginManager().registerEvents(new QuitEventE(), this);
    }

    public void commands() {
        getCommand("gm").setExecutor(new GamemodeCMD());
        getCommand("cc").setExecutor(new ChatClearC());
        getCommand("tag").setExecutor(new TagC());
        getCommand("fly").setExecutor(new FlyC());
        getCommand("tp").setExecutor(new TpC());
        getCommand("tphere").setExecutor(new TpC());
        getCommand("tpall").setExecutor(new TpC());
        getCommand("manutencao").setExecutor(new ManutentionC());
    }
}
