package oop.D009_14_07;

/**
 * Created by Miver on 2017-07-14.
 */
public class Circle {
    private double radius;

    public void setRadius(double r) {
        if(r <= 0)
            System.out.println("Promien mniejszy od 0");
        else
            this.radius = r;
    }

    public void getRadius() { System.out.println("Promien wynosi: " + radius); }

    public double Area() { return Math.PI * radius * radius; }

    public double Circumference() { return 2 * Math.PI * radius; }
}
