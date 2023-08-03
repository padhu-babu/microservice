package com.walmart.api.order.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.walmart.api.order.rest.response.CouponResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(name="api-gateway")// The name here mentioned is logical name of coupon service as it is registered with eureka
public interface CouponServiceFeignClient {
	
	@GetMapping("coupon-service/api/coupon/{id}")
	public CouponResponse findCouponById(@PathVariable String id);
	
	@CircuitBreaker(name="cs", fallbackMethod = "findCouponByCouponCodeFallback")
	@GetMapping("coupon-service/api/coupon/code/{couponCode}")
	public CouponResponse findCouponByCouponCode(@PathVariable String couponCode);
	
	default CouponResponse findCouponByCouponCodeFallback(@PathVariable String couponCode, Throwable t) {
		System.out.println("In fallback method");
		CouponResponse c = new CouponResponse();
		c.setDiscount(0);
		return c;
	}
	
}
