import oop.D009_14_07.Circle;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.getRadius();
        System.out.println("Pole kola wynosi: " + circle.area());
        System.out.println("Obwod kola wynosi: " + circle.field());
        circle.showRadius();
    }
}
