//Andy Dell'Orfano
//Blackjack
package Blackjack;
import Project.Card;
import java.util.Scanner;
import java.util.ArrayList;
public class Blackjack {
    public static int calculateHandValue(ArrayList<Integer> hand) {
        int totalValue = 0;
        int aceCount = 0;

        for (int value : hand) {
            if (value == 11) {
                aceCount++;
            }
            totalValue += value;
        }

        while (totalValue > 21 && aceCount > 0) {
            totalValue -= 10; 
            aceCount--;
        }

        return totalValue;
    }
    public static Boolean checkHandBust(ArrayList <Integer> x ){
        int yy = calculateHandValue(x);
        if (yy > 21){
            return true;
        } else {
            return false;
        }
    }
    public static Boolean checkHandBlackJack(ArrayList <Integer> x ){
         int yy = calculateHandValue(x);
        if (yy == 21){
            return true;
        } else {
            return false;
        }
    }
    public static int returnCardValue(String x){
        int cardValue = 0;
        if (x.equals("2")){
            cardValue = 2;
        } else if (x.equals("3")){
            cardValue = 3;
        }else if (x.equals("4")){
            cardValue = 4;
        }else if (x.equals("5")){
            cardValue = 5;
        }else if (x.equals("6")){
            cardValue = 6;
        }else if (x.equals("7")){
            cardValue = 7;
        }else if (x.equals("8")){
            cardValue = 8;
        }else if (x.equals("9")){
            cardValue = 9;
        }else if (x.equals("T")){
            cardValue = 10;
        }else if (x.equals("J")){
            cardValue = 10;
        }else if (x.equals("Q")){
            cardValue = 10;
        }else if (x.equals("K")){
            cardValue = 10;
        }else if (x.equals("A")){
            cardValue = 11;
        }
        return cardValue;
    }
    public static void main(String[] args) {
        ArrayList <Integer> playerHand = new ArrayList<>();
        ArrayList <Integer> dealerHand = new ArrayList<>();
        
        int totalMoney = 1000;
        
        int bet = 0;
        int playerHandValue = 0;
        int dealerHandValue = 0;
        while (true){
            Scanner in = new Scanner(System.in);
            int d = 0;
            System.out.println("Would you like to play?(Yes or No) ");
            String response = in.nextLine();
            if (response.equals("No")||response.equals("no")||response.equalsIgnoreCase("n")){
                System.out.println("Thanks for playing!");
                break;
            }else {
                playerHand.clear();
                dealerHand.clear();

                System.out.println("Your total money is $" + totalMoney);
                System.out.print("How much would you like to bet? ");
                bet = in.nextInt();
                in.nextLine();
                System.out.print("Your cards are: ");
                for (int x =0; x <2; x++){
                    Card playerCard = new Card();
                    playerHand.add(returnCardValue(playerCard.returnRank()));
                    System.out.print(playerCard.returnFace() + " ");
                }
                playerHandValue = calculateHandValue(playerHand);
                System.out.println("");
                System.out.print("Dealer's card is: ");
                for (int y = 0; y <2; y++){
                    Card dealerCard = new Card();
                    dealerHand.add(returnCardValue(dealerCard.returnRank()));
                    if (y <1){
                        System.out.print(dealerCard.returnFace() + " ");
                    }
                    }
                }
                dealerHandValue= calculateHandValue(dealerHand);
                System.out.println("");
                    for (int a = 0; a < 21; a++){
                        System.out.println("You're at " + playerHandValue);
                        System.out.print("Would you like to hit or stand? (Enter h for hit or s for stand) ");
                        String response1 = in.next();
                        char responseChar = response1.charAt(0);
                        if (responseChar == 'h'){
                            Card hit = new Card();
                            playerHand.add(returnCardValue(hit.returnRank()));
                            playerHandValue=calculateHandValue(playerHand);
                            System.out.println("You drew "+hit.returnFace());
                        } else {
                            a=21;
                            
                        }
                      
                    for (int b = 0; b < 21; b++){
                        if (checkHandBlackJack(playerHand)){
                            System.out.println("Blackjack!");
                            totalMoney = totalMoney + (int)(bet*1.5);
                            System.out.println("You are at $" + totalMoney);
                            a=21;
                            b=21;
                            d=1;
                        } else if(checkHandBust(playerHand)){
                            System.out.println("Bust!");
                            totalMoney = totalMoney - bet;
                            System.out.println("You are at $" + totalMoney);
                            a=21;
                            b=21;
                            d=1;
                        }
                    }
                    
                    }
                    for (int c = 0; c<21; c++){
                    
                        if (d == 1){
                            c=21;
                            
                        }
                        else if (checkHandBlackJack(dealerHand)){
                            System.out.println("Dealer is at " + dealerHandValue);
                            System.out.println("Blackjack!");
                            totalMoney = totalMoney -bet;
                            System.out.println("You are at $" + totalMoney);
                            c=21;
                            break;
                           
                        } else if(checkHandBust(dealerHand)){
                            System.out.println("Dealer is at " + dealerHandValue);
                            System.out.println("Bust!");
                            totalMoney = totalMoney + bet;
                            System.out.println("You are at $" + totalMoney);
                            c=21;
                            break;
                        }
                        if (dealerHandValue < 17){
                            System.out.println("Dealer is at " + dealerHandValue);
                            System.out.println("Dealer hits!");
                            Card hit = new Card();
                            System.out.println("Dealer drew " + hit.returnFace());
                            dealerHand.add(returnCardValue(hit.returnRank()));
                            dealerHandValue=calculateHandValue(dealerHand);
                            
                        } else if (dealerHandValue < 21 || playerHandValue <21){
                            System.out.println("Dealer is at " + dealerHandValue);
                            System.out.println("Dealer Stands!");
                            c=21;
                        }
                } 
                if (playerHandValue <21 && dealerHandValue<21){
                    if (playerHandValue > dealerHandValue){
                        System.out.println("You win!");
                        totalMoney = totalMoney +bet;
                        System.out.println("You are at $" + totalMoney);
                    }else if (dealerHandValue > playerHandValue){
                        System.out.println("Dealer wins!");
                        totalMoney = totalMoney -bet;
                        System.out.println("You are at $" + totalMoney);
                    } else {
                        System.out.println("Draw!");
                        System.out.println("You are at $" + totalMoney);
                    }
                } 
            }
        }
    }

