import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DigitsTests {

    @Test
    public void TwoSameDigitsShouldReturnTrue() {
        Digits digit1 = new Digits(123);
        Digits digit2 = new Digits(123);

        assertTrue(digit1.equals(digit2));
    }

    @Test
    public void TwoDifferentDigitsShouldReturnFalse() {
        Digits digit1 = new Digits(123);
        Digits digit2 = new Digits(456);

        assertFalse(digit1.equals(digit2));
    }

}
