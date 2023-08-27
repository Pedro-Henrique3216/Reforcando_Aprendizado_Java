package application;

import entities.Product;

import java.util.Scanner;

public class Problema2ComOO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        product.name = sc.next();
        product.price = sc.nextDouble();
        product.quntity = sc.nextInt();

        System.out.printf(product.name + " " + "%.2f" + " " + product.quntity, product.price);

        sc.close();
    }


}
