package me.JamieSinn.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public class GreifControlBlockListener implements Listener {
	public static GreifControl plugin;
	public static Material[] blacklist = { Material.TNT, Material.FIRE,
			Material.SPONGE, Material.LAVA, Material.BEDROCK };

	public GreifControlBlockListener(GreifControl instance)
	{
		plugin = instance;
	}



	public GreifControlBlockListener() {
		// TODO Auto-generated constructor stub
	}



	public void onBlockPlace(BlockPlaceEvent event) {
		Material block = event.getBlock().getType();
		Player player = event.getPlayer();

		for (Material blocked : blacklist) 
		{
			if (blocked == block) 
			{
			    if(player.hasPermission("GreifControl.override")) 
			    {
			    	
			    }
			}
				if (player.isOp()) 
				{
				}
					else 
					{
						event.getBlock().setType(Material.AIR);
						player.chat("I Just Placed " + ChatColor.DARK_RED + blocked);
					}
			}
		}
	}

