package org.incubyte.bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TodoControllerShould {
    @Mock
    TodoService todoService;

    @Test
    public void invoke_service_to_save_todo(){
        //Arrange:
        TodoController todoController = new TodoController(todoService);
        Todo todo = new Todo();
        //Act:
        Todo savedTodo = todoController.save(todo);
        //Assert:
        verify(todoService).save(todo);

    }
}
