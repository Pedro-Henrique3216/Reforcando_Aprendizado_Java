package exemplosDeAula.classesCriadasComOOParaExemplos.entities;

public class Product extends exemplosDeAula.Product {

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public Product(String name, double price) {
       super(name, price);
    }



    public double totalValueInStock(){
        return getPrice() * getQuantity();
    }

    public void addProducts(int quantity){
        setQuantity(getQuantity() + quantity);
    }

    public void removeProducts(int quantity){
        setQuantity(getQuantity() - quantity);
    }

    @Override
    public String toString(){
        return getName() + ", $ " + String.format("%.2f", getPrice()) + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
