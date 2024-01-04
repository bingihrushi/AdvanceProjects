package com.todo.dao;

import java.sql.SQLException;
import java.util.List;

import com.todo.model.Todo;

public interface TodoDAO {
	
	void insertTodo(Todo todo) throws SQLException;

	 Todo selectTodo(int id);

	 List<Todo> selectAllTodos();

	 boolean deleteTodo(int id) throws SQLException;

	 boolean updateTodo(Todo todo) throws SQLException;
}
