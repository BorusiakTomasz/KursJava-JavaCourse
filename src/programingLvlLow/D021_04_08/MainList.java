package programingLvlLow.D021_04_08;

import programingLvlLow.D022_07_08.ListMargeSort;

/**
 * Created by Miver on 2017-08-04.
 */
public class MainList {
    public static void main(String[] args) {
        ListMargeSort list = new ListMargeSort();

        list.add(12);
        list.add(6);
        list.add(11);
        list.add(5);
        list.add(10);
        list.add(4);
        list.add(9);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(1);

        list.print();

        System.out.println("-----");
        list.mergeSort();

        list.print();
    }
}
