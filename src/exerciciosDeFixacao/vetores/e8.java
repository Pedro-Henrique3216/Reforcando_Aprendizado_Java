package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade, somapares = 0, npares = 0;
        double mediapares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                somapares = somapares + numeros[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            mediapares = (double)somapares / npares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }


        sc.close();
    }
}
