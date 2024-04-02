package com.rs.ipl.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerRequest {
	private String name;
	private int age;
	private String role;
	private int jerseyNumber;
	private int teamId;

}
