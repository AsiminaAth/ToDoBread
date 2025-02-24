/*
the ToDoBreadController class provides RESTful endpoints for retrieving and 
creating Todo entities, leveraging the capabilities of Spring Boot and Spring Data JPA 
to handle the underlying database operations. 
*/

package com.example.ToDoBread;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoBreadController {
    private final ToDoRepository repository;

    public ToDoBreadController(ToDoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return (List<Todo>) repository.findAll();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return repository.save(todo);
    }
}

/*
The ToDoBreadController class has a dependency on the ToDoRepository interface, 
which is injected via the constructor. This dependency injection ensures that the controller 
can interact with the repository to perform CRUD operations on Todo entities.

The class defines two endpoint methods:

getTodos(): This method is mapped to HTTP GET requests at the /todos URL. 
It uses the @GetMapping annotation and returns a list of all Todo entities by 
calling the findAll() method of the ToDoRepository. The returned list is cast to List<Todo>.

createTodo(@RequestBody Todo todo): This method is mapped to HTTP POST requests 
at the /todos URL. It uses the @PostMapping annotation and accepts a Todo object 
in the request body, indicated by the @RequestBody annotation. 
The method saves the provided Todo entity to the database by calling the save() method 
of the ToDoRepository and returns the saved entity.
 */