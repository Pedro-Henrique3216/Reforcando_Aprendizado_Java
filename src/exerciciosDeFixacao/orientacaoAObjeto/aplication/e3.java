package exerciciosDeFixacao.orientacaoAObjeto.aplication;

import exerciciosDeFixacao.orientacaoAObjeto.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();


        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno.name + ", " + aluno.nota1 + ", " + aluno.nota2 + ", " + aluno.nota3);

        sc.close();

    }
}
