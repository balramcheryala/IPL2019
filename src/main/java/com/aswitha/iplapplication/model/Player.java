package com.aswitha.iplapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Player {

	@Column
	private String player_teamname;

	@Column
	private String player_name;

	@Column
	private String player_img_url;

	@Column
	private String player_role;

	@Column
	private String player_batting_style;

	@Column
	private String player_bowling_style;

	@Column
	private String player_nationality;

	@Column
	private String player_dob;

	@Column
	private String destination_folder_name;

	public void setPlayer_teamname(String player_teamname) {
		this.player_teamname = player_teamname;
	}

	public String getPlayer_teamname() {
		return this.player_teamname;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getPlayer_name() {
		return this.player_name;
	}

	public void setPlayer_img_url(String player_img_url) {
		this.player_img_url = player_img_url;
	}

	public String getPlayer_img_url() {
		return this.player_img_url;
	}

	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}

	public String getPlayer_role() {
		return this.player_role;
	}

	public void setPlayer_batting_style(String player_batting_style) {
		this.player_batting_style = player_batting_style;
	}

	public String getPlayer_batting_style() {
		return this.player_batting_style;
	}

	public void setPlayer_bowling_style(String player_bowling_style) {
		this.player_bowling_style = player_bowling_style;
	}

	public String getPlayer_bowling_style() {
		return this.player_bowling_style;
	}

	public void setPlayer_nationality(String player_nationality) {
		this.player_nationality = player_nationality;
	}

	public String getPlayer_nationality() {
		return this.player_nationality;
	}

	public void setPlayer_dob(String player_dob) {
		this.player_dob = player_dob;
	}

	public String getPlayer_dob() {
		return this.player_dob;
	}

	public void setDestination_folder_name(String destination_folder_name) {
		this.destination_folder_name = destination_folder_name;
	}

	public String getDestination_folder_name() {
		return this.destination_folder_name;
	}

	@Override
	public String toString() {
		return "Player [player_teamname=" + player_teamname + ", player_name=" + player_name + ", player_img_url="
				+ player_img_url + ", player_role=" + player_role + ", player_batting_style=" + player_batting_style
				+ ", player_bowling_style=" + player_bowling_style + ", player_nationality=" + player_nationality
				+ ", player_dob=" + player_dob + ", destination_folder_name=" + destination_folder_name + "]";
	}
}
