package exerciciosDeFixacao.trabalhandoComArquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))){

            String itemCsv = br.readLine();

            while (itemCsv != null){
                String[] arr = itemCsv.split(",");
                String name = arr[0];
                double price = Double.parseDouble(arr[1]);
                int quantity = Integer.parseInt(arr[2]);

                products.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product product : products){
                    bw.write(product.toString());
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");

            } catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }



    }
}
