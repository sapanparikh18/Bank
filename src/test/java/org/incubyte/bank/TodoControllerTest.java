package org.incubyte.bank;

import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class TodoControllerTest {
  @Inject
  @Client("/")
  HttpClient httpClient;

  @Test
  public void create_a_todo_with_default_state_open() {
    // Arranged
    Todo todo = new Todo();
    todo.setDescription("Remember the milk");
    // Acted
    Todo savedTodo =
        httpClient.toBlocking().
                retrieve(HttpRequest.POST("todos/", todo),
                        Argument.of(Todo.class));
    //Assert
    Assertions.assertThat(savedTodo.isDone()).isFalse();
    Assertions.assertThat(savedTodo.getDescription()).isEqualTo("Remember the milk");
    Assertions.assertThat(savedTodo.getId()).isGreaterThan(0);
  }
}
