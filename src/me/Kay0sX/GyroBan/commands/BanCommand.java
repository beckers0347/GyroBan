package me.Kay0sX.GyroBan.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.mojang.brigadier.Command;

import me.Kay0sX.GyroBan.GyroBan;
import net.minecraft.data.Main;

public class BanCommand implements CommandExecutor {
	
	private Main plugin;
	
	public BanCommand(GyroBan gyroBan) {
		this.plugin = gyroBan;
		gyroBan.getCommand("ban").setExecutor(this);
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg3) {
		/*if (!(sender instanceof Player)) {
			
			return true;
		}*/
		
		Player admin = (Player) sender;
		
		if (admin.hasPermission(gyroban.use)) {
			
			return true;
		}else {
			admin.sendMessage("You do not have permission to use this command");
		}
		
		return false;
	}

}
