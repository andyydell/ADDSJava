//Andy Dell'Orfano
//12/16/24

package Lesson18;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Hw18c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> temps = new ArrayList<Integer>();
        for (int i = 0; i >=0; i++){
            System.out.print("Enter a temperature value or 'q' to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            }else{
                Integer temp = in.nextInt();
                temps.add(temp);
            }
        }
        Collections.sort(temps);
        for (int i =0; i <temps.size(); i++){
            System.out.print(temps.get(i));
            if (temps.get(i)==temps.get(0)){
                System.out.print(" <= lowest");
            }
            System.out.println("");
        }
    }
}
