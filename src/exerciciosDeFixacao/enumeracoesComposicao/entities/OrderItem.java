package exerciciosDeFixacao.enumeracoesComposicao.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Product product){
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product + ", ");
        sb.append("Quantity: " + quantity + ", ");
        sb.append("Subtotal: $" + String.format("%.2f", subTotal()));

        return sb.toString();
    }
}
