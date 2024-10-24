package Unit4;
//Andy Dell'Orfano
//10/18/24
//PartB
import java.util.Scanner;
public class Lesson8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the APR? ");
        double apr = input.nextDouble();
        System.out.print("What is the initial balance? ");
        double balance = input.nextDouble();
        int years = 1;
        System.out.println("Year |      Int Earned      |       Balance($)      ");
        System.out.println("----------------------------------------------------");
        double interest;
        while (years <= 5) {
            interest = balance * (apr/100);
            System.out.printf(" %d   | %13.2f        | %15.2f     %n", years, interest, balance );
            balance = balance *(1+(apr/100));
            years = years + 1;
        }

    }
}
