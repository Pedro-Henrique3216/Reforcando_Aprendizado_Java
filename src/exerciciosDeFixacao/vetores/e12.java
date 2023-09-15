package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int quantidade = sc.nextInt();

        String[] names = new String[10];
        String[] emails = new String[10];

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Rent #%d\n", i + 1);
            sc.nextLine();
            String nome = sc.nextLine();
            String email = sc.next();
            int room = sc.nextInt();

            names[room] = nome;
            emails[room] = email;


        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++){
            if (names[i] != null) System.out.println(i + ": " + names[i] + ", " + emails[i]);
        }


        sc.close();
    }
}
