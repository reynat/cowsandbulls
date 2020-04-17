public class Guess {
	private int GUESS_LENGTH = 4;
	private char[] digits = new char[GUESS_LENGTH];

	public Guess() {};
	
	public Guess (String userInput) {
		char[] guess = userInput.toCharArray();
		this.setDigits(guess);
	}
	
	protected boolean isAllDigits(char[] nextGuess) {
		boolean isDigit = true;
		int i = 0;
		
		while (isDigit && i < nextGuess.length) {
			isDigit = Character.isDigit(nextGuess[i]);
			i++;
		}
		
		return isDigit;
	}

	public char[] getDigits() {
		return digits;
	}

	public void setDigits(char[] digits) throws IllegalArgumentException {
		if (digits.length == GUESS_LENGTH && isAllDigits(digits)) {
			this.digits = digits;
		} else {
			throw new IllegalArgumentException("Invalid guess");
		}
	}

}

