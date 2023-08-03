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
