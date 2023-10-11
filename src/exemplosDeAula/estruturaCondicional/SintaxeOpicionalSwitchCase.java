package exemplosDeAula.estruturaCondicional;

import java.util.Scanner;

public class SintaxeOpicionalSwitchCase {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        switch (x) {
            case 1 :
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3 :
                System.out.println("terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabado");
                break;
            default :
                System.out.println("Valor invalido");
                break;
        }




        sc.close();
    }


}
