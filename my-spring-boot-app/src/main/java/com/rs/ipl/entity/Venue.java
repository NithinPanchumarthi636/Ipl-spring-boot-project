
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
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter

@Table(name = "venue")
public class Venue {

	@Id

	@Column(name = "venue_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String StadiumName;
	private String city;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Match.class)

	@JoinColumn(name = "vid", referencedColumnName = "venue_id")
	private Set<Match> matches;

	public Venue(int id, String stadiumName, String city, Set<Match> matches) {
		super();
		this.id = id;
		StadiumName = stadiumName;
		this.city = city;
		this.matches = matches;
	}

}
