package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();

        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];
        double[] alturas = new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        sc.close();
    }
}
