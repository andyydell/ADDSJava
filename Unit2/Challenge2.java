package Unit2;
import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ten-digit phone number: ");
        String number = input.nextLine();
        String areaCode = number.substring(0,3);
        String first = number.substring(3,6);
        String last = number.substring(6);
        System.out.println("The phone number is (" + areaCode + ") "+first+"-"+last);
    }
}
