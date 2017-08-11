package RandomProject.D025_10_08;

import RandomProject.D024_09_08.Edge;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Miver on 2017-08-10.
 */
public class PrintStructures {
    public static void printA(boolean[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(Arrays.toString(a[i]));
    }

    public static void printE(Edge[] e) {
        for (Edge item : e)
            System.out.println(item.toString());
    }

    public static void printEv2(ArrayList<EdgeV2> e) {
        for (EdgeV2 item : e)
            System.out.println(item.toString());
    }

    public static void printStructS(StructS[] s) {
        for (StructS item : s) {
            System.out.println(item.toString());
        }
    }
    public static void printString(String s) {
        System.out.println(s);
    }
}
