//Andy Dell'Orfano
//12/11/24
//Hw 17 b

package Lesson17;

public class Hw17b {
    public static void printArray(int[][] array){
        for (int i = 0; i <array.length; i++){
            for (int x = 0; x<array[i].length; x++){
                System.out.print(array[i][x]);
                if (x < array[i].length-1){
                    System.out.print(", ");
                } else {
                    System.err.println("");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] array = {
            {8,6,7},
            {5,3,0}
        };
        int[][] array2 = {
            {0,7,6,5},
            {2,2,0,1},
            {8,4,5,7}
        };

        System.out.println("Array 1 is: ");
        printArray(array);
        System.out.println("");

        System.out.println("Array 2 is: ");
        printArray(array2);
    }
}
