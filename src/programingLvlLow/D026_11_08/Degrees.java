package programingLvlLow.D026_11_08;

import programingLvlLow.D025_10_08.StructS;

/**
 * Created by Miver on 2017-08-11.
 */
public class Degrees {
    public static int getGraphDegree(StructS[] s) {
        int result = 0;

        for (StructS item : s)
            if (item.counter > result)
                result = item.counter;

        return result;
    }
}
