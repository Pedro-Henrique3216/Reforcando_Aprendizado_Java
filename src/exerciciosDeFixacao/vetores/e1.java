package exerciciosDeFixacao.vetores;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");
        int quantidade = sc.nextInt();

        while (quantidade < 0 || quantidade > 10){
            System.out.print("Quantos numero voce vai digitar? ");
            quantidade = sc.nextInt();
        }

        int[] arr = new int[quantidade];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Digite um numero: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Numeros Negativos: ");

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
