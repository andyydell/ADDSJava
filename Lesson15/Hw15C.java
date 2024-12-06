//Andy Dell'Orfano
//Hw 15C
package Lesson15;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Hw15C {
    public static int linearSearch(int[] array, int target){
        for (int i =0; i<array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAXRANGE = 1000000;
        Random rng = new Random();

        int[] values = new int[MAXRANGE];

        for (int i =0; i < MAXRANGE-1; i++){
            values[i] = rng.nextInt(MAXRANGE);
        }
        
        for (int i = 0; i <10; i++){
            int target = rng.nextInt(MAXRANGE);
        long startTimeL = System.currentTimeMillis();
        int linearSearch = linearSearch(values, target);
        long endTimeL = System.currentTimeMillis();
        long timeL = endTimeL-startTimeL;
        if (linearSearch != -1){
            System.out.println("The value " + target+ " is present in the array!");
        } else {
            System.out.println("The value " + target+ " is not present in the array!");
        }
        System.out.println("The Linear Search Method took " + timeL+ " seconds.");

        Arrays.sort(values);
        long startTimeB = System.currentTimeMillis();
        int binaryResult = Arrays.binarySearch(values, target);
        long endTimeB = System.currentTimeMillis();
        long timeB = endTimeB - startTimeB;
        if (binaryResult != -1){
            System.out.println("The value " + target+ " is present in the array!");
        } else {
            System.out.println("The value " + target+ " is not present in the array!");
        }
        System.out.println("The Binary Search Method took " + timeB+ " seconds.");
        //The binary search method seems to be significantly more efficient both when the range is higher and lower
    }
}
}
