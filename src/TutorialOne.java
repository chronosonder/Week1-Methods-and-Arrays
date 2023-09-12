import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class


public class TutorialOne {
    static Scanner kInput = new Scanner(System.in);
    public static void main(String[] args){
        String choice;
        int houseHand, newCard, total;

        ArrayList<Integer> playerHand = new ArrayList<Integer>();
        playerHand.add(playerDraw());
        playerHand.add(playerDraw());

        houseHand = houseDraw();

        total  = calcTotal(playerHand);


        System.out.print("Your cards: ");
//        System.out.printf("First Card --> %d%nSecond Card --> %d%n", card1 ,card2);
        for (Integer card : playerHand) {
            System.out.printf("%d,",card);
        }

        System.out.printf("%nTotal %d%n%n", total);
        System.out.println("Do you wish to draw another card? (y/n)");
        System.out.print("Choice: ");
        choice = kInput.next();

        while (choice.equals("y")){
            System.out.println("");
            playerHand.add()
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

    public static void displayHand(ArrayList<Integer> playerCards) {
        System.out.println("Your hand: ");
        playerCards.forEach((card) -> System.out.printf(""));
    }
//    Continue above
    public static int calcTotal(ArrayList<Integer> playerCards) {
        int cardsTotal = 0;

        for (Integer card : playerCards) {
            cardsTotal += card;
        }
        return cardsTotal;
    }

    public static boolean busted(int cardsTotal) {
        return cardsTotal>21;
    }
    public static boolean getResult(int totalCards){
        return ((totalCards > 18) && (totalCards <= 21));
    }

}
