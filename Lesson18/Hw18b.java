//Andy Dell'Orfano
//12/16/24
package Lesson18;
import java.util.ArrayList;
import java.util.Scanner;
public class Hw18b {
    public static void main(String[] args){
        ArrayList<Double> values = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        double length = 0;
        double total = 0;
        for (int i = 0; i >=0; i++){
            System.out.print("Enter a test score or 'q' to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")){
                in.next();
                break;
            }else{
                Double value = in.nextDouble();
                values.add(value);
                total = total + value;
                length++;
            }
        }
        for (int i =0; i < length; i++){
            double x = values.get(i);
            System.out.printf("%.2f%n", x);
        }
        System.out.println("The average of the scores is: " + (total/length));
    }
}
