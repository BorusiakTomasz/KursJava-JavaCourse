package programingLvlMid.D033_24_08;

/**
 * Created by Miver on 2017-08-24.
 */
public class Main {
    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack<>(String.class, 5);
        stack.push("jeden");
        stack.push("dwa");
        stack.push("trzy");

        int t = stack.getIndex();
        for (int i = 0; i < t; i++)
            System.out.println(stack.pop());

    }
}
