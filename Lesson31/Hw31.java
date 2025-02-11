package Lesson31;

import Lesson31.BaseballCard;

public class Hw31 {
    
    public static void main(String[] args) {
        BaseballCard mookie = new BaseballCard("Mookie Betts", 2017);
        BaseballCard mookie2 = new BaseballCard("Mookie Betts", 2017);
        System.out.println(mookie.toString());
        if (mookie.equals(mookie2)){
            System.out.println("The two cards are equal");
        } else {
            System.out.println("The two cards are different");
        }
    }


}

