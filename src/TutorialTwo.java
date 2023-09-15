/*
Author: Cat
Version 0.3

Java Tutorial 2 Week 1

Date 15/09/23
 */


import java.util.Arrays;
import java.util.Scanner;

public class TutorialTwo {
    static Scanner kInput = new Scanner(System.in);
    public static void main(String[] args){
        String[][] planeSeats = new String[14][3];
        int choice, seatNumber;

        planeSeats[0][0] = "Cat";
        planeSeats[0][1] = "Buhan";
        planeSeats[0][2] = "1";
        planeSeats[1][0] = "Mike";

        displayMenu();
        System.out.printf("%nChoice: ");
        choice = kInput.nextInt();

        switch (choice) {
            case 1:
                availableSeats(planeSeats);

                System.out.printf("%nEnter the seat number you would like to book: ");
                seatNumber = kInput.nextInt() - 1;

                System.out.println("Please enter your first name.");
                planeSeats[seatNumber][0] = kInput.next();

                System.out.println("Please enter your last name.");
                planeSeats[seatNumber][1] = kInput.next();

                System.out.println("Please select the booking type.");
                System.out.printf("1 - Business     2 - Local       3 - Leisure");
                planeSeats[seatNumber][2] = kInput.next();

                System.out.println("Thank you for your booking.");
                availableSeats(planeSeats);

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Incorrect choice.");
                break;
        }



    }

    public static void availableSeats(String[][] seatsArray) {

        System.out.print("Available seat numbers: ");

        for (int row = 0; row < 14; row++) {
            if (seatsArray[row][0] == null){

                System.out.printf("%d%s", row + 1,(row == 13)?".":", ");
            }
//            for (int col = 0; col < 3; col++){
//                System.out.println(row+" "+col);
//            }

        }

    }

    public static void displayMenu() {
        System.out.println("*Welcome to QuackRlines*");
        System.out.println("Please choose from one of the options below by entering the corresponding number");
        System.out.println("1. Book a seat");
        System.out.println("2. Display all seats showing passenger details");
        System.out.println("3. Cancel a seat");
        System.out.println("4. Display report of total takings");
        System.out.println();
        System.out.println("5. Exit");
    }

    public static void seatBooking() {

    }

}

