package exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.metodosAbstratos;

import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract Double area();
}
