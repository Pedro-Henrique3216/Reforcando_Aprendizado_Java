package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int quantidadeDePares = 0;

        System.out.println("Numeros pares: ");

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.printf("%d  ", numeros[i]);
                quantidadeDePares++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares = " + quantidadeDePares);

        sc.close();
    }

}
