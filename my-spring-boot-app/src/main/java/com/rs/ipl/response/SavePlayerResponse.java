package com.rs.ipl.response;

import com.rs.ipl.entity.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavePlayerResponse {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String role;
	private int jerseyNumber;
	private int teamId;

	public static SavePlayerResponse fromPlayer(Player player) {
		SavePlayerResponse response = new SavePlayerResponse();
		response.setId(player.getId());

		response.setFirstName(player.getFirstName());
		response.setMiddleName(player.getMiddleName());
		response.setLastName(player.getLastName());

		response.setAge(player.getAge());
		response.setRole(player.getRole());
		response.setJerseyNumber(player.getJerseyNumber());
		response.setTeamId(player.getTeamId());
		return response;
	}

}
