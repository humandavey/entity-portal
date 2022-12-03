package me.humandavey.entityportal;

import me.humandavey.entityportal.listeners.EntityPortalListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EntityPortal extends JavaPlugin {

	private static EntityPortal instance;

	@Override
	public void onEnable() {
		instance = this;

		setupConfigs();
		setupManagers();
		registerListeners();
		registerCommands();
	}

	@Override
	public void onDisable() {

	}

	private void setupConfigs() {
		getConfig().options().copyDefaults();
		saveDefaultConfig();
	}

	private void setupManagers() {

	}

	private void registerListeners() {
		getServer().getPluginManager().registerEvents(new EntityPortalListener(), this);
	}

	private void registerCommands() {

	}

	public static EntityPortal getInstance() {
		return instance;
	}
}
