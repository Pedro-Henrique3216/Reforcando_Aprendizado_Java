package exerciciosDeFixacao.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            System.out.print("Enter salary: ");
            double salaryResp = sc.nextDouble();

            List<Employee> list = new ArrayList<>();

            String line = bf.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salary));

                line = bf.readLine();
            }

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryResp));

            List<String> emails = list.stream()
                    .filter(e -> e.getSalary() > salaryResp)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();

            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M' : " + String.format("%.2f", sum));

        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
