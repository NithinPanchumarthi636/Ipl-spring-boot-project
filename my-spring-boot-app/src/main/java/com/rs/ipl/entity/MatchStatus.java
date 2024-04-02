
package com.rs.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter

@Table(name = "match_status")
public class MatchStatus {

	@Id

	@Column(name = "matchStatus_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@JoinColumn(name = "mid", referencedColumnName = "match_id")
	private int matchId;

	@JoinColumn(name = "pid", referencedColumnName = "player_id")
	private int playerId;

	private int runsScored;
	private int wicketsTaken;

	public MatchStatus(int id, int matchId, int playerId, int runsScored, int wicketsTaken) {
		super();
		this.id = id;
		this.matchId = matchId;
		this.playerId = playerId;
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

}
