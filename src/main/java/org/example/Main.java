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
            System.out.println("3. Изменить статус задачи");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    makeNewTodo();
                    break;
                case 2:
                    showTodos();
                    break;
                case 3:
                    noteStatus();
                    break;
            }
        }
    }

    public static void makeNewTodo() {
        sc.nextLine();

        System.out.println("Введите название задачи");
        String name = sc.nextLine();
        System.out.println("Введите текст задачи");
        String text = sc.nextLine();
        int thisId = todos.size() + 1;
        Todo newTodo = new Todo(name, text, thisId, false);
        System.out.println(newTodo.getName() + ": " + newTodo.getText() + ". [" + newTodo.getId() + "]");
        todos.add(newTodo);
        System.out.println("");
    }

    public static void showTodos() {
        System.out.println("Ваши задачи:");
        for (Todo todo : todos) {
            if (todo.getStatus() == false) {
                System.out.println(todo.getName() + ": " + todo.getText() + ". [" + todo.getId() + "]");
            } else if(todo.getStatus() == true) {
                System.out.println(todo.getName() + ": " + todo.getText() + ". [" + todo.getId() + "], " + "\u2713");
            }
        }
        System.out.println("");
    }

    public static void noteStatus() {
        System.out.println("Выберите задачу для изменения статуса: ");
        System.out.println("");
        showTodos();
        int choice = sc.nextInt();
        for (Todo todo : todos) {
            if (todo.getId() == choice) {
                todo.noteStatus();
            } else {

            }
        }
        showTodos();
    }
}