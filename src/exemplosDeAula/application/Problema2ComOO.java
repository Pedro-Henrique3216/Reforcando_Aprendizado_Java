package exemplosDeAula.application;

import exemplosDeAula.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Problema2ComOO {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Update price: " + product.getPrice());
        System.out.println("Check stock: " + product.getQuantity());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }


}
