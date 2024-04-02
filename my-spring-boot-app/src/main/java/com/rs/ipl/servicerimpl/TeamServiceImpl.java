package com.rs.ipl.servicerimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.ipl.entity.Team;
import com.rs.ipl.repository.TeamRepository;
import com.rs.ipl.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public Team saveTeam(Team team) {
		return teamRepository.save(team);

	}

}
