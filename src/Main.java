import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	private static Secret secret; 

	public static void main(String[] args) {
		Reader reader = new Reader();
		Writer<String> writer = new StringWriter();
		initialiseGameSecret();

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

	private static void initialiseGameSecret() {
		Properties config = new Properties();

		try {
			FileInputStream configFile = new FileInputStream("config.properties");
			config.load(configFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String secretType = config.getProperty("secretType");
		secret = SecretFactory.createSecret(secretType);
	}

	private static boolean gameOver(Secret guess, Secret secret) {
		return secret.equals(guess); 
	}
}
