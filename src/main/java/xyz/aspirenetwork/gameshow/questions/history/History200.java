package xyz.aspirenetwork.gameshow.questions.history;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class History200 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player){

            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta meta = (BookMeta) book.getItemMeta();

            meta.setTitle(ChatColor.BLUE + "History" + ChatColor.GOLD + " 200");
            meta.setAuthor(ChatColor.DARK_PURPLE + "Aspire Game Show");
            meta.addPage(
                    ChatColor.BLUE + "Catogory: History" +
                            "\n" + ChatColor.GOLD + "Worth 200"
            );
            meta.addPage(
                    "What date did the" +
                            "\n" + "Declaration of" +
                            "\n" + "Independence get" +
                            "\n" + "signed? (year is" +
                            "\n" + "optional)"
            );
            meta.addPage(
                    "July 4th 1776"
            );
            book.setItemMeta(meta);
            player.getInventory().addItem(book);
        }
        return false;
    }
}
