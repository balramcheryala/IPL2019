package com.aswitha.iplapplication.model;

public class PlayerMain {

	private String name;
	
	private Player DelhiDareDevils;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getDelhiDareDevils() {
		return DelhiDareDevils;
	}

	public void setDelhiDareDevils(Player delhiDareDevils) {
		DelhiDareDevils = delhiDareDevils;
	}

	@Override
	public String toString() {
		return "PlayerMain [name=" + name + ", DelhiDareDevils=" + DelhiDareDevils + "]";
	}

}
