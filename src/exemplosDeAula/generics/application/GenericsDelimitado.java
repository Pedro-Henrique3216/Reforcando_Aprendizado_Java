package exemplosDeAula.generics.application;

import exemplosDeAula.generics.entities.Product;
import exemplosDeAula.generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericsDelimitado {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "c:\\temp\\ns.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();

            while(line != null){
                String[] array = line.split(",");
                list.add(new Product(array[0], Double.parseDouble(array[1])));
                line = bf.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
