public class Secret {

	private class Digits {
		
	}

	private String digits;
	private final int LENGTH_OF_DIGITS = 4;

	public Secret(String digits) {
		// Either pad or remove digits to enforce length of 4
		this.digits = create4DigitSecret(digits);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && (this.getDigits()).equals(((Secret) other).getDigits());
	}

	public String getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits;
	}

	private String create4DigitSecret(String digits) {
		if (digits.length() < LENGTH_OF_DIGITS) {
			return String.format("%-" + Integer.toString(LENGTH_OF_DIGITS) + "s", digits).replace(' ', '0');
		}
		
		if (digits.length() > LENGTH_OF_DIGITS) {
			return digits.substring(0, LENGTH_OF_DIGITS);
		}

		return digits;
	}
};
