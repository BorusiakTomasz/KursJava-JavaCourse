package programingLvlLow.D025_10_08;

import programingLvlLow.D024_09_08.Edge;

/**
 * Created by Miver on 2017-08-10.
 */
public class Structures {
    public static boolean[][] generateAArray(int n)
    {
        boolean[][] a = new boolean[n][n];
        return a;
    }

    public static Edge[] generateEdgeArray(int n) {
        int h = n * (n - 1) / 2;
        Edge[] result = new Edge[h];
        int index = 0;

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge();
                newEdge.a = i;
                newEdge.b = j;
                result[index] = newEdge;
                index++;
            }

        return result;
    }

    public static EdgeV2[] generateEdgeV2Array(int n) {
        Edge[] tmpResult = generateEdgeArray(n);
        EdgeV2[] result = new EdgeV2[tmpResult.length];

        for (int i = 0; i < tmpResult.length; i++) {
            result[i].a = tmpResult[i].a;
            result[i].b = tmpResult[i].b;
            result[i].c = false;
        }

        return result;
    }
}
