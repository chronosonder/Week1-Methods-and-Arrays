import java.lang.Math;
import java.util.Scanner;

public class tutorialOne {
    Scanner kInput = new Scanner(System.in);
    public void main(String[] args){
        String choice = "y";
        int card1, card2, newCard, total;

        card1  = randomNum();
        card2 = randomNum();
        total  = card1 + card2;

        System.out.println("Your Hand");
        System.out.printf("First Card --> %d%nSecond Card --> %d%n", card1 ,card2);
        System.out.println();
        System.out.printf("Total %d", total);
        System.out.println("Do you wish to draw another card? (y/n)");
        System.out.print("Choice: ");

        while (choice.equals("y")){
            newCard = randomNum();
            total += newCard;
            System.out.printf("New Card --> %d", newCard);

            System.out.println();
            System.out.println("Do you wish to draw another card? (y/n)");
            System.out.print("Choice: ");
            choice = kInput.next();

        }


    }

    public static int randomNum() {
        return (int)(Math.random()*10)+1;
    }
}

