package exemplosDeAula.genericSetEMap.application;

import exemplosDeAula.genericSetEMap.services.PrintService;

import java.util.Scanner;

public class UsandoGenerics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int quantity = sc.nextInt();

        for(int i = 0; i < quantity; i++){
            String values = sc.next();
            ps.addValue(values);
        }

        ps.print();
        String x =  ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
