package exerciciosDeFixacao.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            Teacher teacher = new Teacher(1L, "João");
            teacher.createCurso("A");
            teacher.createCurso("B");
            teacher.createCurso("C");

            System.out.print("How many students for course A? ");
            int quantity = sc.nextInt();

            for(int i = 0; i < quantity; i++){
                teacher.getCurso("A").addUser(new Users(sc.nextLong(), sc.next()));
            }

            System.out.print("How many students for course B? ");
            quantity = sc.nextInt();

            for(int i = 0; i < quantity; i++){
                teacher.getCurso("B").addUser(new Users(sc.nextLong(), sc.next()));
            }

            System.out.print("How many students for course C? ");
            quantity = sc.nextInt();

            for(int i = 0; i < quantity; i++){
                teacher.getCurso("C").addUser(new Users(sc.nextLong(), sc.next()));
            }

            Set<Users> set = new HashSet<>();

            for(Cursos c : teacher.getCursos()){
                for(Users u : teacher.getCurso(c.getName()).getListUsers()){
                    set.add(u);
                }
            }

            System.out.println("Total students: " + set.size());

        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();


    }
}
