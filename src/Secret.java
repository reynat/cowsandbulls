
public class Secret {

	class Digits {

		public String digits; 
		private int length;

		public Digits(String newDigits, int length) {
			this.length = length;
			this.digits = createDigits(newDigits);
		}

		private String createDigits(String digits) {
			return formatDigitsToSetLength(extractDigits(digits));
		}

		private String extractDigits(String digits) {
			return digits.replaceAll("[^0-9]", "");
		}

		private String formatDigitsToSetLength(String digits) {
			if (digits.length() < this.length) {
				return String.format("%-" + Integer.toString(this.length) + "s", digits).replace(' ', '0');
			}
			
			if (digits.length() > this.length) {
				return digits.substring(0, this.length);
			}
	
			return digits;
		}
	}

	private Digits digits;
	private final int LENGTH_OF_DIGITS = 4;

	public Secret(String digits) {
		// Either pad or remove digits to enforce length of 4
		this.digits = new Digits(digits, LENGTH_OF_DIGITS);
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && this.getDigits().equals(((Secret) other).getDigits());
	}

	public String getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits.digits;
	}
};
