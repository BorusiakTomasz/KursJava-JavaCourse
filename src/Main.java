import oop.D013_20_07.inheritance.Person;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.println("Podaj imie");
        String name = sc.next();

        System.out.println("Podaj nazwisko");
        String surName = sc.next();

        System.out.println("Podaj wiek");
        int age = sc.nextInt();

        p.setName(name);
        p.setSurName(surName);
        p.setAge(age);

        System.out.println("Czesc, jestem " + p.getName() + " " + p.getSurName() + " i mam " + p.getAge() + "lat.");
    }
}
