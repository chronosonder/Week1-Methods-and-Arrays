import java.lang.Math;
import java.util.Scanner;

public class TutorialOne {
    static Scanner kInput = new Scanner(System.in);
    public static void main(String[] args){
        String choice;
        int houseHand, card1, card2, newCard, total;

        houseHand = houseDraw();
        card1  = playerDraw();
        card2 = playerDraw();
        total  = calcTotal(card1, card2);


        System.out.println("Your Hand");
        System.out.printf("First Card --> %d%nSecond Card --> %d%n", card1 ,card2);
        System.out.printf("Total %d%n%n", total);
        System.out.println("Do you wish to draw another card? (y/n)");
        System.out.print("Choice: ");
        choice = kInput.next();

        while (choice.equals("y")){
            newCard = playerDraw();
            total += newCard;
            System.out.printf("%nNew Card --> %d%n", newCard);
            System.out.printf("Total %d%n%n", total);

            if (busted(total)){
                System.out.println("Busted!");
                choice = "n";
            } else {
                System.out.println("Do you wish to draw another card? (y/n)");
                System.out.print("Choice: ");
                choice = kInput.next();
            }
        }

        System.out.printf("%nYou %s with %d %nHouse had %d.", getResult(total)? "Win":"Lost", total, houseHand);

    }


    public static int houseDraw() {
        return (int)(Math.random()*6)+16;
    }
    public static int playerDraw() {
        return (int)(Math.random()*10)+1;
    }

    public static int calcTotal(int cardOne, int cardTwo) {
        return cardOne + cardTwo;
    }

    public static boolean busted(int cardsTotal) {
        return cardsTotal>21;
    }
    public static boolean getResult(int totalCards){
        return ((totalCards > 18) && (totalCards <= 21));
    }

}
