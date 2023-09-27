package exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.metodosAbstratos;

import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
