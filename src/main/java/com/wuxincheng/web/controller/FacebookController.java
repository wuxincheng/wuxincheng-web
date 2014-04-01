package com.wuxincheng.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 * 
 * @author wuxincheng
 *
 */
@Controller
@RequestMapping("/facebook")
public class FacebookController {

	private static Logger logger = LoggerFactory.getLogger(FacebookController.class);

	@RequestMapping(value = "/share")
	public String share(Model model) {
		logger.info("facebook share");
		
		return "test/bestpay/openAccountDubbo";
	}
	
	@RequestMapping(value = "/follow")
	public String follow(Model model) {
		logger.info("facebook follow");
		
		return "test/bestpay/openAccountDubbo";
	}

}
