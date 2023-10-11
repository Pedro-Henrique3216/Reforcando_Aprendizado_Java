package exemplosDeAula.interfaces.model.services;

import exemplosDeAula.interfaces.model.entities.CarRental;
import exemplosDeAula.interfaces.model.entities.Invoice;

import java.time.Duration;
import java.time.LocalDateTime;

public class RentalService {

    private Double princePerHour;
    private Double princePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double princePerHour, Double princePerDay, BrazilTaxService taxService) {
        this.princePerHour = princePerHour;
        this.princePerDay = princePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        LocalDateTime start = carRental.getStart();
        LocalDateTime finish = carRental.getFinish();

        double minutes = Duration.between(start, finish).toMinutes();
        double hours = Math.ceil(minutes / 60);
        double days =  Math.ceil(hours / 24);

        double basicPayment;

        if(hours > 12){
            basicPayment = princePerDay * days;
        } else{
           basicPayment = princePerHour * hours;
        }

        carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
    }
}
