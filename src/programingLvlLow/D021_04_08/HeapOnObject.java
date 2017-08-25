package programingLvlLow.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class HeapOnObject {
    private int value;
    private HeapOnObject prev = null;

    public HeapOnObject(int value, HeapOnObject prev) {
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public HeapOnObject getPrev() {
        return prev;
    }
}
