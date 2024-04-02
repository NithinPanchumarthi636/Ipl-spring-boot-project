package com.rs.ipl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rs.ipl.entity.Team;
import com.rs.ipl.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("/team")
	public ResponseEntity<Team> saveTeam(@RequestBody Team team) {
		Team savedTeam = teamService.saveTeam(team);
		return new ResponseEntity<>(savedTeam, HttpStatus.CREATED);
	}
}
