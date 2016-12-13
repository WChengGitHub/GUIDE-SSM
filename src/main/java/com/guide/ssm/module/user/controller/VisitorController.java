package com.guide.ssm.module.user.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.guide.ssm.module.user.pojo.TbVisitor;
import com.guide.ssm.module.user.service.VisitorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/VisitorController")
public class VisitorController {
	
	private static final Logger LOG = LoggerFactory.getLogger(VisitorController.class);
	
	@Resource
	private VisitorService visitorService;

	@ResponseBody
	@RequestMapping(value ="/showVisitorToById", method = RequestMethod.POST)
	public String showVisitor(@RequestParam String vid){
		Map map=new HashMap();
		TbVisitor tbVisitor=this.visitorService.getById(vid);
		System.out.println(JSON.toJSONString(tbVisitor));
		return JSON.toJSONString(tbVisitor);
	}


	@RequestMapping("/test-logback")
	@ResponseBody
	public Date testLogback(){
		LOG.trace("-----------------------------------trace");
		LOG.debug("-----------------------------------debug");
		LOG.info("-----------------------------------info");
		LOG.warn("-----------------------------------warn");
		LOG.error("-----------------------------------error");
		return new Date();
	}
	



}
