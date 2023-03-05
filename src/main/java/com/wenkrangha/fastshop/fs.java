package com.wenkrangha.fastshop;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

//初始化命令 fs
//TODO:此命令可以打开FastShop的主菜单


public class fs implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Inventory GUI = Bukkit.createInventory(null, 54, "FastShop-快速商店");
        if (sender instanceof Player) {
            Player player = (Player) sender; //获取玩家对象
            player.openInventory(GUI);

            //初始化界面图标
            //背景
            //TODO:没啥用装饰
            ItemStack back = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
            back.getItemMeta().setDisplayName("");

            //渲染图标

            //TODO:渲染背景
            GUI.setItem(0, back);
            GUI.setItem(1, back);
            GUI.setItem(2, back);
            GUI.setItem(3, back);
            GUI.setItem(4, back);
            GUI.setItem(5, back);
            GUI.setItem(6, back);
            GUI.setItem(7, back);
            GUI.setItem(8, back);


        }else {
            sender.sendMessage("[!] 此命令不能在终端运行");
        }
        return true;
    }
}
