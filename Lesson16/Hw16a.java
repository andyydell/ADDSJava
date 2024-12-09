//Andy Dell'Orfano
//12/9/24
//hw 16 a

package Lesson16;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Hw16a {
    public static double[] dropScore(double[] array, double term){
        int count = 0;
        int index = 0;
        for (int i =0; i<array.length; i++ ){
            if(array[i] == term){
                count ++;
            }
        }
        if (count == 0){
            return array;
        } else {
            double[] finalArray = new double[array.length-1];
            for (int i=0; i<array.length; i++){
                if (array[i] != term){
                    finalArray[index++] = array[i];
                }
            }
            return finalArray;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[20];

        System.out.print("Enter upt to 20 quiz scores or q to quit: ");
        for (int i=0; i <=20; i++){
            if (in.hasNext("q") || in.hasNext("Q")){
                break;
            } else {
                scores[i] = in.nextDouble();
            }
        }
        for (int i =0; i<scores.length; i++){
            int x = i+1;
            System.out.println("Quiz " + x + ": " + scores[i]);
        }
        System.out.print("Would you like to drop a score? If yes enter y: ");
        if (in.hasNext("y") || in.hasNext("Y")){
            System.out.print("Which one? ");
            double score = in.nextDouble();
            dropScore(scores, score);
            for (int i =0; i<scores.length; i++){
                int x = i+1;
                System.out.println("Quiz " + x + ": " + scores[i]);
                in.next();
            }
        } else {
             for (int i =0; i<scores.length; i++){
                int x = i+1;
                System.out.println("Quiz " + x + ": " + scores[i]);
                in.next();
            }
        }
    }
}
