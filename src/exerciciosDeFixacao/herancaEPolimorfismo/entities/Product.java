package exerciciosDeFixacao.herancaEPolimorfismo.entities;

public class Product extends exemplosDeAula.Product {

    public Product(String name, Double price) {
        super(name, price);
    }

    public String priceTag(){
        return getName() + " $ " + String.format("%.2f", getPrice());
    }

}
