//Andy Dell'Orfano
//Hw9 Part A
package Unit4;
import java.util.Scanner;
public class Lesson9A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        double testGrade;
        double averageGrade;
        double totalGrade = 0;
        double x = 0;
        while (i == 1){
            System.out.print("Enter a test grade or enter a negative value to quit: ");
            testGrade = in.nextDouble();
            if (testGrade >=0){
                totalGrade = totalGrade + testGrade;
                x++;
            } else {
                i++;
            }
        
        }
        averageGrade = totalGrade / x;
        System.out.println("The student's average grade is " + averageGrade + "%.");
    }
    

}
