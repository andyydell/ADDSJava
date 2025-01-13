//Andy Dell'Orfano
//1/12/25

package Lesson21;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Hw21A {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Lesson21/Top5Unemployment.txt");
        Scanner in = new Scanner(file);
        System.out.println("--------------------------------------------------------------------");
        String s = "Top 5 Unemployment Rates";
        System.out.printf("%50s%n", s);
        System.out.println("--------------------------------------------------------------------");        while (in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            String country = lineScanner.next().trim();
            double rate = Double.parseDouble(lineScanner.next().trim());
            int rank = Integer.parseInt(lineScanner.next().trim());
            String region = lineScanner.next().trim();
;
            System.out.printf("Rank: #%3d | %20s | %8.2f | %20s%n", rank, country, rate, region);
        }
        System.out.println("--------------------------------------------------------------------");    }
}
