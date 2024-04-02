package com.rs.ipl.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "team")
public class Team {

	@Id
	@Column(name = "team_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String state;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Player.class)
	@JoinColumn(name = "capid", referencedColumnName = "player_id")
	private String captain;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Player.class)
	@JoinColumn(name = "vcapid", referencedColumnName = "player_id")
	private String viceCaptain;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Coach.class)
	@JoinColumn(name = "cid", referencedColumnName = "coach_id")
	private String coach;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Player.class)
	@JoinColumn(name = "tpid", referencedColumnName = "team_id")
	private Set<Player> players;

	@OneToMany(mappedBy = "winningTeam", cascade = CascadeType.ALL)
	private Set<Match> matches;

}