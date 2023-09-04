package exerciciosDeFixacao.vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Scanner;

public class e5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = sc.nextInt();

        double[] numerosReais = new double[quantidade];

        for(int i = 0; i < numerosReais.length; i++){
            System.out.print("Digite um numero: ");
            numerosReais[i] = sc.nextDouble();
        }

        double maiorValor = numerosReais[0];
        int posicao = 0;

        for(int i = 1; i < numerosReais.length; i++){
            if(numerosReais[i] > maiorValor) {
                maiorValor = numerosReais[i];
                posicao = i;
            }
        }
        System.out.println("Maior valor = " + maiorValor);
        System.out.println("Posicao do maior valor = " + posicao);

        sc.close();
    }

}
