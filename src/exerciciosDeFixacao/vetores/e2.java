package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = sc.nextInt();

        double[] arr = new double[quantidade];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Digite um numero: ");
            arr[i] = sc.nextDouble();
        }

        double sum = 0;
        String valores = "";

        for(int i = 0; i < arr.length; i++){
            valores += " "  + arr[i];
            sum += arr[i];
        }

        double media = sum / quantidade;

        System.out.println("Valores = " + valores.trim());
        System.out.printf("Soma = %.2f%n", sum);
        System.out.printf("Media = %.2f%n", media);

        sc.close();
    }
}
