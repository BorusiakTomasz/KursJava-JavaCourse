package programingLvlLow.D025_10_08;

import java.util.ArrayList;

/**
 * Created by Miver on 2017-08-10.
 */
public class StructS implements Cloneable{
    public ArrayList<Integer> collection;
    public int counter;

    public StructS() {
        this.collection = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.collection.toString() + " (" + Integer.toString(this.counter) + ')';
    }
}
