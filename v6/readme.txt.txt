This demonstration uses Openfeign, Eureka, Api-gateway, SpringCloud LoadBalancer, Resilience4J, Sleuth, Zipkin

Because MS architecture is distributed, tracing a specific request would be a challenge. 
In order to keep track of distributed tracing, SpringCloud offers Sleuth.
The idea is each request has a specific ID across all the MS and within a MS and by default Sleuth logs that on console with these 2 IDs and application name.

Steps to use Sleuth -
- Add appropriate dependency in each of the MS along with api-gateway.


[coupon-service,d729291a52a990e2,ca3d5ef41f737d68] // service name, trace id, span id
[order-service,d729291a52a990e2,6cc20869ccf143cb]

Trace ID is unique accross all MS for that request
span ID is unique within that MS
Sleuth is doing the above.


these logs are generated and we want to consolidate thema and show them at a central location in GUI form.
To do this we use Zipkin.


Steps to use Zipkin
- Download Zipkin server
- Run Zipkin server
- Add appropriate dependency in each of the MS along with api-gateway.
