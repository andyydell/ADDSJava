package AT05;
//Andy Dell'Orfano
//Challenge 1
//10/23/24
import java.util.Scanner;
import java.util.Random;
public class Problem1 {
    public static void main(String[] args) {
         Random rng = new Random();
        for(int i = 0; i < 100; i++) {
            int randomNumber = rng.nextInt(100);
            System.out.println("The random number is: " + randomNumber);
        }
    }
}