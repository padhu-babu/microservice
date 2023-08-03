Spring Data JPA 

- Add dependency
- Write appropriate properties in application.properties file
- Annotate Entity/Model class with appropriate JPA annotation
- Write an Interface extend this interface from JPArepository Interface

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
Reason: Failed to determine a suitable driver class

Spring data jpa gives built in interface like JPARepository which we need to extend to our own interface.
This interface gives us built in methods for CRUD operations

We don't have to declare/write implementations to these CRUD methods
