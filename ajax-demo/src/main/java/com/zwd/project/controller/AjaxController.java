package com.zwd.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zwd.project.pojo.Score;
import com.zwd.project.service.WarinfoService;

@Controller
public class AjaxController {

	@Autowired
	WarinfoService WarinfoService;
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("teams", WarinfoService.getListTeam());
		return "index";
	}
	
	@RequestMapping("dropDown")
	@ResponseBody
	public List<Score> dropDown(int teamId,Model model) {
		List<Score> scores = WarinfoService.getTeamById(teamId);
		model.addAttribute("scores", scores); 
		return scores;
	}
}
