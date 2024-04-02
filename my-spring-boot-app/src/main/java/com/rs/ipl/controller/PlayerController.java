package com.rs.ipl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rs.ipl.entity.Player;
import com.rs.ipl.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@PostMapping("/player")
	public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
		Player savedPlayer = playerService.savePlayer(player);
		return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
	}
}
