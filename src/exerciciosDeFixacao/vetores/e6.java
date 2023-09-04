package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int quantidade = sc.nextInt();

        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for(int i = 0; i < quantidade; i++){
            int soma = vetorA[i] + vetorB[i];
            System.out.println(soma);
        }

        sc.close();
    }
}
