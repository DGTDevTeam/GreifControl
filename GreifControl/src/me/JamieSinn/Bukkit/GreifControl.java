package me.JamieSinn.Bukkit;

import java.util.logging.Logger;


import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GreifControl extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static GreifControl Plugin;
	public static GreifControlBlockListener bl = new GreifControlBlockListener();
	
	
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
		
	}
	@SuppressWarnings("static-access")
	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  " Has Been Successfully Enabled!");
		PluginManager pm =getServer().getPluginManager();
		pm.registerEvents(this.bl, this);

	}
}
