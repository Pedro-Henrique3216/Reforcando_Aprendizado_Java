package exerciciosDeFixacao.classesAbstratasMetodosAbstratos.entities;

public abstract class TaxPayer {

    private String name;
    private Double AnualIncome;

    public TaxPayer(String name, Double AnualIncome) {
        this.name = name;
        this.AnualIncome = AnualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return AnualIncome;
    }

    public abstract Double tax();

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }
}
