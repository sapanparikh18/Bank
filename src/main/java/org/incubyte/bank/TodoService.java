package org.incubyte.bank;

import jakarta.inject.Singleton;

@Singleton
public class TodoService {
  private final TodoRepository todoRepository;

  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public Todo save(Todo todo) {
    return todoRepository.save(todo);
  }

  public void getByStatus(String open) {
    throw new UnsupportedOperationException();
  }
}
