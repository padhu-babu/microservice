Circuit breaker:

this pattern is used to prevent cascading failures because of network connectivity issue, timeout issue, service unavailability issue 
Circuit is in three possible states
- Closed state -- which means calls to MS are allowed, this is a desirable and default state
- Open state -- In this state call is not allowed to remote MS, this is not desirable state.
- HAlf open -- In this state only few calls are allowed to remote MS

Steps for resilience4j:
- Add appropriate dependency (resilience4j)
- Add appropriate properties in application.properties
- 

Because MS need to communicate with each other via REST call, and REST calls might fail it is possible for cascading failure

Inorder to avoid this cascading failures we must make sure that our system is resilient for failures

Exactly to do this spring cloud offers a library known as resilience4j
(NOTE: In old versions of cloud hystrix was used)
(NOTE: In old versions of spring cloud for load balancing, ribbon was used)
(NOTE: In old versions of spring cloud zuul was used instead of API Gateway)

