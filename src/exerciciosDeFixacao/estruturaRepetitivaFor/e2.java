package exerciciosDeFixacao.estruturaRepetitivaFor;

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int in = 0;
        int out = 0;

        for(int i = 0; i < x; i++){
            int n = sc.nextInt();
            if(n < 10 || n > 20){
                out += 1;
            } else {
                in += 1;
            }
        }
        System.out.printf("%d in %n%d out %n", in, out);
        sc.close();
    }

}
