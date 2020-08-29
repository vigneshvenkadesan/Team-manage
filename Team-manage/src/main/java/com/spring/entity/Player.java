package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name="players")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="playerType")
	private String playerType;
	
	@Min(value=1) //validator
	@Column(name="noOfMatches")
	private int no;
	
	@Column(name="runs")
	private int runs;
	
	@Column(name="average")
	private float avg;
	
	@Column(name="noOfWickets")
	private int wkt;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int gethScore() {
		return hScore;
	}

	public void sethScore(int hScore) {
		this.hScore = hScore;
	}

	public int getNoW() {
		return wkt;
	}

	public void setNoW(int noW) {
		this.wkt = noW;
	}

	@Column(name="bestScore")
	private int hScore;
	
	
	
	public Player() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", playerType=" + playerType
				+ ", no=" + no + ", runs=" + runs + ", avg=" + avg + ", hScore=" + hScore + ", noW=" + wkt + "]";
	}
		
}





