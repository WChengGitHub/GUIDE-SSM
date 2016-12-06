package com.guide.ssm.module.user.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.guide.ssm.module.user.service.GetPageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.json.JsonObject;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/getPageController")
public class GetPageController {
	
	private static final Logger LOG = LoggerFactory.getLogger(GetPageController.class);
	
	@Resource
	private GetPageService getPageService;
//	String LoginURL="http://vjudge.net/user/login";
	String DetailURL="http://vjudge.net/contest/128714#problem/";
	String ListURl="http://vjudge.net/contest/128714#rank";
	@RequestMapping("/getDetailPageToById/{problemId}")
	@ResponseBody
	public String getDetailPage(@PathVariable("problemId") String problemId){
		return this.getPageService.getDetailPage(DetailURL+problemId);
	}
	
	@RequestMapping("/getIndexPage")
	@ResponseBody
	public String getIndexPage(){
		Map map=new HashMap();
		map.put("data",this.getPageService.getIndexPage(ListURl));
		return JSONUtils.toJSONString(map);
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
