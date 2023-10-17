package exerciciosDeFixacao.interfaces.comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        String path = "c:\\temp\\in.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                String name = fields[0];
                double salary = Double.parseDouble(fields[1]);
                list.add(new Employee(name, salary));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for(Employee e : list){
                System.out.println(e);
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
