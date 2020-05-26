public class Secret {
	private int digits;

	public Secret(int digits) {
		this.digits = digits;
	}

	@Override
	public boolean equals(Object other) {
		return other instanceof Secret && this.getDigits() == ((Secret) other).getDigits();
	}

	public int getDigits() {
		// Ensures that the digits returned are in the format we want others to see
		return this.digits;
	}
};
