package oop.D012_19_07;

/**
 * Created by Miver on 2017-07-19.
 */
public class Author {
    private String name;
    private String surName;
    private int age;

    public Author (String name) {
        this.name = name;
    }

    public Author (String name, String surName) {
        this(name);
        this.surName = surName;
    }

    public Author(String name, String surName, int age) {
        this(name, surName);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
