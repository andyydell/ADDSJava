//Andy Dell'Orfano
//12/9/24
//hw 16 a

package Lesson16;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Hw16a {
    public static double[] dropScore(double[] array, int term){
        int count = 0;
        int index = 0;
        double MOE = .01;
        for (int i =1; i<array.length; i++ ){
            if(i == term){
                count++;
            }
        }
        if (count == 0){
            System.out.println("We have not taken that many quizes!");
            return array;
        } else {
            double[] finalArray = new double[array.length-1];
            for (int i=1; i<array.length; i++){
                if (i != term){
                    finalArray[index++] = array[i-1];
                }
            }
            return finalArray;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] scores = new double[20];
        int currentSize = 0;
        System.out.print("Enter upt to 20 quiz scores or q to quit: ");
        for (int i=0; i <=20; i++){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                break;
            } else if (in.hasNextDouble()) {
                scores[i] = in.nextDouble();
                currentSize++;
            } else {
                in.next();
            }
        }
        System.out.println("\nYour quiz scores are: ");
        for (int i =0; i<currentSize; i++){
            int x = i+1;
            System.out.println("Quiz " + x + ": " + scores[i]);
        }
        in.nextLine();
        System.out.print("\nWould you like to drop a score? If yes enter y: ");
        
        String response = in.nextLine();
        if (response.equalsIgnoreCase("y")){
            System.out.print("Which quiz number? ");
            int score = in.nextInt();
            double[] scoresNew = new double[20];
            scoresNew = dropScore(scores, score);

            for (int i =0; i<currentSize-1; i++){
                int x = i+1;
                System.out.println("Quiz " + x + ": " + scoresNew[i]);
            }
        } else {
             for (int i =0; i<currentSize; i++){
                int x = i+1;
                System.out.println("Quiz " + x + ": " + scores[i]);
            }
        }
    }
}
