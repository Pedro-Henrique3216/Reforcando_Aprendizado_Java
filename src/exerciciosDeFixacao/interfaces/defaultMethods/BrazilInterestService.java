package exerciciosDeFixacao.interfaces.defaultMethods;

public class BrazilInterestService implements InterestService {

   private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
