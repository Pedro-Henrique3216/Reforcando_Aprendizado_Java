package exerciciosDeFixacao.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class e4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberFuncionary = sc.nextInt();
        double priceHours = sc.nextDouble();
        double hours = sc.nextDouble();

        double salary = priceHours * hours;

        System.out.println("NUMBER = " + numberFuncionary);
        System.out.printf("SALARY = U$ %.2f%n", salary);




        sc.close();

    }
}
