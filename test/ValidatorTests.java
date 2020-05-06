import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidatorTests {

    @Test
    public void FourDigitsShouldReturnTrue() {
        assertTrue(Validator.hasCorrectNumberOfDigits(1234, 4));
    }

    @Test
    public void ThreeDigitsShouldReturnFalse() {
        assertFalse(Validator.hasCorrectNumberOfDigits(123, 4));
    }

    @Test
    public void FiveDigitsShouldReturnFalse() {
        assertFalse(Validator.hasCorrectNumberOfDigits(12345, 4));
    }

    @Test
    public void NoDuplicateDigitsShouldReturnFalse() {
        assertFalse(Validator.hasDuplicateDigits(1234));
    }

    @Test
    public void DuplicateDigitsShouldReturnTrue() {
        assertTrue(Validator.hasDuplicateDigits(1224));
    }

}