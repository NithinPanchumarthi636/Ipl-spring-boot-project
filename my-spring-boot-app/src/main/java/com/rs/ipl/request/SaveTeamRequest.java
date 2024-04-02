package com.rs.ipl.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveTeamRequest {
	private String name;
	private String state;
	private String captain;
	private String coach;
}
