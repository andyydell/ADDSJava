//Andy Dell'Orfano
//1/14/25
package Lesson22;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Hw22B {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Lesson22/birthyears.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(",");
            String name = lineScanner.next().trim();
            try {
                double numb = Double.parseDouble(lineScanner.next().trim());
                System.out.printf("%s was born in %4.0f.%n", name, numb);
            } catch (NumberFormatException exception){
                System.out.println("I do not know what year " + name + " was born.");
            }
        }   
    }
}
