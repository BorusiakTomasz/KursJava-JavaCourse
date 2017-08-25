package objectOrientedPrograming.D012_19_07;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-19.
 */
public class Student {
    private String name;
    private String surName;
    private int age;
    private int indexNumber;
    private int yearOfStudy;

    public Student() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imie");
        setName(sc.next());

        System.out.println("Podaj nazwisko");
        setSurName(sc.next());

        System.out.println("Podaj wiek");
        setAge(sc.nextInt());

        System.out.println("Podaj numer indexu");
        setIndexNumber(sc.nextInt());

        System.out.println("Podaj rok studiow");
        setYearOfStudy(sc.nextInt());
    }

    public Student(String name, String surName, int age, int indexNumber, int yearOfStudy) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurName() { return surName; }

    public void setSurName(String surName) { this.surName = surName; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public int getIndexNumber() { return indexNumber; }

    public void setIndexNumber(int indexNumber) { this.indexNumber = indexNumber; }

    public int getYearOfStudy() { return yearOfStudy; }

    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    public void printStudent() {
        System.out.println(getName());
        System.out.println(getSurName());
        System.out.println(getAge());
        System.out.println(getIndexNumber());
        System.out.println(getYearOfStudy());
    }
}
