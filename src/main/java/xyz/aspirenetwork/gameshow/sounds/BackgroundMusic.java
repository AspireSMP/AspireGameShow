package xyz.aspirenetwork.gameshow.sounds;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BackgroundMusic implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player player = (Player) sender;

            player.playEffect(new Location(Bukkit.getWorld("world"), 4, 72, -63), Effect.RECORD_PLAY, Material.MUSIC_DISC_STAL);
            player.sendMessage(ChatColor.GREEN + "You Are listening to: Stal by C418!");
        }

        return false;
    }
}
