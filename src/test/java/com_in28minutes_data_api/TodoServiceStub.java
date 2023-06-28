package com_in28minutes_data_api;

import java.util.Arrays;
import java.util.List;

import Com_in28minutes_data_api.TodoService;

public class TodoServiceStub implements TodoService {
	// Dynamic condition
	// Service definition
	// to avoid this we use mocks

	public List<String> retrieveTodos(String user) {

		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to DANCE");
	}
}
