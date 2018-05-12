package com.yame.ubi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.yame.ubi.Application;
import com.yame.ubi.model.ObdImmediate;
import com.yame.ubi.model.ObdImmediateService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class MongoPluginTest {

	@Autowired
	ObdImmediateService obdImmediateService;
	
	@Test
	public void testGet() {
		ObdImmediate obdImmediates = obdImmediateService.getById(451L);
		System.out.println(JSON.toJSONString(obdImmediates));
	}

}
