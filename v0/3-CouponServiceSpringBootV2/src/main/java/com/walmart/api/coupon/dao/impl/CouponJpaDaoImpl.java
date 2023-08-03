package com.walmart.api.coupon.dao.impl;

import org.springframework.stereotype.Repository;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

// the below annotation is used on top of DAO classes hence DAO classes are also referred to as
// repository classes
@Repository
public class CouponJpaDaoImpl implements CouponDao{
	
	public Coupon saveCoupon(Coupon coupon) {
		// Use JPA to insert data to DB
		System.out.println("Coupon inserted in the DB using JPA");
		return coupon;
	}

}
