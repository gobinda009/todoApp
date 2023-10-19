package com.gobinda.todoApp.services;

import com.gobinda.todoApp.model.Todo;
import com.gobinda.todoApp.repo.ItodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    ItodoRepo itodoRepo;


    public String addtodo(Todo myTodo) {
        itodoRepo.save(myTodo);
        return "Todo Added !!!";
    }

    public List<Todo> getTodo() {
       return itodoRepo.findAll();
    }

    public String deleteTodobyId(Integer id) {
         itodoRepo.deleteById(id);
         return "Deleted Successfully";}

    public String setTodoStat(Integer id, boolean todoStatus) {
        Todo todo = itodoRepo.findFirstByTodoId(id);
        todo.setTodoStatus(todoStatus);
        itodoRepo.save(todo);
        return "updated";


    }








//    public String setTodoStatuss(Integer id, boolean todoStatus) {
//        Todo todo = itodoRepo.findFirstById(id);
//        if(todo!= null){
//            todo.setTodoStatus(todoStatus);
//            return "added successfully";
//        }
//        return "invalid id";
//    }


}
