public class Secret {

	private String digits;
	private final int LENGTH_OF_DIGITS = 4;

	public Secret(String digits) {
		// Either pad or remove digits to enforce length of 4
		this.digits = create4DigitSecret(digits);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && this.getDigits().equals(((Secret) other).getDigits());
	}

	public String getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits;
	}

	private String create4DigitSecret(String digits) {

		String onlyDigits = digits.replaceAll("[^0-9]", "");

		if (onlyDigits.length() < LENGTH_OF_DIGITS) {
			return String.format("%-" + Integer.toString(LENGTH_OF_DIGITS) + "s", onlyDigits).replace(' ', '0');
		}
		
		if (onlyDigits.length() > LENGTH_OF_DIGITS) {
			return onlyDigits.substring(0, LENGTH_OF_DIGITS);
		}

		return onlyDigits;
	}
};
