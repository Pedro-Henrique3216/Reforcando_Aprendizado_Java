package exemplosDeAula.generics.curingas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number n : source){
            destiny.add(n);
        }
    }

    public static void printList(List<?> list){
        for(Object n : list){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
