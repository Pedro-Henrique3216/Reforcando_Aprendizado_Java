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
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double sum = 0;

        for(int i = 0; i < alturas.length; i++){
            sum += alturas[i];
        }

        System.out.println();
        double alturaMedia = sum / quantidade;
        System.out.printf("Altura media: %.2f%n", alturaMedia);

        double quant = 0;
        for(int i = 0; i < idades.length; i++){
            if(idades[i] < 16){
                quant += 1;
            }
        }

        double porcentagem = quant * 100 / quantidade;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcentagem);

        for(int i = 0; i < nomes.length; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
