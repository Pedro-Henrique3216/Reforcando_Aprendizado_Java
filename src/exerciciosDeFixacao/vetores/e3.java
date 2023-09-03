package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidade];

        for(int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0;
        double quant = 0;

        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                quant++;
            }
            sum += pessoas[i].getAltura();
        }

        System.out.println();
        double alturaMedia = sum / quantidade;
        System.out.printf("Altura media: %.2f%n", alturaMedia);

        double porcentagem = quant * 100 / quantidade;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcentagem);

        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
