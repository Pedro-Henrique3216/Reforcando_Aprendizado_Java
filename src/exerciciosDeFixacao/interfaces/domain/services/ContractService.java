package exerciciosDeFixacao.interfaces.domain.services;

import exerciciosDeFixacao.interfaces.domain.entities.Contract;
import exerciciosDeFixacao.interfaces.domain.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service){
        this.service = service;
    }
    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for(int i = 1; i <= months; i++){
            LocalDate date = contract.getDate().plusMonths(i);

            double interest = service.interest(basicQuota, i);
            double paymentFee = service.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + paymentFee;
            contract.add(new Installment(date, quota));
        }
    }
}
