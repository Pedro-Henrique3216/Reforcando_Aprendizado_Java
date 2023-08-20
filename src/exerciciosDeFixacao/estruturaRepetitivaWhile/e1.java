package exerciciosDeFixacao.estruturaRepetitivaWhile;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaDigitada = sc.nextInt();
        int senhaCorreta = 2002;

        while (senhaDigitada != senhaCorreta){
            System.out.println("Senha Invalida");
            senhaDigitada = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }

}
