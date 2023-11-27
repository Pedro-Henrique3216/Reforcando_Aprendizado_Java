package exerciciosDeFixacao.stream;

import exemplosDeAula.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            String line = bf.readLine();
            List<Product> list = new ArrayList<>();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);

                list.add(new Product(name, price));
                line = bf.readLine();
            }


            double media = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, Double::sum) / list.size();

            System.out.println("Average price: " + String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
