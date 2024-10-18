import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        while (true){
            System.out.print("Enter a number, or enter q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                total = total + in.nextDouble();
            }
            System.out.println(total);
        }
    }
}
