//Andy Dell'Orfano
//Hw B
package Lesson15;
import java.util.Scanner;
import java.util.Arrays;
public class Hw15B {
    public static void main(String[] args) {
        int[] values = new int[20];
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 20; i++){
            System.out.print("Enter an integer value or q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                break;
            } else {
                values[i] = in.nextInt();
            }
            count++;
        }
        for (int i =0; i < count; i++){
            if(i != count-1){
                System.out.print(values[i]+ ", ");
            } else {
                System.out.print(values[i]);
            }
        }
        System.out.println("");
        System.out.print("Enter an integer to scan for: ");
        int target = in.nextInt();
        int targetOcc = 0;
        for (int i =0; i<count; i++){
            if (values[i] == target){
                targetOcc++;
            }
        }
        System.out.println("The target integer of " + target+ " occurs " + targetOcc+ " times.");


    }
}
