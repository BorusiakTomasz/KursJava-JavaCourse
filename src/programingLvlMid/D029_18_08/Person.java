package programingLvlMid.D029_18_08;

/**
 * Created by Miver on 2017-08-18.
 * @author Miver
 * @since 1.2
 */
public class Person {
    private String name;
    private String surName;
    private int age;

    /** No args constructor to create new person */
    public Person() {}

    /** All args constructor for new person */
    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
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

    /**
     * @return void
     * @throws Exception
     * @param age define age of person
     */
    public void setAge(int age) throws Exception {
        if (age < 0)
            throw new Exception();
        this.age = age;
    }
}
