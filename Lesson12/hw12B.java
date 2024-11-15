//Andy Dell'Orfano
//Hw12 B

package Lesson12;
import java.util.Scanner;
public class hw12B {
    public static double smallest(double x, double y, double z){        
        if (x<=y && x<=z){
            return x;
        } else if (y<=x && y<=z){
            return y;
        } else {
            return z;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        System.out.println(smallest(a,b,c));

    }
}
