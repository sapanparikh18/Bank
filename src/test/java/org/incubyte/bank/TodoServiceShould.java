package org.incubyte.bank;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TodoServiceShould {
  @Mock TodoRepository todoRepository;

  @Test
  void invoke_repo_to_save_todo() {
    // Arrange
    TodoService todoService = new TodoService(todoRepository);
    // Act
    Todo todo = new Todo();
    todoService.save(todo);

    // assert
    verify(todoRepository).save(todo);
  }
}
