package Com_in28minutes_business;

import java.util.ArrayList;
//import com_in28minutes_data_Business.TodoBusinessImplStubTest;
import java.util.List;

import Com_in28minutes_data_api.TodoService;

//TodoBusinessImpl SUT(System Under Test)
//TodoService is dependency

public class TodoBusinessImpl {
	private TodoService todoservice;

	public TodoBusinessImpl(TodoService todoservice) {
		// super();
		this.todoservice = todoservice;// manually generating a constructor for todoservice
	}

	public List<String> retrieveTodosRelatedToSpring(String user)// method to call todoservice
	{

		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoservice.retrieveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}

		}
		return filteredTodos;
	}
}
