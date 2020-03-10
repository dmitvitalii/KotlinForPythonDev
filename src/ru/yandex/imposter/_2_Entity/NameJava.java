package ru.yandex.imposter._2_Entity;

public class NameJava {
    private String title = "Mr";
    private String name = "John";

    public void setTitle(String title) {
        System.out.println("setTitle says: " + title);
        this.title = title;
    }

    public void setName(String name) {
        System.out.println("setName says: " + name);
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return title + " " + name;
    }

}

