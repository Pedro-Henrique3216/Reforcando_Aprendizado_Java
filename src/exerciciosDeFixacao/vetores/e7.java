package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double media, soma = 0;

        double[] numero = new double[quantidade];

        for(int i = 0; i < numero.length; i++){
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextDouble();
            soma += numero[i];
        }


        media = soma / numero.length;

        System.out.printf("%nMedia do Vetor = %.3f%n", media);

        System.out.println("Elementos abaixo da media: ");
        for(int i = 0; i < numero.length; i++){
            if(numero[i] < media){
                System.out.println(numero[i]);
            }
        }

        sc.close();
    }
}
