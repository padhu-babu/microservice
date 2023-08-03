Web application is meant for human consumption
Web service is meant for application consumption

The most common format of exchanging data is JSON

To create a REST ful web services follow:
- Add the dependency (spring-boot-starter-web)
	- pom.xml -> spring -> Add starters
- Create a new class
- Annotate the class with @RestController
- Define methods and annotate with appropriate annotation


Monolithic Application:

- It is old style of building apps
- If all the functionalities of the project exists in the single code base, then it is monolithic application
- It is a big single code base application
- It is deployed as a single unit

Drawbacks of monolithic application:
- It becomes too large in size with time
- Even for a small change we need to re deploy the whole application
- Scaling up/down is difficult in monoliths
- difficult to adopt new technology which is well suited for a particular functionality


In order to overcome this problem we can divide our app into multiple small independent funtionalities based on business

Such application is called as microservices application

Each microservice is developed and deployed independently on separate hardware
One microservice must perform one single specifc job
Scaling up/down of a specific miroservice is possible
A change in one microservice need redeployment of that service, other microservices are unaffected
We are free to choose appropriate tech for each service

Important features of microservice
- Small autonomous services (based on business functionalities) working together
- Developed and deployed independently
- They are cloud enabled


Microservices communication:
- Deployed on separate hardware and very common that they can communicate
- Typically done using REST calls
- Traditionally done using RestTemplate class given by Spring
- Using RestTemplate to make rest calls is error prone and time consuming, hence we want to make rest calls easier
- To exactly solve this problem, spring cloud offers OpenFeign library
- OpenFeign is used to make rest calls declarative


Steps to use OpenFeign:
- Add appropriate dependency (OpenFeign)
- Create an interface, and annotate with @FeignClient
- Add appropriate attributes in FeignClient annotation
- Declare methods in OpenFeign
	- Signature of method must match with remote methods we are interested in calling (But method name can be changed)
	- Annotate these methods with exact same annotation of required method
	- Annotate main application class with @EnableFeignClients to use OpenFeign
