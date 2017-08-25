package objectOrientedPrograming.D013_20_07.inheritance;

/**
 * Created by Miver on 2017-07-20.
 */
public class Person {
    private String name;
    private String surName;
    private int age;
    private int pesel;

    public Person() {}

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

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Jestem osoba i nazywam sie: " + name + " " + surName + " i mam " + age + "lat.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) //czy te obiekty sa w tym samym obszarze pamieci
            return true;
        boolean czyRowne = false;
        if (obj instanceof Person) {
            Person osoba = (Person) obj;
            czyRowne = this.pesel == osoba.pesel;
        }
        return czyRowne;
    }
}
