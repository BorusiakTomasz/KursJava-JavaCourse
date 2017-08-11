package RandomProject.D024_09_08;

import RandomProject.D025_10_08.*;
import RandomProject.D026_11_08.Triangles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miver on 2017-08-09.
 */
public class Grafs {
    public static void main(String[] args) {
        /*
        * Transform E to A
        */
//        int n = 4;
//        int k = 4;
//        Edge[] resultGnk = generateGnk(n,k);
//        boolean[][] result = transformEtoA(n, resultGnk, k);
//
//        for(int i =0; i < result.length; i++){
//            System.out.println(Arrays.toString(result[i]));
//        }
//        for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
//            System.out.println(resultGnk[i].toString());
//        }

        /* Generator GNP
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        */
//        generateGnp(4,0.5);

        /* Generator Gnk
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        generateGnk(4, 3);


        /* Transform A to E
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        *  */
//        transformAtoE(4, 0.5);

        /* Transform E to A
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        transformaEtoA(4, 3);

        /* Generator GnkV2
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        generateGnkV2(4, 3);

//        transformAtoS(4);

        triangleFinder(4);
    }

    public static void transformAtoE(int n, double p) {
        boolean[][] a = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(a);
        Edge[] e = Transforms.transformAtoE(a, n);
        PrintStructures.printE(e);
    }

    public static void generateGnp(int n, double p) {
        boolean[][] result = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(result);
    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGNK(n,k);
        PrintStructures.printE(result);
    }

    public static void transformaEtoA(int n, int k){
        Edge[] result = GraphGnk.generateGNK(n,k);
        PrintStructures.printE(result);
        boolean[][] a = Transforms.transformEtoA(n,result,k);
        PrintStructures.printA(a);
    }

    public static void generateGnkV2(int n, int k) {
        ArrayList<EdgeV2> result = GraphGnk.generateGNKv2(n, k);
        PrintStructures.printEv2(result);
    }

    public static void transformAtoS(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.5);
        PrintStructures.printA(a);
        StructS[] result = Transforms.transformAtoS(a, n);
        PrintStructures.printStructS(result);
    }

    public static void triangleFinder(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.8);
        PrintStructures.printA(a);
        int triangles = Triangles.countTriangles(a, n);
        PrintStructures.printString("Liczba trojkatow: " + triangles);
    }


    /* Moje wypociny
    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj wielkosc grafu");
    int n = sc.nextInt();

    System.out.println("Podaj prawdopodobienstwo z przedzialu, 0 - 1");
    double p = sc.nextDouble();

    System.out.println("Podaj liczbe krawedzi");
    int k = sc.nextInt();
    System.out.println();

    //-----------------------------------------------------------------------

    System.out.println("generateGNP");
    boolean[][] result = GraphGnp.generateGNP(n, p);
    for (boolean[] aResult : result)
        System.out.println(Arrays.toString(aResult));
    System.out.println();

    //-----------------------------------------------------------------------

    System.out.println("generateEdgeArray");
    Edge[] test = Structures.generateEdgeArray(n);
    for (Edge e : test)
        System.out.println(e.toString());
    System.out.println();

    //-----------------------------------------------------------------------

    System.out.println("generateGNK");
    int k = 3;
    Edge[] resultGNK = GraphGnk.generateGNK(n, k);
    for (int i = resultGNK.length - 1; i >= resultGNK.length - k; i--)
        System.out.println(resultGNK[i].toString());
    System.out.println();

    //-----------------------------------------------------------------------

    System.out.println("transformEtoA");
    boolean[][] _result = Transforms.transformEtoA(n, GraphGnk.generateGNK(n, k), k);
    for (boolean[] aResult : _result)
        System.out.println(Arrays.toString(aResult));
    System.out.println("--- --- --- --- --- ---");
    for (int i = resultGNK.length - 1; i >= resultGNK.length - k; i--)
        System.out.println(resultGNK[i].toString());
    System.out.println();

    //-----------------------------------------------------------------------

    System.out.println("transferAtoE");
    boolean[][] a = GraphGnp.generateGNP(n, p);
    k = Transforms.countEdgeInA(a, n);
    Edge[] result1 = Transforms.transformAtoE(a, n);

    for (int i = result1.length - 1; i >= result1.length - k; i--) {
        System.out.println(result1[i].toString());*/
}