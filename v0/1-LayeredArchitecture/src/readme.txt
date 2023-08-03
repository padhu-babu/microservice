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
		