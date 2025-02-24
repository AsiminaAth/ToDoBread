/*
this Todo entity class serves as a fundamental part of the application's data model, 
representing to-do items and their properties in the database.
*/

package com.example.ToDoBread;

import org.springframework.data.repository.CrudRepository;
// import com.example.ToDoBread.Todo;

public interface ToDoRepository extends CrudRepository<Todo, Long> {
} 

/*
defines an entity class named Todo for a Java Spring Boot application. 
This class is part of the com.example.ToDoBread package and is annotated with @Entity, 
indicating that it maps to a database table. 
Entity classes are blueprints for creating objects that represent rows in the corresponding 
database table.

The Todo class uses the Jakarta Persistence API (JPA) annotations to define its 
properties and their mappings to the database columns. 
The @Id annotation marks the id field as the primary key of the entity. 
The @GeneratedValue(strategy = GenerationType.IDENTITY) annotation specifies that the 
id should be generated automatically by the database using an identity column, 
which is a common strategy for primary key generation.

The class also includes two additional fields: task and status, 
which are intended to store the details of a to-do item. 
These fields will be mapped to corresponding columns in the database table.

Additionally, the class is annotated with @Data from the Lombok library. 
This annotation generates boilerplate code such as getters, setters, toString(), 
equals(), and hashCode() methods, reducing the amount of code that needs to be written manually.
 */