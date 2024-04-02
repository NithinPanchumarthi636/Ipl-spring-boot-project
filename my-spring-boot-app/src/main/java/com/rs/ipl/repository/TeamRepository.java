package com.rs.ipl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.ipl.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
