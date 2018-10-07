package me.Kay0sX.GyroBan;

import org.bukkit.plugin.java.JavaPlugin;

import me.Kay0sX.GyroBan.commands.BanCommand;

public class GyroBan extends JavaPlugin {
	@Override
    public void onEnable() {
        new BanCommand(this);
    }
    
    @Override
    public void onDisable() {
        
    }
}