//Andy Dell'Orfano
//Unit 3/4 test
//Part A

package Test34;

public class PracticalA {
    public static void main(String[] args) {
        int total = 0;
        int count = 100;
        int i =0;
        for (i = 0; i <= count; i++) {
            total = total + i;
        }
        i = i-1;
        double avg = (double)total/i;
        System.out.println("The average is: " + avg);
    }
}
