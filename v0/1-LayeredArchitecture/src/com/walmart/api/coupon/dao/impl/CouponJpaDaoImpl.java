package com.walmart.api.coupon.dao.impl;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

public class CouponJpaDaoImpl implements CouponDao{
	
	public Coupon saveCoupon(Coupon coupon) {
		// Use JPA to insert data to DB
		System.out.println("Coupon inserted in the DB using JPA");
		return coupon;
	}

}
