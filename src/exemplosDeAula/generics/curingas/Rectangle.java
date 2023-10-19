package exemplosDeAula.generics.curingas;

public class Rectangle implements Shape {

    private Double width;
    private Double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }

}
