package exerciciosDeFixacao.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class e5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoP1 = sc.nextInt();
        int quantidadeP1 = sc.nextInt();
        double valorP1 = sc.nextDouble();

        int codigoP2 = sc.nextInt();
        int quantidadeP2 = sc.nextInt();
        double valorP2 = sc.nextDouble();

        double valorAPagar = quantidadeP1 * valorP1 + quantidadeP2 * valorP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);

        sc.close();

    }
}
