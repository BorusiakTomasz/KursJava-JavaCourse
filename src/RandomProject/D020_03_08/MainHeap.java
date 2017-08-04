package RandomProject.D020_03_08;

/**
 * Created by Miver on 2017-08-03.
 */
public class MainHeap {
    public static void main(String[] args) {
        System.out.println("Heap");

        HeapOnArray heap = new HeapOnArray(10);

        heap.push(2);
        heap.push(3);

        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }
}
