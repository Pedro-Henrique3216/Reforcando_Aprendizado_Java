package exerciciosDeFixacao.orientacaoAObjeto.aplication;

import exerciciosDeFixacao.orientacaoAObjeto.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rectangle.area());
        System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
