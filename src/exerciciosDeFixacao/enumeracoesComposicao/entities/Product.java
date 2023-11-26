package exerciciosDeFixacao.enumeracoesComposicao.entities;

public class Product extends exemplosDeAula.Product {

    public Product(String name, Double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + ", ");
        sb.append("$" + String.format("%.2f", getPrice()));
        return sb.toString();
    }
}
