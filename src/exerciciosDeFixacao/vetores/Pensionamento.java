package exerciciosDeFixacao.vetores;

public class Pensionamento {

    private String nome;
    private String email;

    public Pensionamento(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return nome + ", " + email;
    }
}
