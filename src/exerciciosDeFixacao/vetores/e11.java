package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();

        double[] altura = new double[quantidade];
        char[] genero = new char[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().toUpperCase().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        for(int i = 1; i < quantidade; i++){
            if(menorAltura > altura[i]){
                menorAltura = altura[i];
            }

            if(maiorAltura < altura[i]){
                maiorAltura = altura[i];
            }
        }

        int numeroMulheres = 0, numeroHomens = 0;
        double sum = 0;

        for(int i = 0; i < quantidade; i++){
            if(genero[i] == 'F'){
                numeroMulheres++;
                sum += altura[i];
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
