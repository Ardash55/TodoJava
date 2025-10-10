package org.example;

public class Todo {
    private String name;
    private String text;
    private int id;
    private boolean status;

    Todo (String name, String text, int id, boolean status) {
        this.name = name;
        this.text = text;
        this.id = id;
        this.status = status;
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

    boolean getStatus() {return this.status;}

    public void noteStatus() {
        if (this.getStatus() == false) {
            this.status = true;
        } else if(this.getStatus() == true) {
            this.status = false;
        }
    }

    public void editText(String newText) {
        this.text = newText;
    }

    public void editName(String newName) {
        this.name = newName;
    }
}
