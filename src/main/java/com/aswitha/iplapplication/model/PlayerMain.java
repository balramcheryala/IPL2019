package com.aswitha.iplapplication.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerMain {

	private List<Player> playerDetails = new ArrayList<Player>();

	public List<Player> getPlayerDetails() {
		return playerDetails;
	}

	public void setPlayerDetails(List<Player> playerDetails) {
		this.playerDetails = playerDetails;
	}

	@Override
	public String toString() {
		return "PlayerMain [ playerDetails=" + playerDetails + "]";
	}

}
