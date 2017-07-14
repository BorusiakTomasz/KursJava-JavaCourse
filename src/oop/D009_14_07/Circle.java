package oop.D009_14_07;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-14.
 */
public class Circle {
    private float radius;

    public Circle() { radius = 0; }

    public void getRadius() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj promien");
        radius = sc.nextFloat();
    }

    public void showRadius() {
        System.out.println("Promien wynosi: " + radius);
    }

    public float area() {
        return 3.14f * radius * radius;
    }

    public float field() {
        return 2f * 3.14f * radius;
    }
}
