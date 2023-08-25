import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        System.out.println("Voce digitou " + x);

        int y = sc.nextInt();
        System.out.println(y);

        double z = sc.nextDouble();
        System.out.println(z);

        char c = sc.next().charAt(0);
        System.out.println(c);




        sc.close();
    }
}
