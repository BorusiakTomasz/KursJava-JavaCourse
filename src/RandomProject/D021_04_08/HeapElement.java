package RandomProject.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class HeapElement {
    private HeapOnObject top = null;

    public void push(int el) {
        HeapOnObject tmp = new HeapOnObject(el, this.top);
        this.top = tmp;
    }

    public int pop() {
        if (this.top != null) {
            int tmp = top.getValue();
            this.top = top.getPrev();
            return tmp;
        }
        return -1;
    }
}
