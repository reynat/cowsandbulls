public class Secret {
	private int digits;
	private final int LENGTH_OF_DIGITS = 4;

	public Secret(int digits) {
		// Either pad or remove digits to enforce length of 4
		this.digits = create4DigitSecret(digits);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && this.getDigits() == ((Secret) other).getDigits();
	}

	public int getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits;
	}

	private int create4DigitSecret(int digits) {
		String digitsAsAString = String.valueOf(digits);
		
		if (digitsAsAString.length() < LENGTH_OF_DIGITS) {
			digitsAsAString = String.format("%-" + Integer.toString(LENGTH_OF_DIGITS) + "s", digitsAsAString).replace(' ', '0');
		}
		
		if (digitsAsAString.length() > LENGTH_OF_DIGITS) {
			digitsAsAString = digitsAsAString.substring(0, LENGTH_OF_DIGITS);
		}

		return Integer.valueOf(digitsAsAString);
	}
};
