//Andy Dell'Orfano

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Hw20B {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("Lesson20/characters.txt");
        Scanner in = new Scanner(inputFile);
            in.useDelimiter("");
       int count = 0;
       int dCount = 0;
       int lCount = 0;
       while (in.hasNext()) {
            if(in.hasNextDouble()){
                dCount++;
            } else {
                lCount++;
            }
            char c = in.next().charAt(0);
            System.out.print(c);
            count++;
       }
       System.out.printf("Count = %d%nDigits = %d%nLetters = %d%n", count, dCount, lCount);
   

    }
}
