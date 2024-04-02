
package com.rs.ipl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter

@Table(name = "match_details")
public class Match {

	@Id

	@Column(name = "match_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Team.class)
	@JoinColumn(name = "team1_id", referencedColumnName = "team_id")
	private Team team1;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Team.class)
	@JoinColumn(name = "team2_id", referencedColumnName = "team_id")
	private Team team2;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Venue.class)
	@JoinColumn(name = "venue_id")
	private Venue venue;

	private String date;
	private String result;

	@ManyToOne
	@JoinColumn(name = "winning_team_id")
	private Team winningTeam;

	@OneToOne
	@JoinColumn(name = "ump1_id")
	private Umpire umpire1;

	@OneToOne
	@JoinColumn(name = "ump2_id")
	private Umpire umpire2;

	public Match(int id, Team team1, Team team2, Venue venue, String date, String result, Team winningTeamId,
			Umpire umpire1, Umpire umpire2) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.venue = venue;
		this.date = date;
		this.result = result;
		this.winningTeam = winningTeamId;
		this.umpire1 = umpire1;
		this.umpire2 = umpire2;
	}

}
