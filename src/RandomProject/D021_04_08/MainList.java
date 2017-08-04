package RandomProject.D021_04_08;

/**
 * Created by Miver on 2017-08-04.
 */
public class MainList {
    public static void main(String[] args) {
        List list = new List();

        list.addSorted(3);
        list.addSorted(2);
        list.addSorted(1);
        list.addSorted(4);
        list.addSorted(5);
        list.addSorted(1);

        list.print();
    }
}
