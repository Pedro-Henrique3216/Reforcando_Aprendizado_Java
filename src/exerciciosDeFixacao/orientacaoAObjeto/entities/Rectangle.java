package exerciciosDeFixacao.orientacaoAObjeto.entities;

public class Rectangle {

    public double width;
    public double height;


    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return 2 * (this.height + this.width);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

}
