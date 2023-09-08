package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidade];

        for(int i = 0; i < pessoas.length; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            char genero = sc.next().toUpperCase().charAt(0);

            pessoas[i] = new Pessoa(altura, genero);
        }

        double menorAltura = pessoas[0].getAltura();
        double maiorAltura = pessoas[0].getAltura();

        for(int i = 1; i < pessoas.length; i++){
            if(menorAltura > pessoas[i].getAltura()){
                menorAltura = pessoas[i].getAltura();
            }

            if(maiorAltura < pessoas[i].getAltura()){
                maiorAltura = pessoas[i].getAltura();
            }
        }

        int numeroMulheres = 0, numeroHomens = 0;
        double sum = 0;

        for(int i = 0; i < quantidade; i++){
            if(pessoas[i].getGenero() == 'F'){
                numeroMulheres++;
                sum += pessoas[i].getAltura();
            } else {
                numeroHomens++;
            }
        }

        double media = sum / numeroMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + numeroHomens);


        sc.close();
    }
}
