package entities;

public class Product {

    public String name;
    public double price;
    public int quntity;



    public double totalValueInStock(){
        return this.price * this.quntity;
    }

    public void addProducts(int quantity){
        this.quntity += quantity;
    }

    public void removeProducts(int quantity){
        this.quntity -= quantity;
    }

}
