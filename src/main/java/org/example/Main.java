package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Todo> todos = new ArrayList<>();
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Записать новую задачу");
            System.out.println("2. Показать задачи");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    makeNewTodo();
                    break;
                case 2:
                    showTodos();
                    break;
            }
        }
    }

    public static void makeNewTodo() {
        System.out.println("Введите название задачи");
        String name = sc.nextLine();
        System.out.println("Введите текст задачи");
        String text = sc.nextLine();
        Todo newTodo = new Todo(name, text, 0);
        System.out.println(newTodo.getName() + ": " + newTodo.getText() + ". [" + newTodo.getId() + "]");
        todos.add(newTodo);
        System.out.println("");
    }

    public static void showTodos() {
        System.out.println("Ваши задачи:");
        for (Todo todo : todos) {
            System.out.println(todo.getName() + ": " + todo.getText() + ". [" + todo.getId() + "]");
        }
        System.out.println("");
    }
}