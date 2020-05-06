import java.util.Random;
import java.util.Scanner;

public class Main {

	static final int CODE_LENGTH = 4;
	static final int MAX_SECRET = 10000;

	public static void main(String[] args) {
		// Set up code validation
		Validator codeValidator = new Validator(CODE_LENGTH, false);

		// Create secret
		Random randomGenerator = new Random();
		int secretKey = 0;
		boolean validatedSecret = false;
		while (!validatedSecret) {
			secretKey = randomGenerator.nextInt(MAX_SECRET);
			validatedSecret = codeValidator.isValidCode(String.valueOf(secretKey));
		}
		System.out.println("The secret is " + secretKey);
		Digits secret = (Digits) CodeFactory.getInstance(secretKey);

		Scanner input = new Scanner(System.in);

		boolean gameIsWon = false;

		while (!gameIsWon) {
			// Get guesses from the user
			System.out.println("Guess a 4-digit number: ");

			String userInput = input.next();

			if (codeValidator.isValidCode(userInput)) {
				Digits guess = (Digits) CodeFactory.getInstance(Integer.parseInt(userInput));

				if (guess.equals(secret)) {
					gameIsWon = true;
					System.out.println("Game should be finished");
				} else {
					System.out.println("Guess does not match the secret. Please try again.");
				}
			} else {
				System.out.println("Invalid guess. Please try again.");
			}
			;

		}

		input.close();

	}

}
