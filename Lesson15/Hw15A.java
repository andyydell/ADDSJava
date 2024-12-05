//Andy Dell'Orfano
//12/5/24
//Hw A

package Lesson15;
import java.util.Scanner;
import java.util.Arrays;
public class Hw15A {
    public static void main(String[] args) {
        double[] values = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ten values or q to quit: ");
        for (int i =0; i<10; i++){
            if(in.hasNext("Q") || in.hasNext("q")){
                break;
            }else{
                values[i] = in.nextDouble();
            }
        }
        for (int i = 0; i<10; i++){
            System.out.print("*" + values[i]);
        }
        System.out.print("*");
        System.out.println("");
        Arrays.sort(values, 0, values.length);
        for (int i = 0; i<9; i++){
            System.out.print(values[i]+", ");
        }
        System.out.print(values[9]);
    }
}
