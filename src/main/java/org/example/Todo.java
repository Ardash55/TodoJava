package org.example;

public class Todo {
    private String name;
    private String text;
    private int id;

    Todo (String name, String text, int id) {
        this.name = name;
        this.text = text;
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    String getText() {
        return this.text;
    }

    int getId() {
        return this.id;
    }
}
