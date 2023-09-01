package exerciciosDeFixacao.metodosEstaticos;

public class CurrencyConverter {

    public static final double IOF = (double) 6 / 100;

    public static double valorConvertido(double dolar, double quanti){
        return dolar * quanti + (dolar * quanti * IOF);
    }

}
