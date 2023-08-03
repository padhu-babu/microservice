package com.walmart.api.order.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.walmart.api.order.rest.response.CouponResponse;

@FeignClient(name="coupon-service")// The name here mentioned is logical name of coupon service as it is registered with eureka
public interface CouponServiceFeignClient {
	
	@GetMapping("/api/coupon/{id}")
	public CouponResponse findCouponById(@PathVariable String id);
	
	@GetMapping("/api/coupon/code/{couponCode}")
	public CouponResponse findCouponByCouponCode(@PathVariable String couponCode);
	
}
