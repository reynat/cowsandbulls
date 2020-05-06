import java.util.Random;
import java.util.Scanner;

public class Main {

	static final int CODE_LENGTH = 4;

	public static void main(String[] args) {

		// Create secret
		Random randomGenerator = new Random();
		int secretKey = randomGenerator.nextInt(10000);
		System.out.println("The secret is " + secretKey);
		Digits secret = (Digits) CodeFactory.getInstance(secretKey);

		// Get guesses from the user
		Scanner input = new Scanner(System.in);

		boolean gameIsWon = false;

		while (!gameIsWon) {
			// Get user input for guess
			System.out.println("Guess a 4-digit number: ");
			String userInput = input.next();

			// Validate user input
			if (Validator.isAllDigits(userInput) && Validator.hasCorrectLength(userInput, CODE_LENGTH)
					&& !Validator.hasDuplicates(userInput)) {
				Digits guess = (Digits) CodeFactory.getInstance(Integer.parseInt(userInput));

				if (guess.equals(secret)) {
					gameIsWon = true;
					System.out.println("Game should be finished");
				}

			} else {
				System.out.println("Invalid guess. Please try again");
			}
		}

		input.close();

	}

}
