//Andy Dell'Orfano
//Hw 9 D
package Unit4;
//Methods:
// An object could get the number from the die and store that number
// An object could influence the way that the die generates values
import java.util.Scanner;
import java.util.Random;

class SixDie {
    Random rng = new Random();
    public int rrr;
    public SixDie die;
    public int result;
    public void roll() {
        result = 0;
        rrr = rng.nextInt(6);
        result = result + rrr;
    }
    public int view() {
        return result;
    }
}
public class Lesson9d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SixDie die = new SixDie();
        String input;
        int i = 1;
        while (i == 1) {
            System.out.print("Enter r to roll, d to display, or q to quit: ");
            input = in.nextLine();
            char inputChar = input.charAt(0);
            String rr = "r";
            char r = rr.charAt(0);
            String dd = "d";
            char d = dd.charAt(0);
            String qq = "q";
            char q = qq.charAt(0);
            if (inputChar == r) {
                die.roll();
            } else if (inputChar == d) {
                if (die.view() == 1){
                    System.out.println("+---------+");
                    System.out.println("|         |");
                    System.out.println("|    0    |");
                    System.out.println("|         |");
                    System.out.println("+---------+");
                } else if (die.view() == 2){
                    System.out.println("+---------+");
                    System.out.println("| 0       |");
                    System.out.println("|         |");
                    System.out.println("|       0 |");
                    System.out.println("+---------+");
                } else if (die.view() == 3){
                    System.out.println("+---------+");
                    System.out.println("| 0       |");
                    System.out.println("|    0    |");
                    System.out.println("|       0 |");
                    System.out.println("+---------+");
                } else if (die.view() == 4){
                    System.out.println("+---------+");
                    System.out.println("| 0     0 |");
                    System.out.println("|         |");
                    System.out.println("| 0     0 |");
                    System.out.println("+---------+");
                } else if (die.view() == 5){
                    System.out.println("+---------+");
                    System.out.println("| 0     0 |");
                    System.out.println("|    0    |");
                    System.out.println("| 0     0 |");
                    System.out.println("+---------+");
                } else {
                    System.out.println("+---------+");
                    System.out.println("| 0     0 |");
                    System.out.println("| 0     0 |");
                    System.out.println("| 0     0 |");
                    System.out.println("+---------+");
                } 
            } else if (inputChar == q) {
                i++;
            } else {
                System.err.println("Enter either r, d, or q.");
            }
        }
    }
}
