package exerciciosDeFixacao.interfaces.defaultMethods;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService us = new UsaInterestService(1.0);
        InterestService is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);
        double paymentUsa = us.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println("Brazil payment: " + String.format("%.2f", payment));
        System.out.println("Usa payment: " + String.format("%.2f", paymentUsa));

        sc.close();
    }
}
