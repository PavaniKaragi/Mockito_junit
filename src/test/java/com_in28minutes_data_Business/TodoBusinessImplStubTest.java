package com_in28minutes_data_Business;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;

import Com_in28minutes_business.TodoBusinessImpl;
import Com_in28minutes_data_api.TodoService;
import com_in28minutes_data_api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertNotEquals(5, filteredTodos.size());
	}

	/*
	 * public void testRetrieveTodosRelatedToSpring_usingAStub2() { TodoService
	 * todoServiceStub = new TodoServiceStub(); TodoBusinessImpl todoBusinessImpl =
	 * new TodoBusinessImpl(todoServiceStub); List<String> filteredTodos =
	 * todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy1"); assertEquals(0,
	 * filteredTodos.size()); }
	 */
}
