package com.rs.ipl.mapper;

import com.rs.ipl.entity.Player;
import com.rs.ipl.request.PlayerRequest;

public class SavePlayerMapper {

	public static Player mapToEntity(PlayerRequest request) {
		Player player = new Player();

		player.setFirstName(player.getFirstName());
		player.setMiddleName(player.getMiddleName());
		player.setLastName(player.getLastName());

		player.setAge(request.getAge());
		player.setRole(request.getRole());
		player.setJerseyNumber(request.getJerseyNumber());
		player.setTeamId(request.getTeamId());
		
		return player;
	}
}
