package exerciciosDeFixacao.estruturaRepetitivaWhile;

import java.util.Scanner;

public class e3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoDigitado = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigoDigitado != 4) {

            switch (codigoDigitado){
                case 1 :
                    alcool += 1;
                    break;
                case 2 :
                    gasolina += 1;
                    break;
                case 3 :
                    diesel += 1;
                    break;
            }

            codigoDigitado = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
        sc.close();
    }



}
