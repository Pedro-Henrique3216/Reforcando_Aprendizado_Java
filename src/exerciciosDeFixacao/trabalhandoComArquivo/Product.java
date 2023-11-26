package exerciciosDeFixacao.trabalhandoComArquivo;

public class Product extends exemplosDeAula.Product {

    public Product(String name, Double price, Integer quantity) {
        super(name, price, quantity);
    }


    public double total(){
        return getPrice() * getQuantity();
    }

    @Override
    public String toString() {
        return getName() + "," + String.format("%.2f", total());
    }
}
