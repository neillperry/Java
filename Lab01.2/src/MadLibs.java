import java.util.Scanner;


class MadLibs {

    // variables for the Mad Lib
    String noun1 = "";
    String adjective1 = "";
    int number1 = 0;

    // get user inputs on nouns, adjectives, numbers
    public void playGame() {
        getInput();
        displayOutput();
    }

    public void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number:");
        number1 = scan.nextInt();
        System.out.println("Give me a noun:");
        noun1 = scan.next();
        System.out.println("Give me an adjective:");
        adjective1 = scan.next();
    }

    public void displayOutput(){
        System.out.println("There once was a very " + adjective1 + " " + noun1 + ".");
        System.out.println("There were " + number1 + " " + noun1 + ".");

    }
}
