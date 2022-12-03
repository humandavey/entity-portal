package me.humandavey.entityportal.listeners;

import me.humandavey.entityportal.EntityPortal;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

public class EntityPortalListener implements Listener {

	@EventHandler
	public void onEntityPortal(EntityPortalEvent event) {
		// end-to-overworld
		if (event.getFrom().getWorld().getEnvironment() == World.Environment.THE_END && event.getTo().getWorld().getEnvironment() == World.Environment.NORMAL) {
			if (EntityPortal.getInstance().getConfig().getStringList("end-to-overworld").contains(event.getEntity().getType().name())) {
				event.setCancelled(true);
			}
		}
		// end-to-end
		if (event.getFrom().getWorld().getEnvironment() == World.Environment.THE_END && event.getTo().getWorld().getEnvironment() == World.Environment.THE_END) {
			if (EntityPortal.getInstance().getConfig().getStringList("end-to-end").contains(event.getEntity().getType().name())) {
				event.setCancelled(true);
			}
		}
		// overworld-to-end
		if (event.getFrom().getWorld().getEnvironment() == World.Environment.NORMAL && event.getTo().getWorld().getEnvironment() == World.Environment.THE_END) {
			if (EntityPortal.getInstance().getConfig().getStringList("overworld-to-end").contains(event.getEntity().getType().name())) {
				event.setCancelled(true);
			}
		}
		// overworld-to-nether
		if (event.getFrom().getWorld().getEnvironment() == World.Environment.NORMAL && event.getTo().getWorld().getEnvironment() == World.Environment.NETHER) {
			if (EntityPortal.getInstance().getConfig().getStringList("overworld-to-nether").contains(event.getEntity().getType().name())) {
				event.setCancelled(true);
			}
		}
		// nether-to-overworld
		if (event.getFrom().getWorld().getEnvironment() == World.Environment.NETHER && event.getTo().getWorld().getEnvironment() == World.Environment.NORMAL) {
			if (EntityPortal.getInstance().getConfig().getStringList("nether-to-overworld").contains(event.getEntity().getType().name())) {
				event.setCancelled(true);
			}
		}
	}
}
