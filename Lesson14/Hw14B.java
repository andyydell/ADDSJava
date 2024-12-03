package Lesson14;
//Andy Dell'Orfano
//12/3/24
//Hw14b
import java.util.Scanner;
public class Hw14B{
    public static void main(String[] args) {
        double[] numbers = {2.2, 1.0, 3.7, 4.1, 88.0};

        for (int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }
        double avg = (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4])/5;
        System.out.println("The average is " + avg);

    }
    

}