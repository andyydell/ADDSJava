//Andy Dell'Orfano
//2/2/25
package MowerProject.Mow;
import java.util.Scanner;
import MowerProject.Mow.Yard;
public class Mow {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clearScreen();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the heigh and width of the lawn: ");
        int height = in.nextInt();
        int width = in.nextInt();
        Yard lawn = new Yard(height, width);
        lawn.printLawn();

    }
}
