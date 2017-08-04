package RandomProject.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class MainHeap_v2 {
    public static void main(String[] args) {
        HeapElement heap = new HeapElement();

        heap.push(3);
        heap.push(5);
        heap.push(1);

        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }
}
