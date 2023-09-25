package exerciciosDeFixacao.herancaEPolimorfismo.aplication;

import exerciciosDeFixacao.herancaEPolimorfismo.entities.Employee;
import exerciciosDeFixacao.herancaEPolimorfismo.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < quantity; i++){
            System.out.printf("Employee #%d data: \n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char yOUN = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            Employee e;

            if(yOUN == 'y'){
                System.out.print("Additional charge: ");
                double additional = sc.nextDouble();
                e = new OutsourceEmployee(name, hours, valuePerHour, additional);
            } else{
                e = new Employee(name, hours, valuePerHour);
            }

            list.add(e);
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee e : list){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
