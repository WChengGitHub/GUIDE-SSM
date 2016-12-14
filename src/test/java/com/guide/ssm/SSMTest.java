package com.guide.ssm;

import com.guide.ssm.module.user.pojo.TbVisitor;
import com.guide.ssm.module.user.service.VisitorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class SSMTest {

	
	@Resource
	private VisitorService visitorService;

	@Test
	public void test1() {
		TbVisitor tbVisitor= visitorService.getById("1111");
		System.out.println("--------------------------------" + tbVisitor.toString());
	}
}
