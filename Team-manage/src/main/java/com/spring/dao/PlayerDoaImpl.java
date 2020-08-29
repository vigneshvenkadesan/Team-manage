package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entity.Player;


@Repository	
public class PlayerDoaImpl implements PlayerDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Player> getPlayers() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Player> theQuery = 
				currentSession.createQuery("from Player", Player.class);
		
		// execute query and get result list
		List<Player> players = theQuery.getResultList();
				
		// return the results		
		return players;  
		
	}

	

	@Override
	public void savePlayer(Player thePlayer) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(thePlayer);
		
	}



	@Override
	public List<Player> getSortedPlayers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Player> theQuery = 
				currentSession.createQuery("from Player order by no DESC", Player.class);
		
		// execute query and get result list
		List<Player> players = theQuery.getResultList();
				
		// return the results		
		return players;  
		
	}



	@Override
	public Player getPlayer(int theId) {
		// TODO Auto-generated method stub
		
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Player thePlayer = currentSession.get(Player.class, theId);
		
		// execute query and get result list

				
		// return the results		
		return thePlayer;  
		
	}



	@Override
	public void deletePlayer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Player where id=: thePlayerId");
		theQuery.setParameter("thePlayerId", theId);
		theQuery.executeUpdate();
	}

}
