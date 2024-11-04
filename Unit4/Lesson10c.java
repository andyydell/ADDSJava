//Andy Dell'Orfano
//Hw 10 c

package Unit4;

import java.util.Scanner;

public class Lesson10c {
     public static void main(String[] args) throws Exception {
        // cookies are $0.99 apiece.
        final double COST_OF_COOKIE = 0.99;

        // prompt user for the number of cookies they are buying.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of cookies: ");
        int num = in.nextInt();

        // calculate the cost before discount.
        double cost = num * COST_OF_COOKIE;

        // Use conditional statements to determine what discount is.
        double discount = 0;
        if (num > 24) {
            discount = 0.15;
        } else if (num > 12) {
            discount = 0.05;
        } else if (num > 6) {
            discount = 0.025;
        }

        // calculate and display values to user.
        cost = cost * (1 - discount);
        System.out.printf("For %d cookies, your total cost is $%.2f", num, cost);
    }
}
