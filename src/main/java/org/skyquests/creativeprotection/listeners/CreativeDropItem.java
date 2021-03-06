package org.skyquests.creativeprotection.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class CreativeDropItem implements Listener {

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        if (event.getPlayer().hasPermission("creativedisable.bypass")) {
            return;
        }

        if (event.getPlayer().getGameMode() == GameMode.CREATIVE) {
            event.setCancelled(true);
        }
    }
}
