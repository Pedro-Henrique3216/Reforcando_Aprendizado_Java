package exerciciosDeFixacao.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class e8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto ;

        if(salario <= 2000){
            imposto = 0;
        } else if(salario <= 3000){
            salario -= 2000;
            imposto = salario * 0.08;
        } else if(salario <= 4500){
            salario -= 3000;
            imposto = (salario * 0.18) + (1000 * 0.08);
        } else {
            salario -= 4500;
            imposto = (salario * 0.28) + (1000 * 0.08) + (1500 * 0.18);
        }

        if(imposto == 0){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }

}
