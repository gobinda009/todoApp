package com.gobinda.todoApp.controller;

import com.gobinda.todoApp.model.Todo;
import com.gobinda.todoApp.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    //create todos -Post APIs



    @PostMapping("todo")
    public String addTodo(@RequestBody Todo myTodo)
    {
        return todoService.addtodo(myTodo);
    }

    @GetMapping("todos")
    public List<Todo> getTodo(){
        return todoService.getTodo();
    }

    @DeleteMapping("todo/id/{id}")
    public String removeTodoById(@PathVariable Integer id) {
        return todoService.deleteTodobyId(id);
    }

    @PutMapping("todo/id/{id}/status/{todoStatus}")
    public String setTodoStatusById(@PathVariable Integer id, @PathVariable boolean todoStatus)
    {
        return todoService.setTodoStat(id,todoStatus);
    }

}

