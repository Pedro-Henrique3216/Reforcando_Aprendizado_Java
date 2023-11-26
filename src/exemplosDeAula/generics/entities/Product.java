package exemplosDeAula.generics.entities;

public class Product extends exemplosDeAula.Product implements Comparable<Product> {

    public Product(String name, Double price) {
        super(name, price);
    }

    @Override
    public int compareTo(Product product) {
        return getPrice().compareTo(product.getPrice());
    }

}
