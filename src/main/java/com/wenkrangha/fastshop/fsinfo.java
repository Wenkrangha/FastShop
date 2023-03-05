package com.wenkrangha.fastshop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class fsinfo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //写这里
        //https://lingluo-hub.gitee.io/spigotmc/official-plugin-development/ 看这个对你有帮助哦
        //https://bukkit.windit.net/javadoc/ 这个是大全,但你可能看不懂
        sender.sendMessage("§b[!]    Fastshop版本说明    [!]");  //只是个介绍
        sender.sendMessage("§e    /fs 打开Fastshop主菜单");
        return true;
    }
}
