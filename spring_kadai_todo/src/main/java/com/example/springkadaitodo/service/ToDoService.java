package com.example.springkadaitodo.service;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;


@Service
public class ToDoService {
	private final ToDoRepository todoRepository;
	
	public ToDoServise(ToDoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	public List<ToDo> getAllUsers(){
		return todoRepository.findAll();
	}

}
