package programingLvlLow.D020_03_08;

/**
 * Created by Miver on 2017-08-03.
 */
public class MainQueue {
    public static void main(String[] args) {
        System.out.println("Queue");

        QueueOnArray queue = new QueueOnArray(10);

        queue.add(3);
        queue.add(5);
        queue.add(1);

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
    }
}
