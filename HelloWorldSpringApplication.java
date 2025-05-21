package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple Spring Boot application demonstrating similar functionality to the
 * original Struts 2 example (example2.java).
 * This application uses a REST controller to provide a greeting.
 *
 * To compile and run this (using a build tool like Maven or Gradle):
 * 1. Create a Spring Boot project (e.g., via start.spring.io).
 * 2. Add this file to your project (e.g., src/main/java/com/example/springbootdemo/HelloWorldSpringApplication.java).
 * 3. Ensure you have the `spring-boot-starter-web` dependency in your `pom.xml` or `build.gradle`.
 *    Example Maven dependency:
 *    <dependency>
 *        <groupId>org.springframework.boot</groupId>
 *        <artifactId>spring-boot-starter-web</artifactId>
 *    </dependency>
 * 4. Run the `main` method in `HelloWorldSpringApplication`.
 * 5. Access the endpoints in your browser or using curl:
 *    - http://localhost:8080/hello
 *    - http://localhost:8080/hello?name=Alice
 */
@SpringBootApplication
public class HelloWorldSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApplication.class, args);
        System.out.println("\nSpring Boot application started successfully!");
        System.out.println("You can access the greeting endpoints at:");
        System.out.println("  - http://localhost:8080/hello");
        System.out.println("  - http://localhost:8080/hello?name=YourNameHere");
    }

    /**
     * A simple REST Controller to handle greeting requests.
     * This replaces the Struts 2 Action class functionality.
     */
    @RestController
    public static class HelloWorldController {

        private static final String DEFAULT_GREETING_SPRING = "Hello, mysterious guest from Spring Boot!";
        private static final String CUSTOM_GREETING_SPRING_FORMAT = "Hello, %s! Welcome to a Spring Boot example.";

        /**
         * Handles GET requests to "/hello".
         * It accepts an optional 'name' request parameter.
         *
         * @param name The name to include in the greeting (optional). If not provided, a default greeting is used.
         * @return A personalized greeting string.
         */
        @GetMapping("/hello")
        public String greet(@RequestParam(name = "name", required = false) String name) {
            if (name == null || name.trim().isEmpty()) {
                return DEFAULT_GREETING_SPRING;
            } else {
                return String.format(CUSTOM_GREETING_SPRING_FORMAT, name);
            }
        }
    }
}