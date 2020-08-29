package com.spring.dao;

import java.util.List;

import com.spring.entity.Player;
import org.springframework.transaction.annotation.Transactional;

public interface PlayerDao {
	@Transactional
	public List<Player> getPlayers();



	@Transactional
	public void savePlayer(Player thePlayer);



	@Transactional
	public List<Player> getSortedPlayers();


	@Transactional
	public Player getPlayer(int theId);


	@Transactional
	public void deletePlayer(int theId);

}
