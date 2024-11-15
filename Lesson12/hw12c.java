//Andy Dell'Orfano
//Hw 12 c
package Lesson12;
import java.util.Scanner;
public class hw12c {
    
    public static boolean isVowel(char a){
        boolean tOrF;
        if (a == 'a' || a == 'e' ||a == 'i' ||a == 'o' ||a == 'u'){
            tOrF = true;
        } else {
            tOrF = false;
        }
        return tOrF;

    }
    public static int vowelCount(String phrase){
        int l = phrase.length();
        int i = 0;
        int vowels=0;
        while (i<l){
            if (isVowel(phrase.charAt(i))){
                vowels++;
            } else {
                vowels=vowels;
            }
            i++;
        }
        return vowels;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();
        System.out.println("The phrase \""+phrase+"\" has "+vowelCount(phrase)+" vowels.");

    }
}
