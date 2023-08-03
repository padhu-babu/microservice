package com.walmart.api.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		CouponDao couponDao = container.getBean(CouponDao.class);

		// write switch case with five options
		// 1. create
		// 2. findById
		// 3. findAll
		// 4. update
		// 5. delete

		Coupon coupon2 = new Coupon();

		coupon2.setCouponCode("c2");
		coupon2.setDiscount(70);
		coupon2.setId("2");

		Integer option = 1;

		switch (option) {
		case 1:
			System.out.println("Case 1 : " + couponDao.save(coupon2));
			break;
		case 2:
			System.out.println("Case 2 : " + couponDao.findById("2"));
			break;
		case 3:
			System.out.println("Case 3 : ");
			couponDao.findAll().stream().forEach(couponParm -> {
				System.out.println(couponParm);
			});
			break;
		case 4:
			coupon2.setDiscount(75);
			System.out.println("Case 4 : " + couponDao.save(coupon2));
			break;
		case 5:
			couponDao.delete(coupon2);
			System.out.println("Case 5 : After deleting the values in db");
			couponDao.findAll().stream().forEach(couponParm -> {
				System.out.println(couponParm);
			});
			break;
		default:
			System.out.println("No value specified!");
			break;
		}
	}

}
