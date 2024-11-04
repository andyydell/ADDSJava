//Andy Dell'Orfano
//11/4/24
//Hw 11a

package Unit5;
public class Lesson11a {
    public static void main(String[] args){
        double len = 2;
        //len = 2
        double result = cubeVolume(len);
        //result = len * len * len = 2^3 = 8
        System.out.println(result);
        len = 10;
        //len = 10
        result = cubeVolume(len);
        //result = len^3 = 10^3 = 1000
        System.out.println(result);
    }
    public static double cubeVolume(double sideLength){   
        double volume = sideLength * sideLength * sideLength;
        return volume;
    }
}
