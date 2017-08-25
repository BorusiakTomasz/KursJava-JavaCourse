package programingLvlLow.D025_10_08;

/**
 * Created by Miver on 2017-08-10.
 */
public class EdgeV2 {
    public int a;
    public int b;
    public boolean c = false;

    @Override
    public String toString() {
        return Integer.toString(this.a) + Integer.toString(this.b) + Boolean.toString(this.c);
    }
}
