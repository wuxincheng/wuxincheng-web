package com.wuxincheng.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/github")
public class GithubController {

	private static Logger logger = LoggerFactory.getLogger(GithubController.class);
	
	@RequestMapping(value = "/")
	public String execute(Model model) {
		logger.info("fork me on github controller");
		
		return "github";
	}
	
}
