package exemplosDeAula.manipulandoListasAraysEMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Ana");
        list.add("Bob");
        list.add("Alex");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for(String x : list){
            System.out.println(x);
        }

        list.remove("Ana");
        list.remove(1);

        System.out.println("----------------------");
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------");

        System.out.println("Index of Bob " + list.indexOf("Bob"));
        System.out.println("Index of Marco " + list.indexOf("Marco"));

        System.out.println("----------------------");

        list.add("Bento");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);
    }
}
