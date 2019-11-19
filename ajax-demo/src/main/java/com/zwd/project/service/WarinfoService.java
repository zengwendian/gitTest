package com.zwd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwd.project.mapper.WarinfoMapper;
import com.zwd.project.pojo.Score;
import com.zwd.project.pojo.Team;

@Service
public class WarinfoService {

	@Autowired
	WarinfoMapper warinfoMapper;
	
	public List<Team> getListTeam() {
		return warinfoMapper.getListTeam();
	}

	public List<Score> getTeamById(int teamId) {
		return warinfoMapper.getTeamById(teamId);
	}

}
