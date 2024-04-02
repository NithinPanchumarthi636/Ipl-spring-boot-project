
package com.rs.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter

@Table(name = "player")
public class Player {

	@Id

	@Column(name = "player_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;
	private String middleName;
	private String lastName;

	@Transient
	private int age;

	private String role;
	private int jerseyNumber;

	@Column(name = "tpid")
	private int teamId;

	private String specialization;

}
