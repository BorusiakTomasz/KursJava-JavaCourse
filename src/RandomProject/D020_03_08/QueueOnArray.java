package RandomProject.D020_03_08;

/**
 * Created by Miver on 2017-08-03.
 */
public class QueueOnArray {
    int[] queue;
    int first;
    int last;
    boolean flag;

    public QueueOnArray(int size) {
        queue = new int[size];
        first = 0;
        last = 0;
        flag = true;
    }

    public void add(int el) {
        if (this.queue.length > this.last)
            this.queue[this.last++] = el;
        else
            //System.out.println("Tablica jest pelna");
            /*if (this.first > 0 && this.first != this.last) {
                this.last = 0;
                this.queue[this.last++] = el;
            } else {
                System.out.println("Kolejka pelna");
            }*/

            //implementacja trenera
            if (this.last >= this.queue.length && this.first != 0) {
                this.last = 0;
                flag = false;
            }
            if (this.first != this.last || flag) {
                this.queue[this.last++] = el;
            }
    }

    public int get() {
        //pokminic z zawijaniem
        return this.queue[this.first++];
    }
}
