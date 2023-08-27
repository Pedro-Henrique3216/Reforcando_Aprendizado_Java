package exemplosDeAula;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Quantas horas");
        x = sc.nextInt();

        if(x < 12){
            System.out.println("Bom dia");
        } else if (x < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();

        LocalDateTime s = LocalDateTime.now();

        if(s.getHour() < 12){
            System.out.println("Bom dia");
        } else if (s.getHour() < 18) {
                System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }




    }
}
