package exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double tax() {
        Double tax;
        if(getAnualIncome() < 20000){
            tax = (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
        } else{
            tax = (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
        }

        return tax;
    }
}
