package com.yame.ubi.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	public static final String QUEUE_NAME = "OIL_AWARD_QUEUE";
	public static final String EXCHANGE_NAME = "OIL_AWARD_EXCHANGE";
	
	@Bean(name = QUEUE_NAME)
	public Queue queueMessage() {
		return new Queue(QUEUE_NAME);
	}

	@Bean
	public FanoutExchange exchange() {
		return new FanoutExchange(EXCHANGE_NAME);
	}
	
	@Bean
	Binding bindingExchangeMessage(@Qualifier(QUEUE_NAME) Queue queueMessage, FanoutExchange exchange) {
		return BindingBuilder.bind(queueMessage).to(exchange);
	}

}
