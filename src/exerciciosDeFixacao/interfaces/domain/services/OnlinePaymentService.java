package exerciciosDeFixacao.interfaces.domain.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);
}
