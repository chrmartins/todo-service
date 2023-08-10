package br.com.cmts.todoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cmts.todoservice.entity.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Long>{
    
}
