package exerciciosDeFixacao.estruturaCondicional;

import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x % y == 0 || y % x == 0 ){
            System.out.println("SAO MULTIPLOS");
        } else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();

    }
}
