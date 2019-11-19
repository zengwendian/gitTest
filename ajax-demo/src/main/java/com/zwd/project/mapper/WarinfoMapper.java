package com.zwd.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zwd.project.pojo.Score;
import com.zwd.project.pojo.Team;

@Mapper
public interface WarinfoMapper {

	List<Team> getListTeam();

	List<Score> getTeamById(int teamId);

}
