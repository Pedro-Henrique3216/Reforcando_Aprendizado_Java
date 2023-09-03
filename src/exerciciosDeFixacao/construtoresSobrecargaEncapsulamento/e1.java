package exerciciosDeFixacao.construtoresSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String numero = sc.nextLine();
        System.out.print("Enter account holder: ");
        String titular = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String temOuNao = sc.next();
        temOuNao = temOuNao.toLowerCase();

        Conta conta;

        if(temOuNao.equals("y")){
            System.out.print("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
            conta = new Conta(numero, titular, deposito);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        conta.deposito(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        conta.saque(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.println(conta);






    }
}
