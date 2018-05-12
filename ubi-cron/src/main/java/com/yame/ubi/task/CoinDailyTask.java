package com.yame.ubi.task;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.yame.ubi.dao.MyBeanDao;

@Component
public class CoinDailyTask {

	@Autowired
	private MyBeanDao myBeanDao;
	
	@Scheduled(cron="0/1 * * * * ?")
	public void run() {
		System.out.println(Thread.currentThread().getName() + ",,,, task1");
		 Map<String, Object> map = myBeanDao.getRepacket(1);
		 System.out.println(JSON.toJSONString(map));
	}
	
}
