package exerciciosDeFixacao.metodosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quanti = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.valorConvertido(dolar, quanti));

        sc.close();
    }
}
