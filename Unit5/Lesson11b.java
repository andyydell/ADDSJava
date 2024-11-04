//Andy Dell'Orfano
//11/4/24
//Hw 11 b

package Unit5;

public class Lesson11b {
    public static double mystery(double x, double y){
    double result = (x + y) / (y - x);
    //This part of the function determines what the result of the function is
    //In the case of x=3, y=2, the function would produce (3+2)/(2-3) = 5/-1 = -5
    return result;
    //This part of the function is extremely important because it means that the object will present a double
    //That the program can use
    }   
    public static void main(String[] args) {
        System.out.println(mystery(3, 2));
    }

}
