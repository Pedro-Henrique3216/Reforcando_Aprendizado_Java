package exerciciosDeFixacao.vetores;

import java.util.Locale;
import java.util.Scanner;

public class e10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int quantidade = sc.nextInt();

        Aluno[] alunos = new Aluno[quantidade];

        for(int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            sc.nextLine();
            String nome = sc.nextLine();
            double pSemestre = sc.nextDouble();
            double sSemestre = sc.nextDouble();

            alunos[i] = new Aluno(nome, pSemestre, sSemestre);
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < alunos.length; i++){
            double sum = alunos[i].getNotaPSemestre() + alunos[i].getNotaSSemestre();
            double media = sum / 2;
            if(media >= 6){
                System.out.println(alunos[i].getNome());
            }
        }

        sc.close();
    }
}
