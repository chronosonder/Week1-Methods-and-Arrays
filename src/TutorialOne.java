import java.lang.Math;
import java.util.Scanner;

public class TutorialOne {
    static Scanner kInput = new Scanner(System.in);
    public static void main(String[] args){
        String choice;
        int card1, card2, newCard, total;

        card1  = randomNum();
        card2 = randomNum();
        total  = calcTotal(card1, card2);

        System.out.println("Your Hand");
        System.out.printf("First Card --> %d%nSecond Card --> %d%n", card1 ,card2);
        System.out.printf("Total %d%n%n", total);
        System.out.println("Do you wish to draw another card? (y/n)");
        System.out.print("Choice: ");
        choice = kInput.next();

        while (choice.equals("y")){
            newCard = randomNum();
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

        if (getResult(total)){
            System.out.println("You Won");
        } else {
            System.out.println("You Lost");
        }

    }


    public static int randomNum() {
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
