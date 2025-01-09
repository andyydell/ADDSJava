//Andy Dell'Orfano
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Hw20A {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("Lesson20/consumerData.txt");
        Scanner in = new Scanner(inputFile);
         in.useDelimiter("[,\\s\\n]+");
        System.out.println("---------------------------------------------");
        System.out.println("ID     |            Name |          Balance |");
        System.out.println("---------------------------------------------");
        int count = 0;
        while (in.hasNext()) {
            count++;
            int Id = in.nextInt();       
            String name = in.next();            
            double balance = in.nextDouble();   
            System.out.printf("%06d | %15s | $%15.2f |%n", Id, name, balance);
        }

    }
}


