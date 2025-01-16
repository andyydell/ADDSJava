//Andy Dell'Orfano
//1/16/25
package Lesson23;
import java.util.Scanner;
public class Hw23A {
    public static int quizScore(Scanner in){
        System.out.print("Enter a quiz score: ");
        int a = in.nextInt();
        if (a > 100 || a <0){
            throw new ArithmeticException(a + " is an invalid score");
        }else {
            return a;
        }
    }
    public static void main(String[] args) {
        
        while (true){
            Scanner in = new Scanner(System.in);
            try {
                int score = quizScore(in);
                System.out.println("Your score is " + score);
            } catch (ArithmeticException exception){
                System.out.println(exception.getLocalizedMessage() + " you will have to restart the program");
                break;
            }
        }
    }
}
