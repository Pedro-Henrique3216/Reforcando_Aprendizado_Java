package exerciciosDeFixacao.estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class e6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        double pi = 3.14159;

        double areaTriangulo = A * C / 2;
        double areaCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = Math.pow(B , 2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);


        sc.close();
    }
}
