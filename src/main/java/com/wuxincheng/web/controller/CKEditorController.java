package com.wuxincheng.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wuxincheng.util.CatchImageURLUtil;

/**
 * CKEditor
 * 
 * @author wuxincheng
 *
 */
@Controller
@RequestMapping("/ckeditor")
public class CKEditorController {

	private static Logger logger = LoggerFactory.getLogger(CKEditorController.class);

	@RequestMapping(value = "/main")
	public String execute(Model model) {
		logger.info("ckeditor test");
		
		return "ckeditor/main";
	}
	
	@RequestMapping(value = "/domain")
	public String domain(Model model, String content) throws Exception {
		logger.info("do ckeditor test");
		
		logger.info("content: " + content);
		
		String imgURL = CatchImageURLUtil.getFirstImgURLFromContent(content);
		
		logger.info("第一张图片的URL地址：" + imgURL);
		
		return "ckeditor/main";
	}

}
