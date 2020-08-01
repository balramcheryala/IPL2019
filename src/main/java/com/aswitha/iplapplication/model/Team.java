package com.aswitha.iplapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Team {

	@Column
	private String team_name;

	@Column
	private String team_coach;

	@Column
	private String team_captain;

	@Column
	private String team_home_venue;

	@Column
	private String team_owner;

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getTeam_name() {
		return this.team_name;
	}

	public void setTeam_coach(String team_coach) {
		this.team_coach = team_coach;
	}

	public String getTeam_coach() {
		return this.team_coach;
	}

	public void setTeam_captain(String team_captain) {
		this.team_captain = team_captain;
	}

	public String getTeam_captain() {
		return this.team_captain;
	}

	public void setTeam_home_venue(String team_home_venue) {
		this.team_home_venue = team_home_venue;
	}

	public String getTeam_home_venue() {
		return this.team_home_venue;
	}

	public void setTeam_owner(String team_owner) {
		this.team_owner = team_owner;
	}

	public String getTeam_owner() {
		return this.team_owner;
	}
}
