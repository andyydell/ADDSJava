//Andy Dell'Orfano
//1/14/25

package Lesson22;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Hw22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a file name or '#' to quit: ");
        String fileName = in.nextLine();
        if (fileName.equals("#")){
            System.out.println("CLosing program");
            in.close();
            return;
        }
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()) {
                String word = fileScanner.next();
                System.out.println(word);
            }
        } catch (FileNotFoundException exception){
            System.err.println("File not found! Exiting program.");
            return;
        }
    }
}
