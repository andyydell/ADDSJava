package Lesson31;

public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    public String toString(){
        String name = this.name;
        int year = this.year;
        return "Baseball Card " + name + " year: " + year;
    }
    public boolean equals(Object o){
        final double SMALL_NUMBER = 0.0000000000001;
        if (o instanceof BaseballCard == false) {
            return false;
        }
        BaseballCard otherCard = (BaseballCard) o;
        if (this.name.equals(otherCard.name) 
             && this.year == otherCard.year) {
            return true;
        } else {
            return false;
        }
    }
}
