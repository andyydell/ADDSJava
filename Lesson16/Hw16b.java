//Andy Dell'Orfano
//12/10/25
//Hw b

package Lesson16;
import java.util.Scanner;
public class Hw16b {
    public static double average(double... values){
        double length = values.length;
        double total = 0;
        double sum=0;
        for (int i = 0; i < length; i++){
            sum += values[i];
        }

        double avg = sum/length;  
        return avg;      
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] x = new double[1000];
        int currentSize = 0;
        System.out.print("Enter values to take the average or q to end: ");
        for(int i =0; i>=0; i++ ){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                break;
            }else {
                x[i] = in.nextDouble();
                currentSize++;
            }
        }
        double[] y = new double[currentSize];
        for (int i =0; i < currentSize; i++){
            y[i] = x[i];
        }
        double avg = average(y);
        System.out.println(avg);
    }
}
