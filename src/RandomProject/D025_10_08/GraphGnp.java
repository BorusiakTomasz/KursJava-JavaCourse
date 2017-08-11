package RandomProject.D025_10_08;

/**
 * Created by Miver on 2017-08-10.
 */
public class GraphGnp {
    public static boolean[][] generateGNP(int n, double p) {
        boolean[][] result = Structures.generateAArray(n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.random() < p) {
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
            result[i][i] = true;
        }
        result[n - 1][n - 1] = true;

        return result;
    }
}
