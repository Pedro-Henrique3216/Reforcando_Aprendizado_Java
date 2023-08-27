package exerciciosDeFixacao.orientacaoAObjeto.entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;


    public double notaFinal(){
        return this.nota1 + this.nota2 + this.nota3;
    }
    public String verificaSePassou(){
        double minimoParaAprovar = 60;
        if(notaFinal() > minimoParaAprovar){
            return "Pass";
        } else {
            double missing = notaFinal() - minimoParaAprovar;
            return "Failed \nMissing " + String.format("%.2f", Math.abs(missing)) + " Points";
        }

    }

    @Override
    public String toString(){
        return "Final Grade = " + String.format("%.2f", notaFinal()) + "\n" + verificaSePassou();
    }

}
