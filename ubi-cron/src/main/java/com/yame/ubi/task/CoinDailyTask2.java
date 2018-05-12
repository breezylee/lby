package com.yame.ubi.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.yame.ubi.dao.MyBeanDao;

@Component
public class CoinDailyTask2 {

	@Autowired
	private MyBeanDao myBeanDao;
	
	int i = 1;
	@Scheduled(cron="0/1 * * * * ?")
	public void run() {
		System.out.println(Thread.currentThread().getName() + ",,,, task2");
		
		myBeanDao.update(1, i);
		i++;
	}
}
