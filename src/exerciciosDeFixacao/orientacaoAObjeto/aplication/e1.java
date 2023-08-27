package exerciciosDeFixacao.orientacaoAObjeto.aplication;

import exerciciosDeFixacao.orientacaoAObjeto.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();


        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        System.out.println(rectangle.height + ", " + rectangle.width);

    }
}
