# Spring annotation configuration

Now, you need to configure Spring-application configuration mechanisms using annotations. To do so, use the
configuration class marked as @Configuration. Inside this class, you need to describe beans for connecting to DataSource
DB using @Bean annotation. As in the previous task, connection data shall be located inside db.properties file. You also
need to make sure context.xml is not present.

Also implement UsersService/UsersServiceImpl interface/class pair with a dependency on UsersRepository declared in it.
Insertion of correct repository bean shall be implemented using @Autowired annotation (similarly, you need to bind
DataSource inside repositories). Collisions in automatic binding shall be resolved with @Qualifier annotation.

Beans for UsersService and UsersRepository shall be defined using @Component annotation.

In UsersServiceImpl, implement String signUp(String email)method that registers a new user and saves its details in DB.
This method returns a temporary password assigned to the user by the system (this information should also be saved in
the database).

To check if your service works correctly, implement an integration test for UsersServiceImp using an in-memory
database (H2 or HSQLDB). The context configuration for test environment (DataSource for in-memory database) shall be
described in a separate TestApplicatoinConfig class. This test shall check if a temporary password has been returned in
signUp method.
