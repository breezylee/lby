package com.yame.ubi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yame.ubi.Application;
import com.yame.ubi.model.Coin;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class CoinPusherTest {

	 @Autowired
	 private CoinPusher coinPusher;

	 @Test
	 public void testPush() throws Exception {
		 Coin coin = new Coin();
		 coin.setCoin(10);
		 coin.setIdentification("UBI-123456");
		 coin.setMemo("ubi test");
		 coin.setMobile("1353998449");
		 coinPusher.send(coin);
	 }
}
