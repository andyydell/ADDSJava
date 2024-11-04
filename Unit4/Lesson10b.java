//Andy Dell'Orfano
//Hw 10 b

package Unit4;

import java.util.Scanner;

public class Lesson10b {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount;
        if (num > 6) {
            discount = 0.05;
        } else if (num > 12) {
            discount = 0.10;
        }
        System.out.println("Discount = " + discount);  
        */
        //The code has a compile time error because discount is never initialized
        //There is also a logic error because the else if condition can never happen as it is more restrictive than the initial if condition
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        double discount = 0;
        if (num > 12) {
            discount = 0.05;
        } else if (num > 6) {
            discount = 0.10;
        }
        System.out.println("Discount = " + discount);  
    }
}
