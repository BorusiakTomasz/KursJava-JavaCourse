package programingLvlLow.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class QueueElement {
    private QueueOnObject first = null;
    private QueueOnObject last = null;

    public void add(int el) {
        QueueOnObject tmp = new QueueOnObject(el);
        tmp.setPrev(this.last);

        if (this.last != null)
            this.last.setNext(tmp);

        this.last = tmp;

        if (this.first == null)
            this.first = tmp;
    }

    public int get() {
        if (this.first != null && this.last != null) {
            int value = this.first.getValue();

            this.first = this.first.getNext();
            if (this.first != null) {
                this.first.getPrev().setNext(null);
                this.first.setPrev(null);
            }

            return value;
        }
        return -1;
    }
}
