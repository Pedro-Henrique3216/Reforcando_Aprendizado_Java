package exerciciosDeFixacao.enumeracoesComposicao.aplication;

import exerciciosDeFixacao.enumeracoesComposicao.entities.Client;
import exerciciosDeFixacao.enumeracoesComposicao.entities.Order;
import exerciciosDeFixacao.enumeracoesComposicao.entities.OrderItem;
import exerciciosDeFixacao.enumeracoesComposicao.entities.Product;
import exerciciosDeFixacao.enumeracoesComposicao.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = sdf.parse(sc.next());

        Client client = new Client(name, email, birth);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next().toUpperCase();

        Order order = new Order(OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int quantity = sc.nextInt();

        for(int i = 0; i < quantity; i++){
            System.out.printf("Enter #%d item data:\n", i + 1);
            System.out.print("Product name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();

            Product product = new Product(nameProduct, priceProduct);

            OrderItem orderItem = new OrderItem(quantityProduct, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);

        sc.close();
    }
}
