import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidatorTests {

    @Test
    public void CorrectLengthShouldReturnTrue() {
        assertTrue(Validator.hasCorrectLength("1234", 4));
    }

    @Test
    public void ShorterLengthShouldReturnFalse() {
        assertFalse(Validator.hasCorrectLength("123", 4));
    }

    @Test
    public void LongerLengthShouldReturnFalse() {
        assertFalse(Validator.hasCorrectLength("12345", 4));
    }

    @Test
    public void NoDuplicatesShouldReturnFalse() {
        assertFalse(Validator.hasDuplicates("1234"));
    }

    @Test
    public void HasDuplicatesShouldReturnTrue() {
        assertTrue(Validator.hasDuplicates("1224"));
    }

    @Test
    public void isAllDigitsShouldReturnTrue() {
        assertTrue(Validator.isAllDigits("1234"));
    }

    @Test
    public void isFloatShouldReturnFalse() {
        assertFalse(Validator.isAllDigits("12.34"));
    }

    @Test
    public void isStringShouldReturnFalse() {
        assertFalse(Validator.isAllDigits("Ok la"));
    }
}