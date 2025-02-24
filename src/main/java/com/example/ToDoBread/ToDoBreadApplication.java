/* 
The class solely serves as the entry point for the Spring Boot application, 
with the main method invoking SpringApplication.run to launch the application. 
This refactoring makes the class more focused and 
aligns it with the single responsibility principle, 
as it now only handles the application startup logic. 
*/

package com.example.ToDoBread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoBreadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToDoBreadApplication.class, args);
    }
}