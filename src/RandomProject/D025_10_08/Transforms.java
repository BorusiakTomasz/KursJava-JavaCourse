package RandomProject.D025_10_08;

import RandomProject.D024_09_08.Edge;

/**
 * Created by Miver on 2017-08-10.
 */
public class Transforms {
    public static StructS[] transformAtoS(boolean[][] a, int n) {
        StructS[] result = new StructS[n];

        for (int i = 0; i < n; i++) {
            StructS tmpItem = new StructS();
            result[i] = tmpItem;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    result[i].collection.add(j);
                    result[i].counter++;
                    result[j].collection.add(i);
                    result[j].counter++;
                }
            }
        }

        return result;
    }

    public static boolean[][] transformEtoA(int n, Edge[] struct, int k) {
        boolean[][] result = new boolean[n][n];

        int h = n * (n - 1) / 2;
        for (int i = h - 1; i > h - 1 - k; i--) {
            result[struct[i].a][struct[i].b] = true;
            result[struct[i].b][struct[i].a] = true;
        }

        return result;
    }

    public static Edge[] transformAtoE(boolean[][] a, int n) {
        Edge[] result = Structures.generateEdgeArray(n);
        int index = result.length - 1;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    result = moveItem(result, i, j, index);
                    index--;
                }
            }
        }
        return result;
    }

    private static Edge[] moveItem(Edge[] result, int i, int j, int index) {
        for (int k = 0; k < result.length; k++) {
            /* jeśli znajdziemy w E krawędź {i:j} */
            if (result[k].a == i && result[k].b == j) {
                /* to zamieniamy ją z ostatnim nieprzesuniętym elementem */
                Edge tmp = result[k];
                result[k] = result[index];
                result[index] = tmp;
                break;
            }

        }

        return result;
    }

    public static int countEdgeInA(boolean[][] a, int n) {
        int result = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i][j]) {
                    result++;
                }
            }
        }

        return result;
    }
}
