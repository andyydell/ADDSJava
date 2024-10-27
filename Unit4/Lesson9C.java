//Andy Dell'Orfano
//Hw 9 C
package Unit4;
import java.util.Scanner;
import java.util.Random;
public class Lesson9C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int i = 0;
        int r;
        int BOUND = 10;
        double average;
        int TIMES = 1000;
        double total = 0;
        while (i <TIMES){
            r = rng.nextInt(BOUND);
            total = total +r;
            i++;
        }
        average = total / (double)TIMES;
        System.out.println(average);
    }
    //The program still works it is just closer to the median because there are more numbers likely to be generated on both sides.
}
