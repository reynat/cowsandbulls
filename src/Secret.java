
public class Secret {

	private String digits;
	private final int LENGTH_OF_DIGITS = 4;

	public Secret(String digits) {
		// Either pad or remove digits to enforce length of 4
		this.digits = createDigits(digits);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && this.getDigits().equals(((Secret) other).getDigits());
	}

	public String getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits;
	}

	private String createDigits(String digits) {
		return formatDigitsToSetLength(removeDuplicates(extractDigits(digits)));
	}

	private String extractDigits(String digits) {
		return digits.replaceAll("[^0-9]", "");
	}

	private String removeDuplicates(String digits) {
		return digits.chars().distinct().toString();
	}

	private String formatDigitsToSetLength(String digits) {
		if (digits.length() < LENGTH_OF_DIGITS) {
			return String.format("%-" + Integer.toString(LENGTH_OF_DIGITS) + "s", digits).replace(' ', '0');
		}
		
		if (digits.length() > LENGTH_OF_DIGITS) {
			return digits.substring(0, LENGTH_OF_DIGITS);
		}

		return digits;
	}

};
