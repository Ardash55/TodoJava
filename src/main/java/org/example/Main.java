package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Меню:");
        System.out.println("1. Записать новую задачу");
        System.out.println("2. Показать задачи");
        int action = sc.nextInt();
        switch (action) {
            case 1:
                makeNewTodo();
                break;
        }
    }

    public static void makeNewTodo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название задачи");
        String name = sc.nextLine();
        System.out.println("Введите текст задачи");
        String text = sc.nextLine();
        Todo newTodo = new Todo(name, text, 0);
        System.out.println(newTodo.getName() + ": " + newTodo.getText() + ". [" + newTodo.getId() + "]");
    }
}