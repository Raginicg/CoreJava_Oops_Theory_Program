package SpringBoot;

public class SpringDemo {
/**
 *
	1. What is Spring Boot?
	Spring Boot is an open-source Java-based framework used to create stand-alone, production-grade 
	Spring-based applications with minimal configuration.
	
	2. How does Spring Boot differ from the Spring Framework?
	Spring Boot simplifies the use of the Spring Framework by eliminating boilerplate code and configurations. It provides embedded servers, auto-configuration, and production-ready features.
	
	3. What are the advantages of using Spring Boot?
	Rapid development
	Embedded servers
	Minimal configuration
	Production-ready features
	Easy integration with Spring ecosystem
	4. What is a Spring Boot starter?
	A starter is a set of convenient dependency descriptors you can include in your application. For example, spring-boot-starter-web includes dependencies for building web applications.
	
	5. What is the purpose of application.properties or application.yml?
	These files are used to configure application settings such as server port, database connection, logging, etc.
	
	6. How do you create a Spring Boot application?
	You can use Spring Initializer, IDEs like IntelliJ or Eclipse, or manually set up dependencies and a main class with @SpringBootApplication.
	
	7. What is auto-configuration in Spring Boot?
	Auto-configuration automatically configures Spring application based on the dependencies present in the classpath.
	
	8. What is the use of @SpringBootApplication annotation?
	It is a convenience annotation that combines @Configuration, @EnableAutoConfiguration, and @ComponentScan.
	
	9. How do you run a Spring Boot application?
	You can run it using the main method, from the command line using Maven/Gradle, or by deploying the jar/war file.
	
	10. What is the default embedded server in Spring Boot?
	Apache Tomcat. 8080 port
	
	Intermediate Level
	1. How does Spring Boot handle dependency management?
	Spring Boot uses a parent POM that manages versions of common dependencies, reducing the need for manual version management.
	
	2. What is the role of @RestController and @RequestMapping?
	@RestController is used to create RESTful web services. @RequestMapping maps HTTP requests to handler methods.
	
	3. How do you connect Spring Boot to a database?
	By configuring datasource properties in application.properties and using Spring Data JPA or JDBC templates.
	
	4. What is Spring Data JPA and how is it used in Spring Boot?
	It simplifies data access by providing repository interfaces for CRUD operations without boilerplate code.
	
	5. How do you implement exception handling in Spring Boot?
	Using @ControllerAdvice and @ExceptionHandler annotations to handle exceptions globally or locally.
	
	6. What is Actuator in Spring Boot?
	Spring Boot Actuator provides production-ready features like monitoring, metrics, health checks, and more.
	
	7. How do you secure a Spring Boot application?
	Using Spring Security to configure authentication and authorization mechanisms.
	
	8. What is the difference between @Component, @Service, and @Repository?
	@Component: Generic stereotype
	@Service: For service layer
	@Repository: For persistence layer
	9. How do you configure logging in Spring Boot?
	By using application.properties or logback.xml to set logging levels and appenders.
	
	10. What is the use of CommandLineRunner and ApplicationRunner?
	They are used to execute code after the Spring Boot application starts.
	
	Advanced Level
	1. How does Spring Boot achieve auto-configuration internally?
	It uses @EnableAutoConfiguration and spring.factories file to load configuration classes conditionally.
	
	2. What are custom starters in Spring Boot?
	User-defined starter dependencies that bundle common configurations and dependencies.
	
	3. How do you create a custom auto-configuration?
	Create a configuration class annotated with @Configuration and @Conditional, and register it in spring.factories.
	
	4. How do you handle transactions in Spring Boot?
	Using @Transactional annotation to manage transactions declaratively.
	
	5. What is the difference between @EnableAutoConfiguration and @SpringBootApplication?
	@SpringBootApplication includes @EnableAutoConfiguration, @Configuration, and @ComponentScan.
	
	6. How do you implement asynchronous processing in Spring Boot?
	Using @EnableAsync and @Async annotations.
	
	7. How do you use profiles in Spring Boot for different environments?
	Define properties in application-{profile}.properties and activate profiles using spring.profiles.active.
	
	8. How do you monitor and manage a Spring Boot application in production?
	Using Spring Boot Actuator, external monitoring tools, and exposing management endpoints.
	
	9. What are some best practices for Spring Boot microservices?
	Use API gateways
	Centralized configuration
	Service discovery
	Resilience patterns
	Containerization
	10. How do you implement caching in Spring Boot?
	Using @EnableCaching and @Cacheable annotations with a caching provider like EhCache or Redis.
	 */
}
