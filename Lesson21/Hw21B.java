//Andy Dell'Orfano
//1/12/25
package Lesson21;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Hw21B {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Lesson21/sales_by_cat.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            String industry = lineScanner.next().trim();
            String name = lineScanner.next().trim();
            String salesString = lineScanner.next().trim();
            double sales;
            if (salesString.equalsIgnoreCase("n/a")) {
                sales = 0.0;
            } else {
                sales = Double.parseDouble(salesString);
            }
            System.out.printf("%10s | %10s | $%7.2f%n", industry, name, sales);
        }
    }
}
