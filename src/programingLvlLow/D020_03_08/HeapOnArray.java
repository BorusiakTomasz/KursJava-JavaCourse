package programingLvlLow.D020_03_08;

/**
 * Created by Miver on 2017-08-03.
 */
public class HeapOnArray {
    private int[] heap;
    private int counter;

    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void push(int el) {
        if (this.heap.length > this.counter) {
            this.heap[this.counter] = el;
            this.counter++;
        } else {
            System.out.println("Heap is full");
        }
    }

    public int pop() {
        if (counter > 0) {
            this.counter--;
            return this.heap[this.counter];
        } else {
            System.out.println("Heap is empty");
            return -1;
        }
    }
}
