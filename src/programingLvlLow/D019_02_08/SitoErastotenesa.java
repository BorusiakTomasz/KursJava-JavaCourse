package programingLvlLow.D019_02_08;

import java.util.Scanner;

/**
 * Created by Miver on 2017-08-02.
 * Don't complite.
 */
public class SitoErastotenesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ile liczb pierwszych chcesz zobaczyc");
        int x = sc.nextInt();

        double howLong = Math.sqrt(x);
        boolean[] S = new boolean[x];

        for(int i = 2; i <= x; i++)
            S[i] = true;

        for(int i = 2; i <= howLong; i++)
            if(S[i])
            {
                int w = i * i;
                while(w <= x)
                {
                    S[w] = false;
                    w += i;
                }
            }

        for(int i = 2; i <= x; i++)
            if(S[i]) System.out.println(i);
    }
}
