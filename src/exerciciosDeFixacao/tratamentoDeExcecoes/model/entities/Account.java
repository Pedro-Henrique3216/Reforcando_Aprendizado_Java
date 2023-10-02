package exerciciosDeFixacao.tratamentoDeExcecoes.model.entities;

import exerciciosDeFixacao.tratamentoDeExcecoes.model.exceptions.WithdrawException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        if(withdrawLimit < amount){
            throw new WithdrawException("The amount exceeds withdraw limit");
        }
        if(balance < amount){
            throw new WithdrawException("No enough balance");
        }

        balance -= amount;
    }
}
