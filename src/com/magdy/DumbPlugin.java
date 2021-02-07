package com.magdy;

import com.magdy.listeners.Listeners;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class DumbPlugin extends JavaPlugin {
  private static DumbPlugin instance;
  
  public static DumbPlugin getInstance() {
    return instance;
  }
  
  public void onEnable() {
    instance = this;
    getServer().getPluginManager().registerEvents((Listener)new Listeners(), (Plugin)this);
  }
  
  public void onDisable() {
    instance = null;
  }
}