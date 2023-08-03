package com.walmart.api.coupon.dao.impl;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

public class CouponDaoImpl implements CouponDao{

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		// Talk to DB and insert record to DB
		System.out.println("Coupon inserted in the DB using JDBC");
		return coupon;
	}
	
}
