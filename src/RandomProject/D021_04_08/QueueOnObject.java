package RandomProject.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class QueueOnObject {
    private QueueOnObject next = null;
    private int value;
    private QueueOnObject prev = null;

    public QueueOnObject(int value) {
        this.value = value;
    }

    public QueueOnObject getNext() {
        return next;
    }

    public void setNext(QueueOnObject next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public QueueOnObject getPrev() {
        return prev;
    }

    public void setPrev(QueueOnObject prev) {
        this.prev = prev;
    }
}
