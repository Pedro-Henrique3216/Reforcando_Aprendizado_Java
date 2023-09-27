package exerciciosDeFixacao.herancaEPolimorfismo.aplication;

import exerciciosDeFixacao.herancaEPolimorfismo.entities.ImportedProduct;
import exerciciosDeFixacao.herancaEPolimorfismo.entities.Product;
import exerciciosDeFixacao.herancaEPolimorfismo.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class e2 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of product: ");
        int quantity = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 0; i < quantity; i++){
            System.out.printf("Product #%d data:\n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product product;

            if(type == 'c'){
                product = new Product(name, price);
            } else if(type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
                product = new UsedProduct(name, price, date);
            } else{
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            }

            products.add(product);
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : products){
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}
