package com.aswitha.iplapplication.controller;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.aswitha.iplapplication.model.PlayerMain;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DevController {

	@Autowired
	EntityManager entityManager;

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
		// model.put("teamlist", iplteamgenerate(iplteam));
		return new ModelAndView("Teams", model);
	}

	@GetMapping(value = "/players/{request}")
	public ModelAndView playersList(@PathVariable("request") String ipl) {
		Map<String, Object> model = new HashMap<String, Object>();
		//model.put("playerslist", ipldao.iplplayergenerate(ipl));
		return new ModelAndView("playerlist", model);
	}
	
	public static void test2() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL("https://raw.githubusercontent.com/balramcheryala/IPL2019/master/src/main/jsonfile/IPLPlayer/DelhiDareDevils.json");
        PlayerMain player = objectMapper.readValue(url, PlayerMain.class);
        System.out.println(player);
        player.toString();
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		test2();
	}
	
}
