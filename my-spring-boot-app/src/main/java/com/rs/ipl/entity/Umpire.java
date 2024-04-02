
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

@Table(name = "umpire")
public class Umpire {

	@Id

	@Column(name = "umpire_id")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String country;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Match.class)

	@JoinColumn(name = "uid", referencedColumnName = "umpire_id")
	private Set<Match> matches;

	public Umpire(int id, String name, String country, Set<Match> matches) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.matches = matches;
	}

}
