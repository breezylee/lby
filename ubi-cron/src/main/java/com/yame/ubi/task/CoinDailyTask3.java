package com.yame.ubi.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CoinDailyTask3 {

	@Scheduled(cron="0/1 * * * * ?")
	public void run() {
		System.out.println(Thread.currentThread().getName() + ",,,, task3");
	}
	
}
