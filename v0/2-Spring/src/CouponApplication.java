import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.dao.impl.CouponJpaDaoImpl;
import com.walmart.api.coupon.model.Coupon;

public class CouponApplication {

	public static void main(String[] args) {
		System.out.println("In coupon app");
		Coupon coupon = new Coupon();
		coupon.setCouponCode("c1");
		coupon.setDiscount(100);
		coupon.setId("1");
		
		CouponDao couponDao = new CouponJpaDaoImpl(); // Here we are creating object and hence application class is tightly coupled with couponJpaDaoImpl
		// If you plan to switch to jdbc this line needs to be changed, which is classical ex of tight coupling
		// In java applications it is very common that two layers talking to each other which leads to tight coupling issue
		// To exactly solve this prob, spring was born
		
		couponDao.saveCoupon(coupon);
	}

}
