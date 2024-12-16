//Andy Dell'Orfano
//12/16/24
package Lesson18;
import java.util.Scanner;
import java.util.ArrayList;
public class Hw18a {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int length = 0;
        for (int i = 0; i>=0; i++){
            System.out.print("Enter a name or '#' to quit: ");
            if (in.hasNext("#")){
                in.next();
                break;
            }else {
                String input = in.nextLine();
                names.add(input);
                length++;
            }
        }
        for (int i =0; i <length; i++){
            System.out.println(names.get(i));
        }
    }
}
