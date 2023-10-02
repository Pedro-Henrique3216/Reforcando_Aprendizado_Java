package exemplosDeAula.excecoesPersonalizadas.model.entities;

import exemplosDeAula.excecoesPersonalizadas.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for upadte must be future");
        } else if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber
                + ", check-in: " + sdf.format(checkIn)
                + ", check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights";
    }


}
