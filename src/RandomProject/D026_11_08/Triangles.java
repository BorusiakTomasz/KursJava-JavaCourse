package RandomProject.D026_11_08;

import RandomProject.D025_10_08.StructS;
import RandomProject.D025_10_08.Transforms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Miver on 2017-08-11.
 */
public class Triangles {
    public static int countTriangles(boolean[][] a, int n) {
        StructS[] tmpStructS = Transforms.transformAtoS(a, n);
        int Triangles = 0;

        ArrayList<ArrayList<Integer>> trianglesCollection = new ArrayList<>();

        ArrayList<Integer> temp;
        for (int i = 0; i < tmpStructS.length; i++)
            for (Integer item : tmpStructS[i].collection) {
                temp =(ArrayList<Integer>) tmpStructS[i].collection.clone();
                temp.retainAll(tmpStructS[item].collection);
                for (Integer e : temp) {
                    ArrayList<Integer> tempList = new ArrayList<>();
                    tempList.add(i);
                    tempList.add(item);
                    tempList.add(e);
                    trianglesCollection.add(tempList);
                }
            }

        Set<ArrayList<Integer>> hs = new HashSet<>();
        hs.addAll(trianglesCollection);
        trianglesCollection.clear();
        trianglesCollection.addAll(hs);

        return Triangles;
    }
}
