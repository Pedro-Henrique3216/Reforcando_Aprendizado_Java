package exerciciosDeFixacao.classesAbstratasMetodosAbstratos.application;

import exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities.TaxPayer;
import exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities.Individual;
import exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++){
            System.out.printf("Tax payer #%d data:\n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char payer = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            TaxPayer taxPayer;

            if(payer == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();
                taxPayer = new Individual(name, income, healthExpenditure);
            } else{
                System.out.print("Number of employees: ");
                int employess = sc.nextInt();
                taxPayer = new Company(name, income, employess);
            }

            list.add(taxPayer);
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTaxes = 0;

        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer);
            totalTaxes += taxPayer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));


        sc.close();
    }
}
