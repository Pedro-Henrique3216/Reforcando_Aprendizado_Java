package exerciciosDeFixacao.vetores;

public class Aluno {

    private String nome;
    private double notaPSemestre;
    private double notaSSemestre;

    public Aluno(String nome, double notaPSemestre, double notaSSemestre) {
        this.nome = nome;
        this.notaPSemestre = notaPSemestre;
        this.notaSSemestre = notaSSemestre;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaPSemestre() {
        return notaPSemestre;
    }

    public double getNotaSSemestre() {
        return notaSSemestre;
    }
}
