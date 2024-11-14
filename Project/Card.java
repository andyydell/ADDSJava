//Andy Dell'Orfano
//AT Project
import java.util.Scanner;
import java.util.Random;
enum Suit {SPADE, HEART, CLUB, DIAMOND}
enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
public class Card {
    Random rng = new Random();
    private Suit suit;
    private Rank rank;
    private int randomSuit;
    private int randomRank;
    private char stringSuit;
    private char stringRank;
    private String face;
    public Card(){
        randomSuit = rng.nextInt(4);
        randomRank = rng.nextInt(13);
        if (randomSuit == 0){
            suit = Suit.CLUB;
        } else if (randomSuit == 1){
            suit = Suit.DIAMOND;
        }else if (randomSuit == 2){
            suit = Suit.HEART;
        } else {
            suit = Suit.SPADE;
        }
        if (randomRank == 0){
            rank = Rank.TWO;
        } else if (randomRank == 1){
            rank = Rank.THREE;
        } else if (randomRank == 2){
            rank = Rank.FOUR;
        }else if (randomRank == 3){
            rank = Rank.FIVE;
        }else if (randomRank == 4){
            rank = Rank.SIX;
        }else if (randomRank == 5){
            rank = Rank.SEVEN;
        }else if (randomRank == 6){
            rank = Rank.EIGHT;
        }else if (randomRank == 7){
            rank = Rank.NINE;
        }else if (randomRank == 8){
            rank = Rank.TEN;
        }else if (randomRank == 9){
            rank = Rank.JACK;
        }else if (randomRank == 10){
            rank = Rank.QUEEN;
        }else if (randomRank == 11){
            rank = Rank.KING;
        }else {
            rank = Rank.ACE;
        }
        stringRank = returnRank();
        stringSuit= returnSuit();
    }
    public Card(String a, int b){
        if (a.equals("heart")){
            suit = Suit.HEART;
        } else if (a.equals("spade")){
            suit = Suit.SPADE;
        }else if (a.equals("diamond")){
            suit = Suit.DIAMOND;
        } else if (a.equals("club")){
            suit = Suit.CLUB;
        } else {}
        if (b == 2){
            rank = Rank.TWO;
        } else if (b == 3){
            rank = Rank.THREE;
        } else if (b == 4){
            rank = Rank.FOUR;
        }else if (b == 5){
            rank = Rank.FIVE;
        }else if (b == 6){
            rank = Rank.SIX;
        }else if (b == 7){
            rank = Rank.SEVEN;
        }else if (b == 8){
            rank = Rank.EIGHT;
        }else if (b == 9){
            rank = Rank.NINE;
        }else if (b == 10){
            rank = Rank.TEN;
        }else if (b == 11){
            rank = Rank.JACK;
        }else if (b == 12){
            rank = Rank.QUEEN;
        }else if (b == 13){
            rank = Rank.KING;
        }else if (b == 14){
            rank = Rank.ACE;
        } 
        stringRank = returnRank();
        stringSuit= returnSuit();
    }
    public char returnSuit(){
         if (suit == Suit.CLUB){
            stringSuit = '\u2663';
        } else if (suit == Suit.HEART){
            stringSuit = '\u2661';
        }else if (suit == Suit.SPADE){
            stringSuit = '\u2660';
        } else {
            stringSuit = '\u2662';
        } 
        return stringSuit;
    }
    public char returnRank(){
        if (rank == Rank.TWO){
            stringRank = '2';
        } else if (rank == Rank.SIX){
            stringRank = '6';
        }else if (rank == Rank.THREE){
            stringRank = '3';
        }else if (rank == Rank.FOUR){
            stringRank = '4';
        }else if (rank == Rank.FIVE){
            stringRank = '5';
        }else if (rank == Rank.SEVEN){
            stringRank = '7';
        }else if (rank == Rank.EIGHT){
            stringRank = '8';
        }else if (rank == Rank.NINE){
            stringRank = '9';
        }else if (rank == Rank.TEN){
            stringRank = 'T';
        }else if (rank == Rank.JACK){
            stringRank = 'J';
        }else if (rank == Rank.QUEEN){
            stringRank = 'Q';
        } else if (rank == Rank.KING){
            stringRank = 'K';
        }else {
            stringRank = 'A';
        }
        return stringRank;
    }
    public String returnFace(){
       face = new StringBuilder().append(stringSuit).append(stringRank).toString();
       return face;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a suit (spade, heart, diamond, or club): ");
        String a = in.nextLine();
        System.out.print("Enter the rank of the card (2-10, 11 for jack, 12 for queen, 13 for king, 14 for ace): ");
        int b = in.nextInt();
        Card card = new Card(a, b);
        System.out.println(card.returnFace());
        int n = 0;
        System.out.println("10 random cards:");
        while (n < 10){
            Card randCard = new Card();
            System.out.println(randCard.returnFace());
            n++;
        }
    }
}
