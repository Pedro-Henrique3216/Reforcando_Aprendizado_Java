package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int quantidade = sc.nextInt();

        String[] alunos = new String[quantidade];
        double[] pSemestre = new double[quantidade];
        double[] sSemestre = new double[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            alunos[i] = sc.nextLine();
            pSemestre[i] = sc.nextDouble();
            sSemestre[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados");
        for(int i = 0; i < quantidade; i++){
            double sum = pSemestre[i] + sSemestre[i];
            double media = sum / 2;
            if(media >= 6){
                System.out.println(alunos[i]);
            }
        }




        sc.close();
    }
}
