package com.walmart.api.order.rest.response;

public class CouponResponse {

	private String couponCode;
	private Integer discount;

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "CouponResponse [couponCode=" + couponCode + ", discount=" + discount + "]";
	}

}
