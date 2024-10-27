//Andy Dell'Orfano
//Hw9 Part B
package Unit4;
import java.util.Scanner;
public class Lesson9b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase, no numbers : ");
        String x = in.nextLine();
        int i =0;
        char p;
        int y=0;
        String A = "e";
        int xLength = x.length();
        char B = A.charAt(0);
        while (i < xLength){
        p = x.charAt(i);
            if(p == B){
                y++;
            } i++;
        }
        System.out.println("There are " + y + " e's.");

    }
}
