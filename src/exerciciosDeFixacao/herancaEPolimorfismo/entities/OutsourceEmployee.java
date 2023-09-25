package exerciciosDeFixacao.herancaEPolimorfismo.entities;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourceEmployee() {
        super();
    }

    @Override
    public Double payment() {
        return super.payment() + (additionalCharge * 110) / 100;
    }
}
