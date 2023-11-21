package exerciciosDeFixacao.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){

            String line = bf.readLine();

            Set<LogEntry> set = new HashSet<>();


            while(line != null){
                String[] fields = line.split(" ");

                String name = fields[0];
                LocalDateTime date = LocalDateTime.ofInstant(Instant.parse(fields[1]), ZoneId.of("Z"));

                set.add(new LogEntry(name, date));

                line = bf.readLine();
            }

            System.out.println("Total users: " + set.size());


        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();

    }
}
