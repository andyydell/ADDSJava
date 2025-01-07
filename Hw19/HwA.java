//Andy Dell'Orfano
//Hw 19 A
package Hw19;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class HwA {
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int minIndex=0;
        for (int i = 0; in.hasNext(); i++) {
            list.add(in.nextInt());
            if (list.get(i) <= min){
                min = list.get(i);
                minIndex = i;
            }
        }

        Scanner in2 = new Scanner(inputFile);
        for(int i = 0; in2.hasNext(); i++){
            if (list.get(i) != min){
                System.out.printf("%3d%n", list.get(i));
            }else {
                System.out.printf("%3d <= Lowest %n", list.get(i));
            }
        }
        
    }
}
