Layered architecture is the most common architecture
The idea is to divide the app into diff comoponents with similar functionalities
And these are further grouped together under same name
As a result each layer performs specific role within the app
	Ex: 
		DAO layer
		Service Layer
		GUI etc.,
		
Package name -> Reverse order of the domain
eg: com.walmart.api.coupon.dao.impl

DTO vs DAO
 - DAO DB
 - DTO UI/Request

Coupling - Degree to which one layer knows about the other

One layer should talk to the other only via public interface of the other 
		
Here we are creating object and hence application class is tightly coupled with couponJpaDaoImpl
If you plan to switch to jdbc this line needs to be changed, which is classical ex of tight coupling
In java applications it is very common that two layers talking to each other which leads to tight coupling issue
To exactly solve this prob, spring was born

So the core principle of Spring is Dependency Injection (DI)
The idea is we ask spring container to objects for our app, which then can be injected at runtime depending on the requirement
every obj in the spring container is called as Bean, hence spring container is also called as Bean Container
Once the bean container is ready, we can ask for a specific bean type from container using getBean()

Step to use spring:

 - Add appropriate dependencies 
 - Create configuration classes/ specific modules
   
Though initially spring was written for dependency injection with time it was evolved and added many features, but to use these features we have to configurations.
And these configurations can be time consuming, error prone, repetitive, 

To solve this problem, spring team has come up with spring boot, which takes care of automatic configurations whenever possible.
 


