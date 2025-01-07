package InClass;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Text {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("scores.txt");
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()) {
            System.out.println(in.next());
        }
        in.close();
    }
}