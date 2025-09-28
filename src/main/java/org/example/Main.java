package org.example;

public class Main {
    public static void main(String[] args) {
        Todo firstTodo = new Todo("Первая заметка", "Текст заметки", 1);

        System.out.println(firstTodo.getName() + ": " + firstTodo.getText() + ". [" + firstTodo.getId() + "]");
    }
}