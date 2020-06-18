import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Player {

    public Secret makeASecret(InputStream input, PrintStream output) {
        // Get user input
        Scanner keyboard = new Scanner(input);

        output.print("Please enter a 4 digit guess: ");
        
        String userInput = keyboard.next();
        Secret guess = new Secret(userInput);
		output.println("You guessed " + guess.getDigits());

        // keyboard.close();

        return guess;
    }

}