package exemplosDeAula.estruturaRepetitiva;

import java.util.Scanner;

public class EstruturaRepetitiva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();

        int soma = 0;
        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.printf("Soma de todos os numero digitados = %d", soma);

        sc.close();
    }


}
