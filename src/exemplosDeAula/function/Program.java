package exemplosDeAula.function;

import exemplosDeAula.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*
        List<String> names = list.stream().map(new UpperCaseName()).toList();
         */

        List<String> names = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
