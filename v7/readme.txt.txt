This demonstration uses Openfeign, Eureka, Api-gateway, SpringCloud LoadBalancer, Resilience4J, Sleuth, Zipkin, Config server

In MS architecture each has its own config, also we need diff config for diff env
Changing these config by visiting application.properties file for that microservice is practially impossible, 
hence we would like to keep these config details at central location and separate from each microservice, then this can be managed by operations team
To exactly do this spring cloud offers config server

The idea is we are going to keep these configuration info at one location centrally (local file system or git repo)
By default config server would search for git repository

Config server would take the responsibility of reading the central configuration and exposing standard REST endpoints
Ex: http://localhost:8888/application/default


Steps to use config server:
- Create new spring boot project
- Add appropriate dependency (config-server, eureka-client)
- Enable config server by annotating application class with @EnableConfigServer
- Add appropriate properties


Once config server is setup we need to configure MS so that they can pick values from config server
To do this each MS must act as client to config server

Steps to define config server clients
- Add appropriate dependency in each MS
- Add appropriate properties