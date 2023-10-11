package exemplosDeAula.tratamentoDeExececoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {

    public static void main(String[] args) {

        File flie = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(flie);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }

            System.out.println("Finally block executed");
        }
    }

}
