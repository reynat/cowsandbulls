import java.util.Random;

public final class RandomSecret extends Secret {
    
    public RandomSecret(){
        super(generateGameSecret());
    }

	private static String generateGameSecret() {
		Random secretGenerator = new Random();
		int secretInt = secretGenerator.nextInt();
		return String.valueOf(secretInt);
	}
}