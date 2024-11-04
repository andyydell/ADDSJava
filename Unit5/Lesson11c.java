//Andy Dell'Orfano
//11/4/24
//Hw 11 c

package Unit5;
import java.util.Scanner;
public class Lesson11c {
    public static double sphereVolume(double r) {
        double volume = (4.0/3.0) * Math.PI * r * r *r;
        return volume;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius amount: ");
        double radius = in.nextInt();
        double volume = sphereVolume(radius);
        System.out.printf("The volume for the radius %.2f is %.2f", radius, volume);
    }
}
