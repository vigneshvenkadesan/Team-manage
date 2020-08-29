package com.spring.service;

import java.util.List;

import com.spring.entity.Player;

public interface PlayerService {
	
	
	public List<Player> getPlayers();



	public void savePlayer(Player thePlayer);



	public List<Player> getSortedPlayers();



	public Player getPlayer(int theId);



	public void deletePlayer(int theId); 
	

}
