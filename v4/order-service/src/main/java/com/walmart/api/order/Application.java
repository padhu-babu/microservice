package com.walmart.api.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.order.dao.OrderDao;
import com.walmart.api.order.model.Order;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
	}

}
