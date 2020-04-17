import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean gameIsWon = false;
		Secret secret = new Secret();
		
		Scanner input = new Scanner(System.in);
		
		while (!gameIsWon) {
		// Get user input for guess
		System.out.println("Guess a 4-digit number: ");
		Guess guess;
		
			try {
				guess = new Guess(input.next());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage() +". Please try again");
			}
		}
		
		input.close();
		
	}

}
