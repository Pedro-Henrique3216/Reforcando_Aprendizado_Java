package exemplosDeAula;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextInt();
        }

        sc.close();
    }
}
