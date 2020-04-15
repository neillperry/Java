import java.util.Scanner;

public class HiLo {

    public static void playGame() {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        do {
            // generate random number 1-100
            int theNumber = (int)(Math.random() * 100 + 1);

            //instantiate the variable guess
            int guess = 0;
            int numberOfTries = 0;
            while(guess != theNumber)
            {
                System.out.println("Guess a number between 1 and 100:");
                guess = scan.nextInt();
                numberOfTries = numberOfTries + 1;
                if (guess < theNumber)
                    System.out.println("Guess is too LOW. Try again.");
                else if (guess > theNumber)
                    System.out.println("Guess is too HIGH. Try again");
                else
                    System.out.println("You are correct. You WIN!! \n It only took you " + numberOfTries + " tries!");
            }

            //Ask user if they would like to play again
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing!");
        scan.close();
    }
}
