package org.derryfield.math;
//Andy Dell'Orfano
//12/18/24
import org.derryfield.math.Geometry;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius for your sphere: ");
        double radius = in.nextDouble();
        double vol = Geometry.sphereVol(radius);
        double area = Geometry.sphereSurfArea(radius);

        System.out.println("The volume is " + vol);
        System.out.println("The surface area is "+ area);
    }
}
