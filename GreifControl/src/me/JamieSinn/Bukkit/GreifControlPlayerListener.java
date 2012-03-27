package me.JamieSinn.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class GreifControlPlayerListener implements Listener 
{
	public static GreifControl plugin;

	public void onPlayerChat(PlayerChatEvent event)
	{

		@SuppressWarnings("unused")
		Player player = event.getPlayer();
		if(event.getMessage().toLowerCase().contains("greif"))
		{
			Bukkit.broadcast(ChatColor.DARK_RED + "Potential Greif Alert!", null);
		}
			else if(event.getMessage().toLowerCase().contains("destroy"))
			{
				Bukkit.broadcast(ChatColor.DARK_RED + "Potential Greif Alert!", null);
		
			}
				else if(event.getMessage().toLowerCase().contains("griff"))
				{
						Bukkit.broadcast(ChatColor.DARK_RED + "Potential Greif Alert!", null);
				}
						else if(event.getMessage().toLowerCase().contains("greifing"))
						{
							Bukkit.broadcast(ChatColor.DARK_RED + "Potential Greif Alert!", null);
						}
								else if(event.getMessage().toLowerCase().contains("demolish"))
								{
									Bukkit.broadcast(ChatColor.DARK_RED + "Potential Greif Alert!", null);
								}
	}



}

