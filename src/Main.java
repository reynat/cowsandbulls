import java.io.PrintStream;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		PrintStream gameOutput = System.out;
		Reader reader = new Reader();

		Secret secret = generateGameSecret();
		gameOutput.println("The secret is " + secret.getDigits());

		Checker checker = new Checker(secret);
		
		Secret guess = reader.readUserSecret();

		while (!secret.equals(guess)) {
			Feedback feedback = checker.giveFeedback(guess);
			gameOutput.println("RESULT: " + feedback.bulls + " BULL and " + feedback.cows + " COW");

			guess = reader.readUserSecret();
		}

		gameOutput.println("Congratulations! You guessed the secret!");
	}

	private static Secret generateGameSecret() {
		Random secretGenerator = new Random();
		int secretInt = secretGenerator.nextInt();
		return new Secret(String.valueOf(secretInt));
	}
}
