package programingLvlLow.D025_10_08;

import programingLvlLow.D024_09_08.Edge;

import java.util.ArrayList;

/**
 * Created by Miver on 2017-08-10.
 */
public class GraphGnk {
    public static Edge[] generateGNK(int n, int k) {
        Edge[] result = Structures.generateEdgeArray(n);
        int h = n * (n - 1) / 2;

        if (k <= h)
            while (k > 0) {
                int r = (int) Math.floor(Math.random() * h);

                Edge tmp = result[r];
                result[r] = result[h - 1];
                result[h - 1] = tmp;
                h--;
                k--;
            }

        return result;
    }

    public  static ArrayList<EdgeV2> generateGNKv2(int n, int k) {
        Edge[] tmpResult = generateGNK(n, k);
        ArrayList<EdgeV2> result = new ArrayList<>();

        for (int i = 0; i < tmpResult.length; i++) {
            EdgeV2 newObject = new EdgeV2();
            newObject.a = tmpResult[i].a;
            newObject.b = tmpResult[i].b;
            result.add(newObject);
        }

        int h = n * (n - 1) / 2;
        for (int i = h-1; i >= h-k; i--)
            result.get(i).c = true;

        return result;
    }
}
