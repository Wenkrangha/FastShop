package com.wenkrangha.fastshop;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


//初始化监听器
public class event implements Listener{
    @EventHandler
    public void gui(InventoryClickEvent event) {
        //防止玩家拿走物品
        if (event.getView().getTitle().equalsIgnoreCase("FastShop-快速商店")) {
            //检测点击事件
            if (event.getRawSlot() == 1){

            }

            event.setCancelled(true); //取消点击事件
        }
    }
}
