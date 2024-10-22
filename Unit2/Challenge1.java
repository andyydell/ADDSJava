//Andy Dell'Orfano
//Challenge 1
//10/22/24

package Unit2;
import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of money in dollars and cents: ");
        double amount = input.nextDouble();
        int whole = (int)amount;
        double cents = amount - (double)whole;
        cents = cents *100;
        cents = Math.round(cents);
        System.out.printf("There are %d dollars and %.0f cents", whole, cents);
    }
}
