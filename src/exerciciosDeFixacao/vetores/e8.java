package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double media;
        int somaPares = 0, quantidadePares = 0;

        int[] numeros = new int[quantidade];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                somaPares += numeros[i];
                quantidadePares++;
            }
        }

        if(somaPares > 0){
            media = (double) somaPares / quantidadePares;
            System.out.printf("Media dos pares = %.1f", media);
        } else {
            System.out.println("Nenhum numero par");
        }

        sc.close();
    }
}
