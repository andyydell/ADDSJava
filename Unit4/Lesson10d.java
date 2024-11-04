//Andy Dell'Orfano
// Hw 10 d

package Unit4;

public class Lesson10d {
    public static void main(String[] args) {
        int i =1;
        int y =1;
        int y2 =1;
        int rows = 5;
        while (i <= 5) {
            while ( rows - i>= y){
                System.out.print(".");
                y++;
            } while (y2<= i) {
                System.out.print(i);
                y2++;
            }
            i++;
            y = 1;
            y2 = 1;
            System.out.println();
        }
    }
}
