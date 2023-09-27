package exemplosDeAula.classesAbstratasEMetodosAbstratos.application;

import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.classesAbstratas.Account;
import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.classesAbstratas.BusinessAccount;
import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.classesAbstratas.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Progam {

    public static void main(String[] args) {

//        Account acc1 = new Account(1001, "Alex", 1000.0); nao ira funcionar pois a classe é abstrata entao nao ira
//        instanciar
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 20.0);
        Account acc3 = new BusinessAccount(1003, "Joao", 1000.0, 50.0);

        List<Account> list = new ArrayList<>();

        list.add(acc3);
        list.add(acc2);

        double total = 0;
        for(Account ac : list){
            total += ac.getBalance();
            ac.deposit(10);
        }

        System.out.println(total);

        for(Account acc : list){
            System.out.println("Update balance for account " + acc.getNumber() + ": " + acc.getBalance());
        }
    }
}
