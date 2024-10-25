package Unit4;
import java.util.Scanner;
public class DoLoopClasswork {
public static void main(String[] args) {
    double amount;
    Scanner in = new Scanner(System.in);
    do {
        System.out.print("Enter a dollar amount: ");
        amount = in.nextDouble();
        System.out.println("The amount is $" + amount);
    } while (amount >= 0);
}

}