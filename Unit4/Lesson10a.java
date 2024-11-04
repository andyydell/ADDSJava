//Andy Dell'Orfano
//Lesson 10 A HW

package Unit4;

public class Lesson10a {
    public static void main(String[] args) {
        /*String name = "Harry";
        System.out.println(name.charAt(name.length()));
        System.out.println("The last letter of the name is ");
        */
        //This code carries a run time error as when the code begins running, it will have an issue when it gets to determining which character exists there
        //The fix is to change it to char - 1 as the length is greater than the character identifier of the last letter

        String name = "Harry";
        System.out.println("The last letter of the name is " + (name.charAt(name.length() - 1)));
}

}
