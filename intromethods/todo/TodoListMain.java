package intromethods.todo;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("feladat1");
        todoList.addTodo("feladat2");


        System.out.println(todoList);

        todoList.finishTodos("feladat1");

        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("feladat1; feladat2"));

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}
