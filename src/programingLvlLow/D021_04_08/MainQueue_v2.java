package programingLvlLow.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class MainQueue_v2 {
    public static void main(String[] args) {
        QueueElement queue = new QueueElement();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}
