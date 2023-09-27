package exerciciosDeFixacao.herancaEPolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufactureDate = manufacture;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" (used) $ ");
        sb.append(String.format("%.2f", getPrice()));
        sb.append(" (Manafcture date: ");
        sb.append(sdf.format(manufactureDate) + ")");

        return sb.toString();
    }
}
