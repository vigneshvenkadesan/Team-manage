package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.PlayerDao;
import com.spring.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	@Transactional
	public List<Player> getPlayers() {
		// TODO Auto-generated method stub
		
		
		return playerDao.getPlayers();
	}


	@Override
	@Transactional
	public void savePlayer(Player thePlayer) {
		// TODO Auto-generated method stub
		playerDao.savePlayer(thePlayer);
	}


	@Override
	@Transactional
	public List<Player> getSortedPlayers() {
		// TODO Auto-generated method stub
		return playerDao.getSortedPlayers();
	}


	@Override
	@Transactional
	public Player getPlayer(int theId) {
		// TODO Auto-generated method stub
		return playerDao.getPlayer(theId);
	}


	@Override
	public void deletePlayer(int theId) {
		// TODO Auto-generated method stub
		playerDao.deletePlayer(theId);
	}

}
