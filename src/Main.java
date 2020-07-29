import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer<String> writer = new StringWriter();

		Secret secret = generateGameSecret();

		Checker checker = new Checker(secret);
		
		writer.print(Formatter.prompt());

		Secret guess = reader.readUserSecret();

		while (!gameOver(guess, secret)) {
			Feedback feedback = checker.giveFeedback(guess);
			writer.print(Formatter.getFeedback(feedback));
			writer.print(Formatter.prompt());
			guess = reader.readUserSecret();
		}

		writer.print(Formatter.getGameOver());
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
