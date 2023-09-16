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
        String[][] planeSeats = new String[15][3];
        boolean mergeSecundele = true;
        int choice, seatNumber;



        while (mergeSecundele) {
            displayMenu();
            System.out.printf("%nChoice: ");
            choice = kInput.nextInt();

            switch (choice) {
                case 1:
                    availableSeats(planeSeats);

                    System.out.printf("%nEnter the seat number you would like to book: ");
                    seatNumber = kInput.nextInt();

                    System.out.print("Please enter your first name: ");
                    planeSeats[seatNumber][0] = kInput.next();

                    System.out.print("Please enter your last name: ");
                    planeSeats[seatNumber][1] = kInput.next();

                    System.out.printf("%nPlease select the booking type.%n");
                    System.out.printf("1 - Business     2 - Local     3 - Leisure%n");
                    System.out.print("Ticket type: ");
                    planeSeats[seatNumber][2] = kInput.next();

                    System.out.printf("%nTicket price: £%s%n", ticketPrice(Integer.parseInt(planeSeats[seatNumber][2])));

                    System.out.println("Thank you for your booking.");

                    break;
                case 2:
                    displaySeats(planeSeats);
                    break;
                case 3:
                    displaySeats(planeSeats);
                    System.out.print("\nPlease enter the seat number you would like to cancel: ");
                    planeSeats[kInput.nextInt()][0] = null;
                    System.out.println("\nBooking canceled.");
                    break;
                case 4:
                    displaySeats(planeSeats);
                    break;
                case 5:
                    mergeSecundele = false;
                    break;
                default:
                    System.out.println("Incorrect choice.");
                    break;
            }

//            System.out.println("*Navigation*");
//            System.out.println("1 - Go back to menu");
//            System.out.println("5 - Exit");
//
//            System.out.printf("%nChoice: ");
        }
        kInput.close();
    }

    public static void displayMenu() {
        System.out.printf("        *Welcome to QuackRlines*%n%n");
        System.out.println("Please choose from one of the options below by entering the corresponding number");
        System.out.println("1. Book a seat");
        System.out.println("2. Display all seats showing passenger details");
        System.out.println("3. Cancel a seat");
        System.out.println("4. Display report of total takings");
        System.out.println();
        System.out.println("5. Exit");
    }


    public static void availableSeats(String[][] seatsArray) {

        System.out.print("Available seat numbers: ");

        for (int row = 0; row < 15; row++) {
            if (seatsArray[row][0] == null){

                System.out.printf("%d%s", row + 1,(row == 14)?".":", ");
            }
        }
    }

    public static void displaySeats(String[][] seats) {
        for (int row = 0; row < 15; row++) {

            System.out.printf("Seat %d - ", row);

            if (seats[row][0] == null) {
                System.out.println("Empty");
            } else {
                System.out.printf("Booked by %s %s%n",seats[row][0], seats[row][1]);
            }
        }
    }

    public static double ticketPrice(int ticketType) {
        return 100 * ((ticketType == 1 )?0.2:(ticketType == 2)?0:0.1) + 100;
//        ...It works...Ok?
    }
}

