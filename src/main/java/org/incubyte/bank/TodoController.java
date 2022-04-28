package org.incubyte.bank;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/todos")
public class TodoController {
  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @Post("/")
  public Todo save(Todo todo) {
    return todoService.save(todo);
  }
}
