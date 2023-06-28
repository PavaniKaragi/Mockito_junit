package com_in28minutes_data_Business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

import Com_in28minutes_business.TodoBusinessImpl;
import Com_in28minutes_data_api.TodoService;

public class TodoBusinessImplMockTest2 {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {

		// TodoService mockTodoService=mock(TodoService.class);
		// mockTodoService.retrieveTodos("parameter")).return("value");
		TodoService todoServiceMock = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		System.out.println(">>>>>>>>>>>>>>>" + filteredTodos.size());
		assertEquals(2, filteredTodos.size());
	}

}
