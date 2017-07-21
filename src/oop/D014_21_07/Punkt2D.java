package oop.D014_21_07;

/**
 * Created by Miver on 2017-07-21.
 */
public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

    public void showAll() {
        System.out.println(x + ", " + y);
    }
}
