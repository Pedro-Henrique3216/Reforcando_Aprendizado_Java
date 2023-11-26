package exemplosDeAula.predicate;

import exemplosDeAula.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*
          list.removeIf(new ProductPredicate());
         */

        list.removeIf(p -> p.getPrice() >= 100.00);

        list.forEach(System.out::println);
    }
}
