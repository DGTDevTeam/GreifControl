package me.JamieSinn.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import org.bukkit.ChatColor;
import org.bukkit.Material;


public class GreifControlBlockListener implements Listener 
{
	public static GreifControl plugin;
	public static Material[] blacklist = {Material.TNT, Material.LAVA_BUCKET, Material.BEDROCK, Material.SPONGE, 
										  Material.FLINT_AND_STEEL, Material.FIRE, Material.WATER_BUCKET,
										  Material.WATER, Material.MONSTER_EGG, Material.MONSTER_EGGS, 
										  Material.MOB_SPAWNER};

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{
		Material block = event.getBlock().getType();
		Player player = event.getPlayer();

		for (Material blocked : blacklist) 
		{
			if (blocked == block) 
			{
			    if(player.hasPermission("GreifControl.override")) 
			    {
			    	
			    }
			
				if (player.isOp()) 
				{
				}
					else 
					{
						
						player.chat("I Just Placed " + ChatColor.DARK_RED + blocked);
						event.getBlock().setType(Material.AIR);
					}
			}
		}
	
	}



}

