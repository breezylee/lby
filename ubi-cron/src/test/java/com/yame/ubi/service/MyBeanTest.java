package com.yame.ubi.service;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.yame.ubi.Application;
import com.yame.ubi.dao.MyBeanDao;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class MyBeanTest {

	 @Autowired
	 private MyBeanDao myBeanDao;

	 @Test
	 public void testGet() throws Exception {
		 Map<String, Object> map = myBeanDao.getRepacket(1);
		 System.out.println(JSON.toJSONString(map));
	 }
	 
	 @Test
	 public void testUpdateAndBind() {
		 myBeanDao.update(1, 99);
		 Map<String, Object> map = myBeanDao.getRepacket(1);
		 System.out.println(JSON.toJSONString(map));
	 }
	 
}
