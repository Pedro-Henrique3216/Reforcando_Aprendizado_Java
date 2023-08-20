package exerciciosDeFixacao.estruturaRepetitivaWhile;

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cordenadaX = sc.nextInt();
        int cordenadaY = sc.nextInt();

        while (cordenadaX != 0 && cordenadaY != 0){
            if(cordenadaX > 0 && cordenadaY > 0){
                System.out.println("Primeiro");
            } else if(cordenadaX < 0 && cordenadaY> 0){
                System.out.println("Segundo");
            } else if(cordenadaX < 0 && cordenadaY < 0) {
                System.out.println("Terceiro");
            } else{
                System.out.println("Quarto");
            }
            cordenadaX = sc.nextInt();
            cordenadaY = sc.nextInt();
        }

        sc.close();
    }


}
