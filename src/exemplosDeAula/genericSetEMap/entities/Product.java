package exemplosDeAula.genericSetEMap.entities;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        return price.compareTo(product.price);
    }

    @Override
    public String toString() {
        return  name + ", " + String.format("%.2f", price);
    }
}
