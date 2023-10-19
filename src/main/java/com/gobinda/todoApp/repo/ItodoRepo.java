package com.gobinda.todoApp.repo;

import com.gobinda.todoApp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface ItodoRepo extends JpaRepository<Todo,Integer> {


    Todo findFirstByTodoId(Integer id);


//    void findByIdSetTodoStatus(Integer id, boolean flag);
}
