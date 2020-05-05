import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CodeFactoryTests {

    @Test
    public void IntegerCodeShouldReturnADigitsObject() {
        Object code = CodeFactory.getInstance(123);
        Digits expectedCode = new Digits(123);

        assertTrue(code instanceof Digits);
        assertTrue(expectedCode.equals(code));
    }

    @Test
    public void NumericCodeShouldReturnANullObject() {
        Object code = CodeFactory.getInstance("123");

        assertNull(code);
    }

}