package exerciciosDeFixacao.estruturaCondicional;

import java.util.Scanner;

public class e5 {

    public static void main(String[] args) {

        item i1 = new item(1, "Cachorro quente", 4.00);
        item i2 = new item(2, "X-Salada", 4.50);
        item i3 = new item(3, "X-Bacon", 5.00);
        item i4 = new item(4, "Torrada simples", 2.00);
        item i5 = new item(6, "Refrigerante", 1.50);

        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        String produto;
        double sum;
        if(codigo == i1.getCodigo()){
            sum = i1.getPreco() * quantidade;
            produto = i1.getEspecificacao();
        } else if(codigo == i2.getCodigo()) {
            sum = i2.getPreco() * quantidade;
            produto = i2.getEspecificacao();
        } else if(codigo == i3.getCodigo()) {
            sum = i3.getPreco() * quantidade;
            produto = i3.getEspecificacao();
        }else if(codigo == i4.getCodigo()) {
            sum = i4.getPreco() * quantidade;
            produto = i4.getEspecificacao();
        } else {
            sum = i5.getPreco() * quantidade;
            produto = i5.getEspecificacao();
        }

        System.out.printf("Voce Comprou o produto %s e o Total foi: R$ %.2f%n", produto, sum);




        sc.close();


    }
}

class item {

    private int codigo;
    private String especificacao;
    private double preco;

    public item(int codigo, String especificacao, double preco) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public double getPreco() {
        return preco;
    }

}
