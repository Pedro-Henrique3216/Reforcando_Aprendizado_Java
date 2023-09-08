package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = sc.nextInt();

        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Dados da %da pessoa\n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

        }

        int idadePessoasVelha = idades[0];
        int posicao = 0;

        for(int i = 1; i < idades.length; i++){
            if(idadePessoasVelha < idades[i]){
                idadePessoasVelha = idades[i];
                posicao = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nomes[posicao]);
        sc.close();
    }
}
