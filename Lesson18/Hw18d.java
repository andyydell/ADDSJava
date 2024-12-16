//Andy Dell'Orfano
//12/16/24
package Lesson18;
import java.util.ArrayList;
import java.util.Scanner;
public class Hw18d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> series = new ArrayList<Integer>();
        while (true){
            System.out.print("Enter an integer or 'q' to quit: ");
            if (in.hasNext("q")||in.hasNext("Q")){
                in.next();
                break;
            }else{
                Integer value = in.nextInt();
                series.add(value);
            }
        }
        for (int i =0; i<series.size(); i++){
            if (series.get(i) % 2 !=0){
                series.remove(i);
                i--;
            }
        }
        for (int i = 0; i < series.size(); i++){
            System.out.println(series.get(i));
        }
    }
}
