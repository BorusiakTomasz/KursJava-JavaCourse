package oop.D008_13_07;

/**
 * Created by Miver on 2017-07-13.
 */
public class Point {
    private String name;
    private float x;
    private float y;

    public Point() {
        this.name = null;
        this.x = 0;
        this.y = 0;
    }

    public void getPoint(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("Punkt " + name + " [" + x + ", " + y + "]");
    }

    public double distanceFromOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }
}
