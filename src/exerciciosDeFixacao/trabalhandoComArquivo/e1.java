package exerciciosDeFixacao.trabalhandoComArquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("c:\\temp\\sourceFile.csv"))){

            String line = br.readLine();

            while (line != null){
                String[] arr = line.split(",");
                double valorTotal = Double.parseDouble(arr[1]) * Double.parseDouble(arr[2]);
                list.add(arr[0] + String.format(",%.2f", valorTotal));
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        String strPath = "c:\\temp";
        boolean newFile = new File(strPath + "\\out").mkdir();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath + "\\out\\summary.csv"))){

            for(String product : list){
                bw.write(product);
                bw.newLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
