package com.rs.ipl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.ipl.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
