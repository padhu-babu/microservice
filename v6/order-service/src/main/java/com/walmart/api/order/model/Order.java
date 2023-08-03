package com.walmart.api.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_entity")
public class Order {
	
	@Id
	private String id;
	private String couponCode;
	private String item;
	private Integer price;
	
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", couponCode=" + couponCode + ", item=" + item + "]";
	}
	
}
