//Andy Dell'Orfano
//Test Unit 3/4
//Part B

package Test34;
import java.util.Scanner;
public class PracticalB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 different integers: ");
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        //Establishes the inputs

        int firstPrint = 0;
        int secondPrint = 0;
        int thirdPrint = 0;
        //Establishes print order variables

        if (first > second && first > third) {
            firstPrint = first;
            if (second > third) {
                secondPrint = second;
                thirdPrint = third;
            } else {
                secondPrint=third;
                thirdPrint = second;
            }
        } else if (second > first && second > third) {
            firstPrint = second;
            if (first > third) {
                secondPrint = first;
                thirdPrint = third;
            } else {
                secondPrint=third;
                thirdPrint = first;
            }
        } else {
            firstPrint = third;
            if (second > first) {
                secondPrint = second;
                thirdPrint = first;
            } else {
                secondPrint=first;
                thirdPrint = second;
            }
        }
        //The function that moves the numbers around

        System.out.printf("The numbers in order of greatest to least are: %d, %d, and %d", firstPrint, secondPrint, thirdPrint);
    }
}
