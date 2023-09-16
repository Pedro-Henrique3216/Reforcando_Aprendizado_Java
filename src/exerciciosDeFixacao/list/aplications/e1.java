package exerciciosDeFixacao.list.aplications;

import exerciciosDeFixacao.list.entities.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class e1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantidade = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for(int i = 0; i < quantidade; i++){
            System.out.println();
            System.out.printf("Emplyoee #%d\n", i + 1);
            System.out.print("Id: ");
            Long id = sc.nextLong();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Funcionario(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Long idProcura = sc.nextLong();

        Funcionario funcionario = list.stream().filter(x -> x.getId().equals(idProcura)).findFirst().orElse(null);

        if(funcionario == null) System.out.println("This id does not exis");
        else{
            System.out.print("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            porcentagem /= 100;

            double novoSalary = funcionario.getSalary() + funcionario.getSalary() * porcentagem;
            funcionario.setSalary(novoSalary);
        }

        System.out.println();
        System.out.println("List of employees");

        for(Funcionario f : list){
            System.out.println(f);
        }

        sc.close();
    }
}
