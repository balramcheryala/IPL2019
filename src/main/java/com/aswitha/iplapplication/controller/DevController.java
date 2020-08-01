package com.aswitha.iplapplication.controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aswitha.iplapplication.model.Player;
import com.aswitha.iplapplication.model.PlayerMain;
import com.aswitha.iplapplication.model.Team;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DevController {

	private static final String PLAYER_URL = "https://raw.githubusercontent.com/balramcheryala/IPL2019/master/src/main/jsonfile/IPLPlayer/";
	private static final String TEAM_URL = "https://raw.githubusercontent.com/balramcheryala/IPL2019/master/src/main/jsonfile/IPLTeam/";
	private static final String JSON_EXTENSION = ".json";
	
	@Autowired EntityManager entityManager;

	@GetMapping
	public String test() {
		return "Testing Done";
	}

	@GetMapping(value = "ipl")
	public ModelAndView iplHomepage() {
		return new ModelAndView("iplhome");
	}

	@GetMapping(value = "/teams/{teamrequest}")
	public ModelAndView TeamList(@PathVariable("teamrequest") String iplteam) {
		Map<String, Object> model = new HashMap<String, Object>();
		try {
			model.put("teamlist", getTeamDeails(iplteam));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ModelAndView("Teams", model);
	}

	@GetMapping(value = "/players/{request}")
	public ModelAndView playersList(@PathVariable("request") String ipl) {
		Map<String, Object> model = new HashMap<String, Object>();
		try {
			model.put("playerslist", getPlayerDeails(ipl));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ModelAndView("playerlist", model);
	}
	
	private static List<Player> getPlayerDeails(String playTeam) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL(PLAYER_URL+playTeam+JSON_EXTENSION);
        PlayerMain player = objectMapper.readValue(url, PlayerMain.class);
        System.out.println(player);
        player.toString();
        return player.getPlayerDetails();
	}
	
	private static Team getTeamDeails(String teamName) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		URL url = new URL(TEAM_URL+teamName+JSON_EXTENSION);
		Team team = objectMapper.readValue(url, Team.class);
		System.out.println(team);
		team.toString();
		return team;
	}
	
}
