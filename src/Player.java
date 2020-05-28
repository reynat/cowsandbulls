import java.util.Scanner;

public class Player {

    public Secret makeASecret() {
        // Get user input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a 4 digit guess: ");
        
        String userInput = keyboard.next();
        Secret guess = new Secret(userInput);

        keyboard.close();

        return guess;
    }

}