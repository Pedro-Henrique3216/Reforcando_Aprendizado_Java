package exerciciosDeFixacao.construtoresSobrecargaEncapsulamento;

public class Conta {

    private int numeroDaConta;
    private String titular;
    private double saldo;

    public Conta(int numeroDaConta, String titular){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public Conta(int numeroDaConta, String titular, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= (valor + 5);
    }

    @Override
    public String toString(){
        return "Account " + getNumeroDaConta()
                + ", Holder: "
                + getTitular()
                + ", Balance: $ "
                + String.format("%.2f", getSaldo());
    }

}
