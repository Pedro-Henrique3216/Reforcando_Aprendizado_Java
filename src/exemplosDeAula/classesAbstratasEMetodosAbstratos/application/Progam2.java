package exemplosDeAula.classesAbstratasEMetodosAbstratos.application;

import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.metodosAbstratos.Circle;
import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.enums.Color;
import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.metodosAbstratos.Rectangle;
import exemplosDeAula.classesAbstratasEMetodosAbstratos.entities.metodosAbstratos.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Progam2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int quantidade = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Shape #%d data:\n", i + 1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char forma = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            Shape shape;

            if(forma == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shape = new Rectangle(color, width, height);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(color, radius);
            }

            list.add(shape);
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape s : list){
            System.out.println(String.format("%.2f", s.area()));
        }


        sc.close();
    }

}
