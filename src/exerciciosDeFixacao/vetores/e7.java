package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidade = sc.nextInt();
        double media, soma;

        double[] numero = new double[quantidade];

        for(int i = 0; i < numero.length; i++){
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextDouble();
        }
        soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma = soma + numero[i];
        }

        media = soma / quantidade;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < media) {
                System.out.printf("%.1f\n", numero[i]);
            }
        }

        sc.close();
    }
}
