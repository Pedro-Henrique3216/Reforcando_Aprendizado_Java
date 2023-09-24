package exerciciosDeFixacao.enums.aplication;

import exerciciosDeFixacao.enums.entities.Department;
import exerciciosDeFixacao.enums.entities.HourContract;
import exerciciosDeFixacao.enums.entities.Worker;
import exerciciosDeFixacao.enums.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine().toUpperCase();
        System.out.print("Base salary: ");
        double salary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(department));

        System.out.print("How many contracts to this workers? ");
        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Enter contract #%d data:\n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String date = sc.next();

        System.out.println("Name: " + worker.getName());

        System.out.println("Department: " + worker.getDepartment().getName());

        Integer year = Integer.parseInt(date.substring(3));
        Integer month = Integer.parseInt(date.substring(0, 2));
        System.out.printf("Income for %s: %.2f", date, worker.income(year, month));



        sc.close();
    }
}
