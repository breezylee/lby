package com.yame.ubi.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.yame.ubi.config.RabbitMqConfig;
import com.yame.ubi.model.Coin;

@Component
public class CoinPusher {

	@Autowired
	private AmqpTemplate rabbitmqTemplate;
	
	public void send(Coin coin) {
		String str = JSON.toJSONString(coin);
		rabbitmqTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.QUEUE_NAME, str.getBytes());
	}
	
}
