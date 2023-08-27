package exemplosDeAula;

import java.time.Clock;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        int n = 1;
        System.out.println(n);

        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, renda);
    }
}