package com.rs.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter

@Setter

@Table(name = "coach")
public class Coach {

	@Id
	@Column(name = "coach_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	public Coach(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
