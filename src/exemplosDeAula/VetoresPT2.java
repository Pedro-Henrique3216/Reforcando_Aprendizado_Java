package exemplosDeAula;

import exemplosDeAula.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VetoresPT2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;

        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double media = sum / n;

        System.out.printf("AVERAGE HEIGHT %.2f%n", media);
        sc.close();
    }
}
