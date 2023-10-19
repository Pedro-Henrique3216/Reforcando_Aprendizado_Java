package exemplosDeAula.generics.curingas;

public class Circle implements Shape {

    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

}
