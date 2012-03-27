package me.JamieSinn.Bukkit;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GreifControl extends JavaPlugin
{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static GreifControl Plugin;
	public final GreifControlBlockListener bl = new GreifControlBlockListener();
	public final GreifControlPlayerListener pl = new GreifControlPlayerListener();
	
	
	
	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
		
	}
	
	@Override
	public void onEnable()
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() +  " Has Been Successfully Enabled!");
		PluginManager pm =getServer().getPluginManager();
		pm.registerEvents(this.bl, this);
		pm.registerEvents(this.pl, this);

	}
}
