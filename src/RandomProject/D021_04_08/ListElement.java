package RandomProject.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class ListElement {
    private ListElement prev = null;
    private ListElement next = null;
    private int value;

    public ListElement(int value) {
        this.value = value;
    }

    public ListElement getPrev() {
        return prev;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
}
