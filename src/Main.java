import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		InputStream userInput = System.in;
		PrintStream gameOutput = System.out;

		Secret secret = generateGameSecret();
		gameOutput.println("The secret is " + secret.getDigits());

		Checker checker = new Checker(secret);
		Player player = new Player();
		
		Secret guess = player.makeASecret(userInput, gameOutput);
		gameOutput.println("You guessed " + guess.getDigits());

		Feedback feedback = checker.giveFeedback(guess);
		gameOutput.println("RESULT: " + feedback.bulls + " BULL and " + feedback.cows + " COW");


	}

	private static Secret generateGameSecret() {
		Random secretGenerator = new Random();
		int secretInt = secretGenerator.nextInt();
		return new Secret(String.valueOf(secretInt));
	}
}
