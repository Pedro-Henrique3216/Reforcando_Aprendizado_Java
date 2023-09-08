package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidade];

        for(int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados da %da pessoa\n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        int idadePessoasVelha = pessoas[0].getIdade();
        int posicao = 0;

        for(int i = 1; i < pessoas.length; i++){
            if(idadePessoasVelha < pessoas[i].getIdade()){
                idadePessoasVelha = pessoas[i].getIdade();
                posicao = i;
            }
        }

        System.out.println("Pessoa mais velha: " + pessoas[posicao].getNome());
        sc.close();
    }
}
