package exerciciosDeFixacao.interfaces.applications;

import exerciciosDeFixacao.interfaces.domain.entities.Contract;
import exerciciosDeFixacao.interfaces.domain.entities.Installment;
import exerciciosDeFixacao.interfaces.domain.services.ContractService;
import exerciciosDeFixacao.interfaces.domain.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Contract contract = new Contract(numero, data, valor);
        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, parcelas);

        System.out.println("Parcelas: ");

        for(Installment i : contract.getInstallments()){
            System.out.println(i);
        }

        sc.close();
    }
}
