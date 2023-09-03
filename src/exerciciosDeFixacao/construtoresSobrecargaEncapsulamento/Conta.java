package exerciciosDeFixacao.construtoresSobrecargaEncapsulamento;

public class Conta {

    private String numeroDaConta;
    private String titular;
    private double saldo;

    public Conta(String numeroDaConta, String titular){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public Conta(String numeroDaConta, String titular, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroDaConta(){
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
        saldo -= valor - 5;
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
