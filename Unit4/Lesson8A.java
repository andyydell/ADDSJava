package Unit4;
//Andy Dell'Orfano
//Assignment Part A
//10/18/24
import java.util.Scanner;
public class Lesson8A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double percent = 100;
        int years = 0;
        while (percent >= 1){
            years = years +30;
            percent = (percent/2);
        }
        System.out.println("It will take " + years + " years to decay to less than 1% and there will be " + percent + "% of the material remaining.");
    }
}
