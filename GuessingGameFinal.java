//The objective of this exercise is to understand how to add some variables into the
//'main' method and to establish values for these variables. The values of the
//variables will then be printed to the screen.
//Note that this exercise will be built upon in subsequent exercises until a complete
//game called "The Guessing Game" has been developed.

import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class GuessingGame {
     private char response;
     private int secretNumber;
     private Scanner scan;

     private int MAX_GUESSES = 6;
     private int LOWER_BOUND = 0;
     private int UPPER_BOUND = 100;


     public static void main(String[] args) throws IOException {
         System.out.println("Welcome to the Guessing Game!");

         GuessingGame hiLo = new GuessingGame() ;

         hiLo.start() ;
     }
     public void start() {
         String input; // Local variable within this method only int guess
         Random random = new Random();
         int count = 0;
         int guess;

         secretNumber = random.nextInt(UPPER_BOUND);
         System.out.println("The secret number generated is: " + secretNumber);
         do {
             System.out.println("Enter a number between 1 and 100: ");
             guess = scan.nextInt();
             count++;  // add to guess count

             if (guess > secretNumber)
                 System.out.println("Your guess is too high!");
             else if (guess < secretNumber)
                 System.out.println("Your guess is too low!");

         }while (guess!=secretNumber && count<MAX_GUESSES);

         if (guess == secretNumber)
             System.out.println("You have found the secret number within " + count + "guesses!");
         else
             System.out.println("Sorry, you have not found the secret number! Good luck next time!");

         scan = new Scanner(System.in) ; // Creates Scanner instance
         System.out.print("Do you want to play a game (y/n)? ");
         input = scan.next() ;

         while (input.equals('y')) {
             System.out.println("You responded: " + input);
         }
         display();
         System.out.println("Goodbye!");
     }

     public void display() {
         System.out.println("The value of maximum guesses is: " + MAX_GUESSES);
         System.out.println("The lower bound is: " + LOWER_BOUND);
         System.out.println("The upper bound is: " + UPPER_BOUND);
     }
}