import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Reader reader = new Reader();
		Printer printer = new Printer();

		Secret secret = generateGameSecret();
		printer.printInstruction("The secret is " + secret.getDigits());

		Checker checker = new Checker(secret);
		
		printer.printInstruction("Please enter a 4 digit guess: ");
		Secret guess = reader.readUserSecret();

		while (!gameOver(guess, secret)) {
			Feedback feedback = checker.giveFeedback(guess);
			printer.printFeedback(feedback);
			printer.printInstruction("Please enter a 4 digit guess: ");
			guess = reader.readUserSecret();
		}

		printer.printInstruction("Congratulations! You guessed the secret!");
	}

	private static Secret generateGameSecret() {
		Random secretGenerator = new Random();
		int secretInt = secretGenerator.nextInt();
		return new Secret(String.valueOf(secretInt));
	}

	private static boolean gameOver(Secret guess, Secret secret) {
		return secret.equals(guess); 
	}
}
