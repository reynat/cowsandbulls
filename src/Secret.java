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
		char[] digitsAsChar = digits.toCharArray();
		String uniqueDigits = "";
		boolean duplicateFound = false;

		for (int i = 0; i < digits.length(); i++ ) {
			for (int j = i + 1; j < digits.length(); j++ ) {
				if (digitsAsChar[i] == digitsAsChar[j]) {
					duplicateFound = true;
				}
			}
			if (!duplicateFound) {
				uniqueDigits += digitsAsChar[i];
			}
			duplicateFound = false;
		}

		return uniqueDigits;
	}

	private String formatDigitsToSetLength(String digits) {
		if (digits.length() < LENGTH_OF_DIGITS) {
			return padSecretWithDigits(digits);
		}
		
		if (digits.length() > LENGTH_OF_DIGITS) {
			return digits.substring(0, LENGTH_OF_DIGITS);
		}

		return digits;
	}

	private String padSecretWithDigits(String digits) {
		int paddingLength = LENGTH_OF_DIGITS - digits.length();
		int nextDigit = 0; 

		while (paddingLength > 0) {
			String nextDigitAsString = String.valueOf(nextDigit);
			if (!digits.contains(nextDigitAsString)) {
				digits += nextDigit;
				paddingLength --;
			}
			nextDigit++;
		}

		return digits;
	}

};
