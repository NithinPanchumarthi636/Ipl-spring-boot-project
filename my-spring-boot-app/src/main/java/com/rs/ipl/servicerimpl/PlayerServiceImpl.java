package com.rs.ipl.servicerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.ipl.entity.Player;
import com.rs.ipl.repository.PlayerRepository;
import com.rs.ipl.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player savePlayer(Player player) {

		return playerRepository.save(player);

	}

}
