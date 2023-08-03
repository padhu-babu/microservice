Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.walmart.api.coupon.dao.CouponDao' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1175)
	at com.walmart.api.coupon.Application.main(Application.java:22)

Above exception happens when a specific bean type is not present in the spring container

In order to register classes as spring bean, we must be annotating them with stereotype annotation, based on the role they are performing



Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.walmart.api.coupon.dao.CouponDao' available: expected single matching bean but found 2: couponDaoImpl,couponJpaDaoImpl
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1273)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:494)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:349)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1175)
	at com.walmart.api.coupon.Application.main(Application.java:22)

Above exception occurs when we have more than one bean of same type present in the spring container, and we are trying to get that.

In order to resolve this issue we have to use bean ID
Ever bean in spring container have unique ID associated with it, this ID can be used to get that bean specifically



