package exerciciosDeFixacao.estruturaCondicional;

import java.util.Scanner;

public class e4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int duracao;

        if(x < y){
            duracao = y - x;
        } else {
            duracao = 24 - x + y;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);


        sc.close();

    }

}
