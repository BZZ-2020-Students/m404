package nrguessgame;

import java.util.Scanner;

/**
 * A short number guessing game telling you if the number has a higher / lower value
 *
 * @author Alyssa Heimlicher
 * @date 2021-05-18
 * @version 1.0
 */
public class GuessNumber{

    // declare attributes
    static Scanner scanner;
    static Integer secret;

    /**
     * constructor: initialize attributes
     */
    public GuessNumber() {
        scanner = new Scanner(System.in);
        secret = (int)(Math.random() * 100 + 1);
    }

    /**
     * starts the execution
     *
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        GuessNumber program = new GuessNumber();
        program.run();
        scanner.close();
    }

    /**
     * description
     */
    private void run() {
        Integer userNr;
        Integer tries = new Integer(1);
        System.out.println(secret);
        System.out.println("Hello, try to guess the secret number (0-100)");
        System.out.print("Your guess > ");
        userNr = scanner.nextInt();

       while(!userNr.equals(secret)){
           if(userNr.compareTo(secret) < 0){
               if(secret - userNr <= 5){
                   System.out.println("You're close!");
               }
               System.out.println("The secret number has a higher value!");
           }else if(userNr.compareTo(secret) > 0){
               if(userNr - secret <= 5){
                   System.out.println("You're close!");
               }
               System.out.println("The secret number has a lower value!");
           }
           tries++;
           System.out.println();
           System.out.print("Your guess > ");
           userNr = scanner.nextInt();
       }
        System.out.println("Congrats! You guessed the number " + secret);
        System.out.println("You took " + tries + " tries!");
        // TODO: realize the program logic
    }
}