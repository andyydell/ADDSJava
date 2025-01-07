//Andy Dell'Orfano
//Hw19 B
package Hw19;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class HwB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("quizzesMod.txt");
        PrintWriter out = new PrintWriter(outputFile);
        double total = 0;
        int i = 0;
        double avg = 0;
        while (in.hasNext()) {
            double score = in.nextDouble();
            if (i+1 < 10){
                out.printf("Quiz 00%d : %6.2f%n", i+1, score);
            } else{
                out.printf("Quiz 0%d : %6.2f%n", i+1, score);
            }
            total = total+score;
            i++;
        }
        avg = total / (double)i;
        out.println("-----------------");
        out.printf("Avg = %11.2f", avg);
        in.close();
        out.close();
    }
}
