package com.walmart.api.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.api.order.dao.OrderDao;
import com.walmart.api.order.feign.client.CouponServiceFeignClient;
import com.walmart.api.order.model.Order;
import com.walmart.api.order.rest.response.CouponResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class OrderRestController {
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private CouponServiceFeignClient couponServiceFeignClient;
	
	
	@Retry(name = "cs")
	@CircuitBreaker(name = "cs", fallbackMethod = "placeOrderFallback")
	@PostMapping("/api/order")
	public Order placeOrder(@RequestBody Order order) {
		System.out.println("In place order");
		
		// Fetch coupon code from order
		String couponCode = order.getCouponCode();
		
		// From coupon code fetch applicable discount
		// to fetch discount we must call coupon service 
		// And this is a rest call
		CouponResponse couponResponse = this.couponServiceFeignClient.findCouponByCouponCode(couponCode);
		Integer discount = couponResponse.getDiscount();
		System.out.println("Got response as " + couponResponse);
		
		// Apply the discount to order obj
		order.setPrice(order.getPrice() - discount);
		
		// Save the order obj
		order = orderDao.save(order);
		
		// return the order obj
		return order;
	}
	
	public Order placeOrderFallback(Order order, Throwable t) {
		System.out.println("In fallback for place order");
		return order;
	}
	
}
