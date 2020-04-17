import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuessTests {

	@Test
	public void isAllDigits_AllDigits_ReturnsTrue() {
		char[] input = {'1', '2', '3', '4'}; 
		boolean expected = true;
		Guess guess = new Guess();
		
		boolean actual = guess.isAllDigits(input);
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void isAllDigits_SomeLetters_ReturnsFalse() {
		char[] input = {'1', '2', 'e'}; 
		boolean expected = false;
		Guess guess = new Guess();
		
		boolean actual = guess.isAllDigits(input);
		
		assertEquals(expected, actual);	
	}
	
	@Test
	public void setDigits_4Digits_Successful() {
		char[] input = {'1', '2', '3', '4'}; 
		Guess guess = new Guess();
		
		guess.setDigits(input);
		char[] actual = guess.getDigits();
		
		assertEquals(input, actual);	
	}
	
	@Test
	public void setDigits_3Digits_ThrowsIllegalArgumentException() {
		char[] input = {'1', '2', '3'}; 
		Guess guess = new Guess();
		
		assertThrows(IllegalArgumentException.class, 
				() -> { guess.setDigits(input); });
	}
	
	@Test
	public void setDigits_5Digits_ThrowsIllegalArgumentException() {
		char[] input = {'1', '2', '3', '4', '5'}; 
		Guess guess = new Guess();
		
		assertThrows(IllegalArgumentException.class, 
				() -> { guess.setDigits(input); });
	}
	
	@Test
	public void setDigits_3Letters_ThrowsIllegalArgumentException() {
		char[] input = {'a', 'b', 'c'}; 
		Guess guess = new Guess();
		
		assertThrows(IllegalArgumentException.class, 
				() -> { guess.setDigits(input); });
	}
	
	@Test
	public void guess_4Digits_CreatesObject() {
		String input = "1234"; 
		char[] expected = {'1', '2', '3', '4'};
		Guess guess = new Guess(input);
		
		char[] actual = guess.getDigits();
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void guess_InvalidInput_ThrowsIllegalArgumentException() {
		String input = "abcd$";
		
		assertThrows(IllegalArgumentException.class, 
				() -> { new Guess(input); });
	}

}
