package exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double tax;
        if(numberOfEmployees > 10){
            tax = getAnualIncome() * 0.14;
        } else{
            tax = getAnualIncome() * 0.16;
        }
        return tax;
    }
}
