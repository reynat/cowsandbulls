import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidatorTests {

    @Test
    public void CorrectLengthAllDigitsAndDuplicationShouldReturnTrue() {
        Validator validator = new Validator(4, false);
        assertTrue(validator.isValidCode("1234"));
    }

    @Test
    public void ShorterLengthShouldReturnFalse() {
        Validator validator = new Validator(4, false);
        assertFalse(validator.isValidCode("123"));
    }

    @Test
    public void LongerLengthShouldReturnFalse() {
        Validator validator = new Validator(4, false);
        assertFalse(validator.isValidCode("12345"));
    }

    @Test
    public void NotAllDigitsShouldReturnFalse() {
        Validator validator = new Validator(4, false);
        assertFalse(validator.isValidCode("1234#"));
    }

    @Test
    public void WrongDuplicationShouldReturnFalse() {
        Validator validator = new Validator(4, false);
        assertFalse(validator.isValidCode("1244"));
    }
}