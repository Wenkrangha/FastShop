package com.wenkrangha.fastshop;

import org.bukkit.plugin.java.JavaPlugin;

public final class FastShop extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //注册命令
        this.getCommand("fs").setExecutor(new fs());
        //检测配置文件与存档是否存在

        //注册监听器
        getServer().getPluginManager().registerEvents(new event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
