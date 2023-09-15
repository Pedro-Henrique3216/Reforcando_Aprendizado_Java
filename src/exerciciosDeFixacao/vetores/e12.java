package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quantidade = sc.nextInt();

        Pensionamento[] pensionamento = new Pensionamento[10];

        for(int i = 0; i < quantidade; i++){
            System.out.println();
            System.out.printf("Rent #%d\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            pensionamento[room] = new Pensionamento(nome, email);

        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++){
            if (pensionamento[i] != null) System.out.println(i + ": " + pensionamento[i]);
        }


        sc.close();
    }
}
